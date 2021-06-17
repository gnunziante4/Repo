package Modulo3;

public class Esercizio10 {

    public static void main(String[] args){
        int n=5;
        double somma = 1;
        for (int i = 2;i<=n;i++){
            somma= somma + (double)1/i;
        }
        System.out.print("H("+n+")= "+ somma);
    }
}
