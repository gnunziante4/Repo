package Modulo1;

public class Esercizio4 {

    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = "a zaca b";
        //la splitto per ogni spazio, importante il limite che sono 3
        String[] csplit =  c.split(" ");
        // posso vedere che si ha un array
        System.out.println(csplit[1]);
        //ora rimpiazzo in c
        String cnuova= csplit[0] + ' ' + csplit[1].replaceAll(a,b) + ' ' + csplit[2];
        System.out.print(cnuova);
    }
}
