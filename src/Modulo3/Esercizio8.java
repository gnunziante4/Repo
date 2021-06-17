package Modulo3;

public class Esercizio8 {
    public static void main(String[] args) {
        int a = 7;
        int i = 2;
//controllo per quando si esce dal while e dice che non ha trovato divisori
        int flag = 0;
        if (a == 1 || a == 2) {
            System.out.println(a + " è primo ");
        } else {
            while (i <= a) {
                if (a % i == 0) {
                    System.out.println(a + "non primo");
                    flag = 1;
                    break;
                }
                i = i + 1;
                if (flag == 1) {
                    System.out.println(a + "primo");
                }
            }
        }
    }
}
