
package Modulo7.TinderLike;

import java.util.LinkedHashMap;
import java.util.Map;

public class TinderMain {

    public static void main(String[] args) {
        TinderGestore tinder = new TinderGestore();

        Utenti u1 = new Utenti("Tizio");
        Utenti u2 = new Utenti("Caio");
        Utenti u3= new Utenti("Sempronia");
        Utenti u4 = new Utenti("Genoveffa");

        Interessi interesse = new Interessi(TipoInteressi.MUSICA,"amo la musica");
        Interessi interesse2 = new Interessi(TipoInteressi.VIAGGI,"amo i viaggi");
        Interessi interesse3 = new Interessi(TipoInteressi.GATTI,"amo i gatti");
        Interessi interesse4 = new Interessi(TipoInteressi.SERIETELEVISIVE,"serie che bello");
        Interessi interesse5 = new Interessi(TipoInteressi.VIDEOGIOCHI,"amo i gatti");
        Interessi interesse6 = new Interessi(TipoInteressi.CANI,"amo i gatti");
        Interessi interesse7 = new Interessi(TipoInteressi.SPORT,"amo lo sport");


        tinder.aggiungiUtente(u1);
        tinder.aggiungiUtente(u2);
        tinder.aggiungiUtente(u3);
        tinder.aggiungiUtente(u4);

        tinder.aggiungiInteresse(u1,interesse);
        tinder.aggiungiInteresse(u1,interesse2);
        tinder.aggiungiInteresse(u1,interesse3);

        tinder.aggiungiInteresse(u2,interesse4);
        tinder.aggiungiInteresse(u2,interesse5);
        tinder.aggiungiInteresse(u2,interesse6);

        tinder.aggiungiInteresse(u3,interesse);
        tinder.aggiungiInteresse(u3,interesse2);

        tinder.aggiungiInteresse(u4,interesse7);
        tinder.aggiungiInteresse(u4,interesse5);
        System.out.println(tinder);

        //System.out.println(tinder.interessiComuni(u2).getNomeUtente());

       /* Map<Utenti,Integer> mapInteressi =tinder.mappaInteressiComuni(u1);

        for (Map.Entry<Utenti,Integer> entry : mapInteressi.entrySet()){
            System.out.println(entry.getKey().getNomeUtente() + " " + entry.getValue());
        }

        System.out.println(tinder.migliorMatch(u1).getNomeUtente());
*/

    }



}

