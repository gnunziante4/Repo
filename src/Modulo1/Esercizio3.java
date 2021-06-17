
package Modulo1;

public class Esercizio3 {

    public static void main(String[] args) {

        String str = "come mai zio esce di casa presto";

        String[] strSplit = str.split(" ");
        for (int i = strSplit.length - 1; i >= 0; i--) {
            System.out.print(strSplit[i] + " ");
        }
    }
    }
