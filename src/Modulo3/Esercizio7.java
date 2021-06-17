package Modulo3;

public class Esercizio7 {

    public static void main(String[] args){
        String str="ciao";
        int strLen=str.length();
        char[] strSplit =  new char[str.length()];
        for (int i = strLen - 1; i >= 0; i--) {
            //poiche mi chiamo un metdo di String che me li cambia in char
            //anche strSplit deve essere u rray di char
        strSplit[i]=str.charAt(strLen-i);
        }
        //metodo che converte array di char in stringa
        String strRev = String.valueOf(strSplit);
        //me lo stampo
        System.out.println(strRev);
    }
}
