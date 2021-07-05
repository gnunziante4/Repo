package JustDelivery;

import java.util.*;

public class Menu {

    private Set<Prodotti> prodotti;
    private final UUID id;



    public Menu(UUID id) {
        this.id = id;
        setProdotti(prodotti);
    }

    public Menu()  {
        this.id = UUID.randomUUID();
        setProdotti(prodotti);
    }

    public void aggiungiProdotto(Prodotti prodotto){
        prodotti.add(prodotto);
    }

    public UUID getId() {
        return id;
    }


    public Set<Prodotti> getProdotti() {
        return prodotti;
    }

    public void setProdotti(Set<Prodotti> prodotti) {
        this.prodotti = new HashSet<>();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Menu menu = (Menu) o;
        return Objects.equals(id, menu.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
