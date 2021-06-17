package Immagini;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Arrays;
import java.lang.Math;

public class Filtri {


    public static void main(String[] args) throws Exception {
        File file = new File("freaked.jpg");
        BufferedImage immagine = ImageIO.read(file);
        BufferedImage imgPosterized = filtroPosterized(immagine,6);
        ImageIO.write(imgPosterized, "jpg", new File("filtro_posterized.jpg"));

    }


    public static BufferedImage FiltroBiancoNero(BufferedImage imgInput) {
        Color pixel;
        int red, blue, green, newRed, newBlue, newGreen, linRed, linBlue, linGreen;
        for (int col = 0; col < imgInput.getWidth(); col++) {
            for (int row = 0; row < imgInput.getHeight(); row++) {
                pixel = new Color(imgInput.getRGB(col, row));
                red = pixel.getRed();
                blue = pixel.getBlue();
                green = pixel.getGreen();
                //  System.out.println(red + " " + blue + " " + green);
                linRed = red * 77;
                linGreen = green * 150;
                linBlue = blue * 28;
                //  System.out.println(linRed + " " + linBlue + " " + linGreen);
                newRed = (linRed / 255);
                newBlue = (linBlue / 255);
                newGreen = (linGreen / 255);
                //   System.out.println(newRed + " " + newBlue + " " + newGreen);
                //media pesata con 255 cme num di elem e pesi 77 150 28
                Color newPixel = new Color(newRed + newGreen + newBlue, newRed + newGreen + newBlue, newRed + newGreen + newBlue);
                imgInput.setRGB(col, row, newPixel.getRGB());
            }
        }
        return imgInput;
    }


    public static BufferedImage FiltroSpecchio(BufferedImage img) {
        Color oldPixel, specPixel;
        for (int col = 0; col < img.getWidth() / 2; col++) {
            for (int row = 0; row < img.getHeight(); row++) {
                //con questa versione prende poi per l'altra metà
                //il pixel già scambiato, perchè sto sovrascrivendo
                //quindi convienre fare o due immagini, in modo che evito questa cosa
                //oppure scambio i pixel, quello che farò
                //pixel = new Color(img.getRGB(col, row));
                // img.setRGB(img.getWidth() - col -1 , row, pixel.getRGB());
                oldPixel = new Color(img.getRGB(col, row));
                specPixel = new Color(img.getRGB(img.getWidth() - col - 1, row));
                img.setRGB(col, row, specPixel.getRGB());
                img.setRGB(img.getWidth() - col - 1, row, oldPixel.getRGB());
            }
        }
        return img;
    }


    public static BufferedImage FiltroGBR(BufferedImage img) {
        Color pixel;
        int red, green,newRed, newGreen;
        for (int col = 0; col < img.getWidth(); col++) {
            for (int row = 0; row < img.getHeight(); row++) {
                pixel = new Color(img.getRGB(col, row));
                red = pixel.getRed();
                green = pixel.getGreen();
                //
                newRed = green;
                newGreen = red;
                Color newPixel = new Color(newRed , pixel.getBlue(),newGreen) ;
                img.setRGB(col, row, newPixel.getRGB());
            }
        }
        return img;
    }


    public static BufferedImage FiltroNeg(BufferedImage img) {
        Color pixel;
        int red, blue,green,newRed, newBlue,newGreen;
        for (int col = 0; col < img.getWidth(); col++) {
            for (int row = 0; row < img.getHeight(); row++) {
                pixel = new Color(img.getRGB(col, row));
                red = pixel.getRed();
                blue= pixel.getBlue();
                green = pixel.getGreen();
                //
                newRed = 255 - red;
                newBlue = 255 - blue ;
                newGreen = 255 - green ;
                Color newPixel = new Color(newRed , newBlue,newGreen) ;
                img.setRGB(col, row, newPixel.getRGB());
            }
        }
        return img;
    }

    public static BufferedImage filtroPosterized(BufferedImage img, int nLevels){
        Color pixel;
        int[] levels = new int[nLevels];
        int[] difflevelsRed = new int[nLevels];
        int[] difflevelsBlue= new int[nLevels];
        int[] difflevelsGreen = new int[nLevels];
        int red, blue,green,newRed, newBlue,newGreen;
        // livelli disponibili
        for (int i = 0 ; i<nLevels;i++){
            levels[i] = i* 255/nLevels;
        }
//modifica immagine
        for (int col = 0; col < img.getWidth(); col++) {
            for (int row = 0; row < img.getHeight(); row++) {
                pixel = new Color(img.getRGB(col, row));
                red = pixel.getRed();
                blue= pixel.getBlue();
                green = pixel.getGreen();
                //array con distanze per RGB
                for (int i = 0 ; i<nLevels;i++){
                    difflevelsRed[i] = Math.abs(red - levels[i]);
                    difflevelsBlue[i] = Math.abs(blue - levels[i]);
                    difflevelsGreen[i] = Math.abs(green - levels[i]);

                }
                //i nuovi colori sono pari al più vicino livello quantizzato, per questo ho fatto il minimo
              newRed =  levels[indMin(difflevelsRed)];
                newBlue =  levels[indMin(difflevelsBlue)];
                newGreen=  levels[indMin(difflevelsGreen)];

                Color newPixel = new Color(newRed , newBlue,newGreen) ;
                img.setRGB(col, row, newPixel.getRGB());
            }
        }
        return img;
    }

    public static int indMin(int[] inputArray){
        int minValue = inputArray[0];
        int tempIn=0;
        for(int i=1;i<inputArray.length;i++){
            if(inputArray[i] < minValue){
                minValue = inputArray[i];
                tempIn = i;
            }
        }
        return tempIn;
    }
}
