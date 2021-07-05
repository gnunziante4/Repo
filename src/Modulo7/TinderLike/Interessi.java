package Modulo7.TinderLike;

public class Interessi {

    private TipoInteressi tipoInteressi;
    private String descrizione;


    public Interessi(TipoInteressi tipoInteressi, String descrizione) {
        this.tipoInteressi = tipoInteressi;
        this.descrizione = descrizione;
    }

    public TipoInteressi getTipoInteressi() {
        return tipoInteressi;
    }

    public void setTipoInteressi(TipoInteressi tipoInteressi) {
        this.tipoInteressi = tipoInteressi;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }
}
