package JustDelivery;

public enum Tipocucina {

    ASIATICA(1,"Asiatica"),PIZZERIA(2,"Pizzeria"),PESCE(3,"Pesce");


    private final int id;
    private final String tipocucina;

    Tipocucina(int id, String tipocucina) {
        this.id = id;
        this.tipocucina = tipocucina;
    }

    public int getId() {
        return id;
    }

    public String getStrTipocucina() {
        return tipocucina;
    }

    @Override
    public String toString() {
        return tipocucina;
    }
}
