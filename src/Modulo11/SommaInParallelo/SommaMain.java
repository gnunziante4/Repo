package Modulo11.SommaInParallelo;

public class SommaMain {


    public static void main(String[] args) throws InterruptedException {
       // System.out.println("arr1" + Arrays.toString(arr1));
        //System.out.println("arr2" + Arrays.toString(arr2))
        int size = 70000000;
        long start = System.currentTimeMillis();
        Generatore thg1 = new Generatore(size);
        Generatore thg2 = new Generatore(size);
        thg1.start();
        thg2.start();
        try {
            thg1.join();
            thg2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        SommaThread th1 = new SommaThread(thg1.getArr());
        SommaThread th2 = new SommaThread(thg2.getArr());
        th1.start();
        th2.start();
        try {
            th1.join();
            th2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(th1.getSum()+ th2.getSum());
        System.out.println(System.currentTimeMillis() - start + "ms");

        System.out.println("no multithreading");
        long start1 = System.currentTimeMillis();
        Generatore thg3 = new Generatore(size);
        Generatore thg4 = new Generatore(size);
        thg1.run();
        thg2.run();
        long[] arr3 = thg3.getArr();
        long[] arr4 = thg4.getArr();
        SommaThread th3 = new SommaThread(arr3);
        SommaThread th4 = new SommaThread(arr4);
        th3.run();
        th4.run();
        System.out.println(th3.getSum()+ th4.getSum());
        System.out.println(System.currentTimeMillis() - start1 + "ms");



    }




}
