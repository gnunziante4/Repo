package Modulo3;

import java.util.Scanner;

public class Esercizio9 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Dammi un intero per calcolarne il fattoriale:");
        int a = scan.nextInt();
        int i = 1;
        long fact = 1;
        while (i <= a) {
            fact = fact * i;
            i = i+1;
        }
        System.out.print(a + "!= " + fact);
    }
}
