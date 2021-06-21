package Modulo7.Biblioteca7;

import Modulo7.Fila.ClientiFila;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Autore implements Comparable<Autore>{

    private String nomeAutore;
    private int codiceAutore;
    private static int count = 0;

    public Autore(String nomeAutore) {
        setNomeAutore(nomeAutore);
        setCodiceAutore(count++);
    }

    public String getNomeAutore() {
        return nomeAutore;
    }

    public void setNomeAutore(String nomeAutore) {
        this.nomeAutore = nomeAutore;
    }


    public int getCodiceAutore() {
        return codiceAutore;
    }

    public void setCodiceAutore(int codiceAutore) {
        this.codiceAutore = codiceAutore;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Autore autore = (Autore) o;
        return codiceAutore == autore.codiceAutore && Objects.equals(nomeAutore, autore.nomeAutore);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeAutore, codiceAutore);
    }

    @Override
    public int compareTo(Autore a) {
        int result = nomeAutore.compareTo(a.nomeAutore);
        if (result == 0){
            result = Integer.compare(codiceAutore,a.codiceAutore);
        }
        return result;
    }

}
