package Modulo7.Fila;

import java.util.Objects;

public class ClientiFila  implements Comparable<ClientiFila> {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClientiFila that = (ClientiFila) o;
        return età == that.età && id == that.id
                && Objects.equals(nome, that.nome)
                && Objects.equals(cognome, that.cognome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cognome, età, id);
    }

    private String nome;
    private String cognome;
    private int età;
    private int id;
    private int count = 0;


    public ClientiFila(String nome, String cognome, int età) {
        setCognome(cognome);
        setNome(nome);
        setEtà(età);
        setId(count++);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getEtà() {
        return età;
    }

    public void setEtà(int età) {
        this.età = età;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(ClientiFila c) {
        int result = 0;
        if (this.età > c.età) {
            result = -1;
        } else if (this.età < c.età) {
            result = 1;
        }else {
            result = 0;
        }
        if (result==0){
            if (this.id > c.id) {
                result = 1;
            } else if (this.id < c.id) {
                result = -1;
            }else {
                result = 0;
            }
        }
        return result;
    }


}
