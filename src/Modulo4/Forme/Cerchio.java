package Modulo4.Forme;

public class Cerchio {

    private double raggio;
    private TipoColore colore;
    //quindi colore lo possono ereditare da una superclasse
    //in modo che posso mantenerlo private e non devo definirlo ogni volta
    //all'interno della superclasse mi definisco tutto come dio comanda
    //
    //provarlo a fare
    public TipoColore getColore() {
        return colore;
    }

    public void setColore(TipoColore colore) {
        this.colore = colore;
    }

    public double getRaggio() {
        return raggio;
    }

    public void setRaggio(double raggio) {
        this.raggio = raggio;
    }

    public Cerchio(double raggio,TipoColore colore){
        setRaggio(raggio);
        setColore(colore);
    }

    public double perimetro(){return 2*this.raggio * Math.PI;}
    public double area(){return this.raggio *this.raggio * Math.PI;}



}
