package Modulo7.Biblioteca7;

public class BiblioMain {
    public static void main(String[] args) {

        Autore a1 = new Autore("J.R.R","Tolkien");

        Libro l1 = new Libro("Il signore degli anelli", "romanzo high fantasy epico scritto da J. R. R. Tolkien" +
                " e ambientato alla fine della Terza Era dell'immaginaria Terra di Mezzo",a1);

        Libro l2 = new Libro(
                "Lo Hobbit",
                "Lo Hobbit o la riconquista del tesoro, noto anche semplicemente come Lo Hobbit, " +
                        "è un romanzo fantasy scritto da J. R. R. Tolkien.",a1);

        Autore a2 = new Autore("George","Orwell");

        Libro l3 = new Libro(
                "1984",
                "1984 (Nineteen Eighty-Four) è uno dei più celebri romanzi di George Orwell, " +
                        "pubblicato nel 1949 ma iniziato a scrivere nel" +
                        " 1948 (anno da cui deriva il titolo, ottenuto appunto " +
                        "dall'inversione delle ultime due cifre).",a2);

        Autore a3 = new Autore("J. K.","Rowling");

        Libro l4 = new Libro("Harry Potter e la pietra filosofale", "primo capitolo della famosa" +
                " saga di maghetti",a3);

        System.out.println(l1.getCodiceLibro());
        System.out.println(l2.getCodiceLibro());
        System.out.println(l3.getCodiceLibro());
        System.out.println(l4.getCodiceLibro());

        System.out.println(a1.getCodiceAutore());
        System.out.println(a2.getCodiceAutore());
        System.out.println(a3.getCodiceAutore());




    }
}
