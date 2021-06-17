package Modulo3;

public class Esercizio11 {

    public static void main(String[] args) {
        String str = "anna";
        int size = str.length();
        //System.out.print(size/2 - 1) ;
        int i = 0;
        int flag = 0;
        while (i < (size)/2  ) {
            if (str.charAt(i) == str.charAt(size - i -1 )) {
                    flag=0;
            } else {
                flag = 1;
                System.out.println("no palindromo");
            }
            i++;
        }
        if (flag == 0) {
            System.out.println("palindromo");
        }
    }
}
