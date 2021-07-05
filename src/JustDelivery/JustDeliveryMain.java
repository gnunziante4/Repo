package JustDelivery;

import JustDelivery.Exception.*;

import java.util.UUID;

public class JustDeliveryMain {

    public static void main(String[] args) throws InvalidRestaurantException, YetExistedRestaurantException, YetUsedUsernameException, InvalidUserException {


        Utenti u1 = new Utenti("Tizio", "Caio", "tiziocaio");
        Utenti u2 = new Utenti("Sempronio", "Caio", "semproniocaio");
        //avranno due codici identificativi diversi se li istanzio due volte
        Menu menu = new Menu();
        Menu menu1 = new Menu();
        Prodotti prod1 = new Prodotti(Tipocucina.PIZZERIA, "Margherita", 3.5);
        Prodotti prod2 = new Prodotti(Tipocucina.PIZZERIA, "Napoletana", 3.0);
        Prodotti prod3 = new Prodotti(Tipocucina.PESCE, "Pesce1", 3);
        Prodotti prod4 = new Prodotti(Tipocucina.PESCE, "Pesce2", 4);
        Prodotti prod5 = new Prodotti(Tipocucina.PIZZERIA, "Cilentana", 5.0);
        menu.aggiungiProdotto(prod1);
        menu.aggiungiProdotto(prod2);
        menu1.aggiungiProdotto(prod4);
        menu1.aggiungiProdotto(prod5);
        menu1.aggiungiProdotto(prod3);
        Ristoranti r1 = new Ristoranti("PizzeriaPescheria");
        Ristoranti r2 = new Ristoranti("Pizzeria1");


        JustDeliveryGestore justdel = JustDeliveryGestore.getInstance();

        try {
            justdel.addRistoranti(r1);
            justdel.addRistoranti(r2);
            justdel.addUtenti(u1);
            justdel.addUtenti(u2);
            justdel.addMenuRistorante(r1,menu1);
            justdel.addMenuRistorante(r2,menu);
            System.out.println(justdel.getRistoranti());
            System.out.println(justdel.cercaRistorantiPerCucina(Tipocucina.PESCE));
            System.out.println("prova eliminazione");

        } catch ( NotExistingCuisineException|YetExistedMenuException | YetExistedUserException | InvalidUserException | InvalidRestaurantException | YetUsedUsernameException | YetExistedRestaurantException e) {
            System.out.println(e);
        }
    }
}
