package JustDelivery;

import java.util.Objects;
import java.util.UUID;

public class Utenti{

    private String nomeUtente;
    private String cognomeUtente;
    private String usernameUtente;
    private final UUID idUtente;

    public Utenti(UUID idUtente,String nomeUtente, String cognomeUtente, String usernameUtente) {
        setNomeUtente(nomeUtente);
        setCognomeUtente(cognomeUtente);
        setUsernameUtente(usernameUtente);
        this.idUtente = idUtente;
    }

    public Utenti(UUID idUtente) {
        setNomeUtente(nomeUtente);
        setCognomeUtente(cognomeUtente);
        setUsernameUtente(usernameUtente);
        this.idUtente = idUtente;
    }


    public Utenti(String nomeUtente, String cognomeUtente, String usernameUtente) {
        setNomeUtente(nomeUtente);
        setCognomeUtente(cognomeUtente);
        setUsernameUtente(usernameUtente);
        idUtente = UUID.randomUUID();
    }

    public String getNomeUtente() {
        return nomeUtente;
    }

    public void setNomeUtente(String nomeUtente) {
        this.nomeUtente = nomeUtente;
    }

    public String getCognomeUtente() {
        return cognomeUtente;
    }

    public void setCognomeUtente(String cognomeUtente) {
        this.cognomeUtente = cognomeUtente;
    }

    public String getUsernameUtente() {
        return usernameUtente;
    }

    public void setUsernameUtente(String usernameUtente)   {
        this.usernameUtente = usernameUtente;
    }

    public UUID getIdUtente() {
        return idUtente;
    }

    @Override
    public String toString() {
        return "{"+"nome:'" + nomeUtente + '\'' +
                ", cognome='" + cognomeUtente + '\'' +
                ", username='" + usernameUtente + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Utenti utenti = (Utenti) o;
        return Objects.equals(idUtente, utenti.idUtente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUtente);
    }




}
