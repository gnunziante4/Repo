package Modulo_2_2;

import java.util.Arrays;

public class Esercizio16 {
    public static void main(String[] args) {
        String str1 = "icco";
        String str2 = "coci";
        System.out.println(confronto(str1,str2));
    }
    public static  String confronto(String str1, String str2) {
        //numero caratteri
        int strLen1 = str1.length();
        int strLen2 = str2.length();
        if (strLen1!=strLen2){
            return "numero lettere diverse";
        }
        //trasformo stringa in ASCII dec
        int[] decArr1 = new int[strLen1];
        int[] decArr2 = new int[strLen1];

        for (int i = 0; i < strLen1; i++) {
            decArr1[i] = str1.charAt(i);
            decArr2[i] = str2.charAt(i);
        }
        //ordino i due array

        Arrays.sort(decArr1);
        Arrays.sort(decArr2);

        //li confronto

        if (Arrays.equals(decArr1, decArr2) == true) {
           return "sono anagrammi";
        } else {
            return "non sono anagrammi" ;
        }

    }
}


/*
    public static String anaTest(String str){

    }
    *//*

}
*/
