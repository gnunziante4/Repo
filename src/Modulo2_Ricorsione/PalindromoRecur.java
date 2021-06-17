package Modulo2_Ricorsione;

import java.util.Arrays;

public class PalindromoRecur {

    public static void main(String[] args) {

        String strin="giovanni è innavoig ";
        System.out.println(palindroma(strin));
    }


        public static boolean checkPalindroma(String str){


            int lenStr = str.length();

            if (lenStr<=1){
                return true;
            }
            // 0 1 2 3 , la lunghezza è pari(4), inizio a fare il confronto dal mezzo ,
            // quindi da 1 e 2
            // poi faccio la sottostringa 0 3 con substring
            // e faccio il controllo mediante la ricorsione
            // perchè lo richiamo
            if(lenStr%2 == 0) {
                if (str.charAt(lenStr / 2 - 1) == str.charAt(lenStr / 2)) {
                    return checkPalindroma(str.substring(0, lenStr / 2 - 1) + str.substring(lenStr / 2 + 1, lenStr));
                }
            }
            // 0 1 2 3 4 , la lunghezza è dispari(5)
            // Nell'osservazione in cui la stringa palindroma non gliene frega cosa ci sia in mezzo
            // inizio a fare il confronto dal 1 e 3 ,
            // poi faccio la sottostringa 0 4 con substring, me lo perdo quello in mezzo
            // e faccio il controllo mediante la ricorsione
            // perchè lo richiamo
            else {
                if (str.charAt(lenStr / 2 - 1) == str.charAt(lenStr / 2 + 1)) {
                    return checkPalindroma(str.substring(0, lenStr / 2 - 1) +
                            str.substring(lenStr / 2 + 2, lenStr));
                }
            }
       // è falso il check se non sono uguali le lettere
        return false;

        }

        public static String palindroma(String str) {

            if (checkPalindroma(str)) {
                return str + ": è palindroma";
            }else{
                return str + ": non è palindroma o non esiste";
            }
        }

}
