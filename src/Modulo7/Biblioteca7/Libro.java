package Modulo7.Biblioteca7;

import java.util.Objects;

public class Libro {

    private String nomeLibro;
    private String sinossiLibro;
    private int codiceLibro;
    private static int count = 0;

    public Libro(String nomeLibro, String sinossiLibro, Autore autore) {
        setNomeLibro(nomeLibro);
        setSinossiLibro(sinossiLibro);
        setCodiceLibro(count++);
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



}
