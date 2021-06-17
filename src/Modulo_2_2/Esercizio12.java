package Modulo_2_2;

public class Esercizio12 {

    public static void main(String[] args){

        System.out.println(ore(3600));

    }
    public static String ore(int secondi){

       return "Giorni " + secondi/(double)86400 + " Ore:" +
               secondi/(double)3600 + " Minuti:" + secondi/(double)60
               + " Secondi:" + secondi ;
    }
}


