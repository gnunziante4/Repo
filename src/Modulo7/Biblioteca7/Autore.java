package Modulo7.Biblioteca7;

import java.util.Set;
import java.util.TreeSet;

public class Autore {

    private String nomeAutore;
    private String cognomeAutore;
    private int codiceAutore;
    private static int count = 0;
    private Set<Libro> libriAutore = new TreeSet<>();

    public Autore(String nomeAutore, String cognomeAutore) {
        setNomeAutore(nomeAutore);
        setCognomeAutore(cognomeAutore);
        setCodiceAutore(count++);
    }

    public String getNomeAutore() {
        return nomeAutore;
    }

    public void setNomeAutore(String nomeAutore) {
        this.nomeAutore = nomeAutore;
    }

    public String getCognomeAutore() {
        return cognomeAutore;
    }

    public void setCognomeAutore(String cognomeAutore) {
        this.cognomeAutore = cognomeAutore;
    }

    public int getCodiceAutore() {
        return codiceAutore;
    }

    public void setCodiceAutore(int codiceAutore) {
        this.codiceAutore = codiceAutore;
    }

    public Set<Libro> getLibriAutore() {
        return libriAutore;
    }

    public void setLibriAutore(Set<Libro> libriAutore) {
        this.libriAutore = libriAutore;
    }
}
