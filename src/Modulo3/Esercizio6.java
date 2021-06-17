package Modulo3;

public class Esercizio6 {

    public static void main(String[] args) {
        char a = 'a';
        String b = "aatiina";
        int count = 0;
        for (int i = 0; i < b.length();i++) {
            if ( b.charAt(i) == a ) {
                count = count + 1;
            }
            i++;
        }
        System.out.println(count);
    }
}
