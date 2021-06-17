package Modulo1;

import java.util.Scanner;

public class Esercizio1 {

    public static void main(String[] args) {
        System.out.println("Ti ricordo che a,b e gli output sono interi");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a:");
        int a=sc.nextInt();
        System.out.print("Enter b:");
        int b=sc.nextInt();
        int sommma=a+b;
        System.out.println("a+b " + sommma);
        int diff=a-b;
        System.out.println("a-b " + diff);
        int molt=a*b;
        System.out.println("a*b " + molt);
        double div=a/(double)b;
        System.out.println("a/b: "+ div);
        double div1=b/(double)a;
        System.out.print("b/a: "+ div1);
    }

}


