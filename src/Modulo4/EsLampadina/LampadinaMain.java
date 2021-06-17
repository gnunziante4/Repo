package Modulo4.EsLampadina;
import java.util.Scanner;
public class LampadinaMain {

    public static void main(String[] args) {
        int maxClick = 5;
        int numClick = 10;
        // Lampadina l1 = new Lampadina(TipoStatoLampadina.on,maxClick,false);
        //controllo lamp rotta
    /*    System.out.println("Controllo lampadina rotta");
        System.out.println("Stato iniziale");
        System.out.println(l1.getStatus());
        System.out.println("----------------");
        for (int i = 0 ; i<numClick;i++) {
            l1.cambiaStato();
            System.out.println(l1.getStatus());
        }*/
//controllo Interruttore
     /*Lampadina l = new Lampadina(TipoStatoLampadina.on,maxClick, false);
        Interruttore inter = new Interruttore(l);
        System.out.println("Controllo lampadina rotta");
        System.out.println("Stato iniziale");
        System.out.println(l.getStatus());
        System.out.println("----------------");
        for (int i = 0 ; i<numClick;i++) {
            inter.premiBottone();
            System.out.println(l.getStatus());
        }*/
        //test 1 Interuttore
        Lampadina l = new Lampadina(TipoStatoLampadina.on, maxClick, true);
        System.out.println("Stato Lampadina "+l.getStatus());
        Interruttore inter1 = new Interruttore(l);
        Interruttore inter2 = new Interruttore(l);
        Scanner sc = new Scanner(System.in);
        boolean scelta = true;
        while (scelta){
        System.out.println("Premi 1 per l'interruttore off o 2 per l'interruttore on, mentre 0 per uscire");
        int numInt = sc.nextInt();
        switch (numInt){
            case 1:
                if (l.getStatus() == TipoStatoLampadina.on){
                    inter1.premiBottone();
                    System.out.println("Int 1 " + l.getStatus());
                }else{
                    System.out.println(l.getStatus());
                }
                break;
            case 2:
                if (l.getStatus() == TipoStatoLampadina.off){
                    inter2.premiBottone();
                    System.out.println("Int 2 " + l.getStatus());
                }else{
                    System.out.println(l.getStatus());
                }
                break;
            case 0:
                scelta = false;
                break;
        }

    }
}

}
