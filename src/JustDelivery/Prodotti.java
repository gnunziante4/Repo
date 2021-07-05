package JustDelivery;

import java.util.UUID;

public class Prodotti {

    private String nomeprodotto;
    private final UUID id;
    private double prezzo;
    private Tipocucina tipocucina;

    public Prodotti(Tipocucina tipocucina,String nomeprodotto, UUID id, double prezzo) {
        this.nomeprodotto = nomeprodotto;
        this.id = id;
        this.prezzo = prezzo;
        setTipocucina(tipocucina);
    }
    public Prodotti(Tipocucina tipocucina,String nomeprodotto, double prezzo) {
        this.nomeprodotto = nomeprodotto;
        this.id = UUID.randomUUID();
        this.prezzo = prezzo;
        setTipocucina(tipocucina);
    }

    public String getNomeprodotto() {
        return nomeprodotto;
    }

    public void setNomeprodotto(String nomeprodotto) {
        this.nomeprodotto = nomeprodotto;
    }

    public UUID getId() {
        return id;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public Tipocucina getTipocucina() {
        return tipocucina;
    }

    public void setTipocucina(Tipocucina tipocucina) {
        this.tipocucina = tipocucina;
    }

    @Override
    public String toString() {
        return "Prodotti{" +
                "nomeprodotto='" + nomeprodotto + '\'' +
                ", prezzo=" + prezzo +
                '}';
    }
}
