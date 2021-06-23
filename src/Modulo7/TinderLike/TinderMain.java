
package Modulo7.TinderLike;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class TinderMain {

    public static void main(String[] args) {
        TinderGestore tinder = new TinderGestore();

        Utenti u1 = new Utenti("Tizio");
        Utenti u2 = new Utenti("Caio");
        Utenti u3= new Utenti("Sempronia");
        Utenti u4 = new Utenti("Genoveffa");


        tinder.aggiungiUtente(u1);
        tinder.aggiungiUtente(u2);
        tinder.aggiungiUtente(u3);
        tinder.aggiungiUtente(u4);

        tinder.aggiungiInteresse(u1,TipoInteressi.MUSICA);
        tinder.aggiungiInteresse(u1,TipoInteressi.VIAGGI);
        tinder.aggiungiInteresse(u1,TipoInteressi.GATTI);

        tinder.aggiungiInteresse(u2,TipoInteressi.SERIETELEVISIVE);
        tinder.aggiungiInteresse(u2,TipoInteressi.VIDEOGIOCHI);
        tinder.aggiungiInteresse(u2,TipoInteressi.CANI);

        tinder.aggiungiInteresse(u3,TipoInteressi.MUSICA);
        tinder.aggiungiInteresse(u3,TipoInteressi.VIAGGI);

        tinder.aggiungiInteresse(u4,TipoInteressi.SPORT);
        tinder.aggiungiInteresse(u4,TipoInteressi.VIDEOGIOCHI);
        tinder.aggiungiInteresse(u4,TipoInteressi.LEGGERE);
        //System.out.println(tinder);

        //System.out.println(tinder.interessiComuni(u2).getNomeUtente());

        Map<Utenti,Integer> mapInteressi = new LinkedHashMap<>(tinder.mappaInteressiComuni(u1));

        for (Map.Entry<Utenti,Integer> entry : mapInteressi.entrySet()){
            System.out.println(entry.getKey().getNomeUtente() + " " + entry.getValue());
        }

        System.out.println(tinder.migliorMatch(u1).getNomeUtente());


    }



}

