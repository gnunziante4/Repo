package Modulo1;

public class Esercizio5 {
    public static void main(String[] args) {
        String a = "tizo";
        String b = "zzz";
        String c = "yyy";
        String d = "tizo";
        String e = "bop";
        String f = "bop";
        a = a.toLowerCase();
        b = b.toLowerCase();
        c = c.toLowerCase();
        d = a.toLowerCase();
        e = b.toLowerCase();
        f = c.toLowerCase();
        //li introduco in un array di stringhe
        String[] strArray =  new String[]{a,b,c,d,e,f};
        int lungh=strArray.length;
        //faccio il controllo
        int count=0;
        for (int i = 0;i<lungh;i++){
            if (strArray[i]==a){
                count=count + 1;
            }
            i=i+1;
        }
        System.out.print(count);
    }
}
