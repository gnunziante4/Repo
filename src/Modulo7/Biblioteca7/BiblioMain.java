package Modulo7.Biblioteca7;

public class BiblioMain {
    public static void main(String[] args) {

        Autore a1 = new Autore("J.R.R Tolkien");

        Libro l1 = new Libro(111,"Il signore degli anelli", "romanzo high fantasy epico ambientato nella Terra di Mezzo");

        Libro l2 = new Libro(112,
                "Lo Hobbit",
                "Lo Hobbit o la riconquista del tesoro, è un romanzo fantasy");

        Autore a2 = new Autore("George Orwell");

        Libro l3 = new Libro(333,
                "1984",
                "è uno dei più celebri romanzi di George Orwell, " +
                        "pubblicato nel 1949");

        Autore a3 = new Autore("J. K. Rowling");

        Libro l4 = new Libro(414,"Harry Potter e la pietra filosofale", "primo capitolo della famosa" +
                " saga di maghetti");
        Libro l5 = new Libro(415,"Harry Potter e la camera dei segreti", "secondo capitolo della famosa" +
                " saga di maghetti");


        BilbliotecaGestore biblio = new BilbliotecaGestore();

        biblio.aggiungiLibro(a1,l1);
        biblio.aggiungiLibro(a1,l2);
        biblio.aggiungiLibro(a2,l3);
        biblio.aggiungiLibro(a3,l4);
        System.out.println(biblio);
        System.out.println("--------------");
        biblio.rimozioneLibro(l4);
        biblio.aggiungiLibro(a3,l5);
        System.out.println(biblio);
        System.out.println("--------------");
        System.out.println(biblio.ricercaLibroDaNome("Harry Potter e la pietra filosofale"));
       System.out.println(biblio.ricercaLibroDaCodice(300));
        System.out.println(biblio.ricercaLibroDaCodice(415));



    }
}
