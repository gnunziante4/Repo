package Modulo_2_2;

public class Esercizio15 {

    public static void main(String[] args) {

        System.out.println(fibonacci(5));

    }

    public static int fibonacci(int n) {

        if (n<=1){
            return n;
        }
        int temp;
        int prevFib=0;
        int fib=1;
        for (int i=0;i<=n-2;i++){
            //memorizzo il fibonacci nuovo che mi serve per definire il precedente al successivo step
            temp=fib;
            //il nuovo fib è la somma tra quelli impostati
            fib = fib+ prevFib;
            //il precedente diviene il fibonacci precedente
            prevFib=temp;
        }
        return fib;
    }
}
