package JustDelivery;

import JustDelivery.Exception.*;
import java.util.*;

public class Ristoranti {

    private final UUID id;
    private String nomeRistorante;
    private Map<Menu,Set<Tipocucina>> mapMenuCucine;


    public Ristoranti(String nomeRistorante) {
        this.id = UUID.randomUUID();
        setNomeRistorante(nomeRistorante);
        setMapMenuCucine(mapMenuCucine);
    }

    public Map<Menu,Set<Tipocucina>> getMapMenuCucine() {
        return mapMenuCucine;
    }
    public void setMapMenuCucine(Map<Menu,Set<Tipocucina>> mapMenuCucine) {
        this.mapMenuCucine = new HashMap<>();
    }

    public void addMenu(Menu menu){
        Set<Tipocucina> setTipoCucine = new HashSet<>();
        mapMenuCucine.put(menu,setTipoCucine);
            Set<Prodotti> prodottiLocal = menu.getProdotti();
            for(Prodotti prodotti : prodottiLocal){
              Tipocucina tc =  prodotti.getTipocucina();
              setTipoCucine.add(tc);
            }
        mapMenuCucine.put(menu,setTipoCucine);
    }

    public void rimuoviMenu(Menu menu) {
            mapMenuCucine.remove(menu);
    }



    public UUID getId() {
        return id;
    }


    public String getNomeRistorante() {
        return nomeRistorante;
    }

    public void setNomeRistorante(String nomeRistorante) {
        this.nomeRistorante = nomeRistorante;
    }



    @Override
    public String toString() {
        return "{"+"Nome Ristorante:'" + nomeRistorante + '\'' +
                ", Cucina Ristorante:"  + mapMenuCucine.values() + "}" ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ristoranti that = (Ristoranti) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
