package Modulo7.Biblioteca7;

import java.util.Objects;

public class Libro implements Comparable<Libro> {

    private String nomeLibro;
    private String sinossiLibro;
    private int codiceLibro;

    public Libro(int codiceLibro,String nomeLibro, String sinossiLibro) {
        setCodiceLibro(codiceLibro);
        setNomeLibro(nomeLibro);
        setSinossiLibro(sinossiLibro);
    }


    public int getCodiceLibro() {
        return codiceLibro;
    }

    public void setCodiceLibro(int codiceLibro) {
        this.codiceLibro = codiceLibro;
    }

    public String getNomeLibro() {
        return nomeLibro;
    }

    public void setNomeLibro(String nomeLibro) {
        this.nomeLibro = nomeLibro;
    }

    public String getSinossiLibro() {
        return sinossiLibro;
    }

    public void setSinossiLibro(String sinossiLibro) {
        this.sinossiLibro = sinossiLibro;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return codiceLibro == libro.codiceLibro &&
                Objects.equals(nomeLibro, libro.nomeLibro) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeLibro, codiceLibro);
    }

    @Override
    public int compareTo(Libro l) {
        int result = nomeLibro.compareTo(l.nomeLibro);
        if (result == 0){
            result = Integer.compare(codiceLibro,l.codiceLibro);
        }
        return result;
    }



}
