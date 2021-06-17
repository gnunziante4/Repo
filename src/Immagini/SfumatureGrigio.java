package Immagini;


import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

import static javax.imageio.ImageIO.write;

public class SfumatureGrigio {

    public static void main(String[] args) throws Exception{
        BufferedImage outputImage = new BufferedImage(256, 256, BufferedImage.TYPE_3BYTE_BGR);
        int max;
        for (int col = 0; col < outputImage.getWidth(); col++)
        {
            for (int row = 0; row < outputImage.getHeight(); row++) {
                if(col>row){
                    max = col;
                }else{
                    max=row;
                }
                Color pixel = new Color(max, max, max);
                outputImage.setRGB(col, row, pixel.getRGB());
            }
        }
        ImageIO.write(outputImage, "jpg", new File("sfumature_grigio.jpg"));
    }


}
