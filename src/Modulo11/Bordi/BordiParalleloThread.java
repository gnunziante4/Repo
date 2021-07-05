package Modulo11.Bordi;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class BordiParalleloThread extends Thread {

    private BufferedImage inputImage;
    private BufferedImage outputImage;
    private int startColonna;
    private int startRigha;
    private int endColonna;
    private int endRigha;


    public BordiParalleloThread(BufferedImage inputImage, BufferedImage outputImage,
                                int startRigha, int endRigha, int startColonna, int endColonna) throws IOException {
        this.inputImage = inputImage;
this.outputImage = outputImage;
this.endRigha=endRigha;
        this.endColonna=endColonna;
        this.startColonna=startColonna;
        this.startRigha=startRigha;
    }


    @Override
    public void run() {


    /*
    Creo i due colori che utilizzerò per l'immagine finale
     */
        Color black = new Color(0, 0, 0);
        Color white = new Color(255, 255, 255);


        for (int i = startColonna; i < endColonna; i++)
            for (int j = startRigha; j < endRigha; j++) //itero sui pixel dell'immagine
            {
                double sumNeighboors = 0;
                Color currentPixel = new Color(inputImage.getRGB(i, j));

                /*
                      | n | n | n |
                      | n | p | n |
                      | n | n | n |

                      In questo loop calcolo la distanza del pixel con ogni suo vicino e sommo
                 */
                for (int internalI = -1; internalI < 2; internalI++)
                    for (int internalJ = -1; internalJ < 2; internalJ++) {
                        //Controlli per vedere se il vicino è fuori matrice
                        if (internalI == 0 && internalI == internalJ)
                            continue;
                        int neighboorI = i + internalI;
                        if (neighboorI < 0 || neighboorI >= inputImage.getWidth())
                            continue;
                        int neighboorJ = j + internalJ;
                        if (neighboorJ < 0 || neighboorJ >= inputImage.getHeight())
                            continue;


                        Color pendingPixel = new Color(inputImage.getRGB(neighboorI, neighboorJ));
                        sumNeighboors += colorDistance(currentPixel, pendingPixel);
                    }

                //Se la differenza con i vicini è alta, abbiamo un bordo
                if (sumNeighboors > 255)
                    outputImage.setRGB(i, j, black.getRGB());
                else
                    outputImage.setRGB(i, j, white.getRGB());
            }
    }

    private static double colorDistance(Color c1, Color c2) {
        int redDifference = c1.getRed() - c2.getRed();
        int greenDifference = c1.getGreen() - c2.getGreen();
        int blueDifference = c1.getBlue() - c2.getBlue();
        return Math.sqrt(Math.pow(redDifference, 2) + Math.pow(greenDifference, 2) + Math.pow(blueDifference, 2));
    }

    public int getStartColonna() {
        return startColonna;
    }

    public void setStartColonna(int startColonna) {
        this.startColonna = startColonna;
    }

    public int getStartRigha() {
        return startRigha;
    }

    public void setStartRigha(int startRigha) {
        this.startRigha = startRigha;
    }

    public int getEndColonna() {
        return endColonna;
    }

    public void setEndColonna(int endColonna) {
        this.endColonna = endColonna;
    }

    public int getEndRigha() {
        return endRigha;
    }

    public void setEndRigha(int endRigha) {
        this.endRigha = endRigha;
    }
}