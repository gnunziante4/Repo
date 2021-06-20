package Modulo7.Dizionario;

import java.util.*;

public class DizionarioMain {

    public static void main(String[] args) {

       Dizionario diz = new Dizionario();
       diz.inserisciParola("arma","utensile per offendere");
     diz.inserisciSignificato("arma","forza armata");
     diz.inserisciParola("calcio","elemento chimico");
     diz.inserisciSignificato("calcio","sport");
        diz.inserisciParola("carro","dei vincitori");
        diz.inserisciParola("carro","dei buoi");
        diz.inserisciParola("bolla","sfera che si forma in seguito all'ebollizione su un liquido");
        diz.inserisciSignificato("bolla","lesione cutanea causata da una ustione");
        diz.inserisciParola("dado","utensile per avvitare la vite");
        diz.inserisciParola("dado","insaporisce brodo");


        System.out.println(diz.toString());






    }


}
