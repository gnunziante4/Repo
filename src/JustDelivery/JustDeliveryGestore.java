package JustDelivery;

import JustDelivery.Exception.*;

import java.util.*;

public class JustDeliveryGestore {


    private final Set<Utenti> allUtenti;
    private final Set<Ristoranti> allRistoranti;


    //singleton
    private static JustDeliveryGestore justdel = null;

    private JustDeliveryGestore() {
        allUtenti = new HashSet<>();
        allRistoranti = new HashSet<>();
    }

    public static JustDeliveryGestore getInstance() {
        if (justdel == null) {
            justdel = new JustDeliveryGestore();
        }
        return justdel;
    }


    public boolean addUtenti(Utenti utente) throws YetExistedUserException, InvalidUserException, YetUsedUsernameException {
        if (utente == null) {
            throw new InvalidUserException();
        }
        if (allUtenti.contains(utente)) {
            throw new YetExistedUserException();
        }
        for (Utenti u : allUtenti) {
            if (u.getUsernameUtente() == utente.getUsernameUtente()) {
                throw new YetUsedUsernameException();
            }
        }
        return allUtenti.add(utente);
    }

    public boolean addRistoranti(Ristoranti ristorante)
            throws InvalidRestaurantException, YetExistedRestaurantException {
        if (ristorante == null) {
            throw new InvalidRestaurantException();
        }
        if (allRistoranti.contains(ristorante)) {
            throw new YetExistedRestaurantException();
        }
        return allRistoranti.add(ristorante);
    }

    public void addMenuRistorante(Ristoranti ristorante, Menu menu) throws YetExistedMenuException {
        for (Ristoranti r : allRistoranti) {
            if (r.equals(ristorante)) {
                Map<Menu,Set<Tipocucina>> map = r.getMapMenuCucine();
                if (map.containsKey(menu)){
                     throw new YetExistedMenuException();
                }
                r.addMenu(menu);
            }
        }
    }
//todo rimuoviMenu, ci sta solo un menu , aggiustarlo
  /*  public void rimuoviMenu(Ristoranti ristorante) throws NotExistingMenuException {
        for (Ristoranti r : allRistoranti) {
            if (r.equals(ristorante)) {
                Map<Menu,Set<Tipocucina>> map = r.getMapMenuCucine();
                r.rimuoviMenu(menu);
            }
        }
    */

   public Set<String> cercaRistorantiPerCucina(Tipocucina tipocucina) throws NotExistingCuisineException{
        Set<String> out = new HashSet<>();
        for(Ristoranti r : allRistoranti){
            Map<Menu,Set<Tipocucina>> map = r.getMapMenuCucine();
            for(Map.Entry<Menu,Set<Tipocucina>> en : map.entrySet()){
                Set<Tipocucina> tipocucine = en.getValue();
                if (tipocucine.contains(tipocucina)){
                    out.add(r.getNomeRistorante());
                }
            }
        }
        if (out.size()==0){throw new NotExistingCuisineException();}
        return out;
    }

    public Set<Utenti> getUtenti() {
        return allUtenti;
    }

    public Set<Ristoranti> getRistoranti() {
        return allRistoranti;
    }


}

