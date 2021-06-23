package Modulo7.Dizionario;

import java.util.*;

public class DizionarioMain {

    public static void main(String[] args) {

       Dizionario diz = new Dizionario();
       diz.inserisciParolaeSignificato("arma","utensile per offendere");
     diz.inserisciSignificato("arma","forza armata");
     diz.inserisciParolaeSignificato("calcio","elemento chimico");
     diz.inserisciParolaeSignificato("calcio","sport");
        diz.inserisciParolaeSignificato("carro","dei vincitori");
        diz.inserisciSignificato("carro","dei buoi");
        diz.inserisciParolaeSignificato("bolla","sfera che si forma in seguito all'ebollizione su un liquido");
        diz.inserisciSignificato("bolla","lesione cutanea causata da una ustione");
        diz.inserisciParolaeSignificato("dado","utensile per avvitare la vite");
        diz.inserisciSignificato("dado","insaporisce brodo");


        System.out.println(diz);






    }


}
