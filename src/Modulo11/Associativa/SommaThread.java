package Modulo11.Associativa;

public class SommaThread extends   Thread{

    private long[] arr;

    public SommaThread(long[] arr){
        this.arr=arr;
    }

    public long somma(long[] arr){
        long sum =0;
        for (int i =0;i<arr.length;i++){
            sum = sum + arr[i];
        }
        return sum;
    }

    public long getSum(){
        return somma(arr);
    }
    @Override
    public void run() {
        somma(arr);
    }
    }
