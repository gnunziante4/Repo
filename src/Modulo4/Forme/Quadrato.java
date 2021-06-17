package Modulo4.Forme;

public class Quadrato {

    private TipoColore colore;
    private double lato;

    public TipoColore getColore() {
        return colore;
    }

    public void setColore(TipoColore colore) {
        this.colore = colore;
    }


    public double getLato() { return lato; }

    public void setLato(double lato) {
        if (lato>0) {
            this.lato = lato;
        }
    }

    public Quadrato(double lato,TipoColore colore){ setLato(lato); setColore(colore); }

    public double perimetro(){return this.lato * 4;}
    public double area(){return this.lato * this.lato;}


}
