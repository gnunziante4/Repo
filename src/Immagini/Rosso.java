package Immagini;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

import static javax.imageio.ImageIO.write;

public class Rosso {

    public static void main(String[] args) throws Exception{
        BufferedImage outputImage = new BufferedImage(256, 256, BufferedImage.TYPE_3BYTE_BGR);
        int max;
        for (int col = 0; col < outputImage.getWidth(); col++) {
            for (int row = 0; row < outputImage.getHeight(); row++) {
                Color pixel = new Color(255, 0, 0);
                if (row == 3 && col == 2){
                    pixel = new Color(0, 0, 250);
                }
                if (row == 2 && col ==3){
                    pixel = new Color(85, 0, 0);
                }
                outputImage.setRGB(col, row, pixel.getRGB());
            }
        }
        ImageIO.write(outputImage, "png", new File("rosso.png"));
    }


}
