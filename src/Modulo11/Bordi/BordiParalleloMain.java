
package Modulo11.Bordi;

        import javax.imageio.ImageIO;
        import java.awt.image.BufferedImage;
        import java.io.File;
        import java.io.IOException;

public class BordiParalleloMain {



    public static void main(String[] args) throws IOException, InterruptedException {


        long startTime = System.currentTimeMillis();
        BufferedImage inputImage = null;
        try {
            inputImage = ImageIO.read(new File("gris.png")); //caricamento immagine
        } catch (IOException e) {
        }

        BufferedImage outputImage = new BufferedImage(inputImage.getWidth(), inputImage.getHeight(), BufferedImage.TYPE_4BYTE_ABGR);
        // creazione immagine output

        BordiParalleloThread th1 = new BordiParalleloThread(inputImage,outputImage,0, inputImage.getHeight() /2,0,inputImage.getWidth()/2);
        BordiParalleloThread th2 = new BordiParalleloThread(inputImage,outputImage,0, inputImage.getHeight() /2,inputImage.getWidth()/2,inputImage.getWidth());
        BordiParalleloThread th3 = new BordiParalleloThread(inputImage,outputImage,inputImage.getHeight() /2, inputImage.getHeight() ,0,inputImage.getWidth()/2);
        BordiParalleloThread th4 = new BordiParalleloThread(inputImage,outputImage,inputImage.getHeight() /2, inputImage.getHeight() ,inputImage.getWidth()/2,inputImage.getWidth());
        th1.start();
        th2.start();
        th3.start();
        th4.run();
        try {
          th1.join();
          th2.join();
            th3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            ImageIO.write(outputImage, "png", new File("outputImageThread.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(System.currentTimeMillis() - startTime);

    }

}