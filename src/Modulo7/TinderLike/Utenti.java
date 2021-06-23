package Modulo7.TinderLike;

public class Utenti {

    private int id;
    private static int count = 0;
    private String nomeUtente;

    public Utenti(String nomeUtente) {
        setId(count++);
        setNomeUtente(nomeUtente);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeUtente() {
        return nomeUtente;
    }

    public void setNomeUtente(String nomeUtente) {
        this.nomeUtente = nomeUtente;
    }

}
