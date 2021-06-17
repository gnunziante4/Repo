package Immagini;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class GreenScreen {

    public static void main(String[] args) throws Exception {
        File fileGS = new File("zeb89.jpg");
        BufferedImage imgGS = ImageIO.read(fileGS);
        File file1 = new File("aot.jpg");
        BufferedImage img = ImageIO.read(file1);
        //verde in zeb89, alemeno spero
        Color greenPixel = new Color(48, 255, 17);
        int tolleranza = 130;
        //sostituisco
        for (int col = 0; col < imgGS.getWidth(); col++) {
            for (int row = 0; row < imgGS.getHeight(); row++) {
                Color pixelGS = new Color(imgGS.getRGB(col, row));
                Color pixel = new Color(img.getRGB(col, row));
                //
                int redGS = pixelGS.getRed();
                int blueGS = pixelGS.getBlue();
                int greenGS = pixelGS.getGreen();
                //
                int redG = greenPixel.getRed();
                int blueG = greenPixel.getBlue();
                int greenG = greenPixel.getGreen();
                //se il pixel nella immagine da modificare, quindi col green  screen
                // ha un colore più vicino a quello del green screen
                //la sostituiamo con quella dello sfondo nuovo
                // impostando la tollerazna ho un range di (verdi) con cui potro sostituirli
                // con lo sfondo
                //troppo grande e sostituisco tutto
                //troppo piccolo, mi mancheranno alcuni verdi sullo sfondo
               if ( Math.pow(Math.pow((redGS - redG),2) + Math.pow((blueGS - blueG),2) +
                       Math.pow((greenGS - greenG),2),0.5 )<= tolleranza){
                  imgGS.setRGB(col, row, pixel.getRGB());
               } else{
                   imgGS.setRGB(col, row, pixelGS.getRGB());
               }

            }
        }
        ImageIO.write(imgGS, "jpg", new File("green_screeen.jpg"));
    }
}