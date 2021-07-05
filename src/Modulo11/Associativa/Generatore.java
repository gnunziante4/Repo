package Modulo11.Associativa;

import java.util.Random;

public class Generatore extends Thread {

    private int size;

    public Generatore(int size){
        this.size = size;
    }

    public long[] getArr(){
        return arrGen(size);
    }

    public long[] arrGen(int size) {
        Random rdm = new Random();
        long[] arr = new long[size];
        for (int i = 0; i < size; i++) {
            arr[i] = -10 + rdm.nextInt(21);
        }
        return arr;
    }

    @Override
    public void run(){
        arrGen(size);
        }
    }




