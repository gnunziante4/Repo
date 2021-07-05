

package Modulo7.Biblioteca7;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class BilbliotecaGestore {

    private Map<Autore,Set<Libro>> biblio = new TreeMap<>();

    public BilbliotecaGestore() {
        this.biblio = biblio;
    }

    public void aggiungiAutore(Autore autore){
        Set<Libro> libri = new TreeSet<>();
        biblio.put(autore,libri);
    }

    public void aggiungiLibro(Autore autore,Libro libro){
        Set<Libro> libri = new TreeSet<>();
        if (biblio.containsKey(autore)) {
            libri = biblio.get(autore);
            libri.add(libro);
        }else{
            libri.add(libro);
            biblio.put(autore,libri);
        }
    }

    public String ricercaLibroDaAutore(Autore autore) {
        StringBuilder str = new StringBuilder();
            if (biblio.containsKey(autore)) {
                Set<Libro> libri = biblio.get(autore);
                    for (Libro libro : libri) {
                        str.append(libro.getNomeLibro()).append(",");
                    }
                    str.deleteCharAt( str.length() - 1 );
                }
            else{
                str.append("autore non presente");
        }
        return str.toString();
    }

    @Override
    public String toString () {

        StringBuilder sb = new StringBuilder();
        for (Autore autore : biblio.keySet()) {
            Set<Libro> libri = biblio.get(autore);
            for (Libro libro : libri) {
                sb.append(libro.getNomeLibro()).append(":").append(libro.getSinossiLibro());
                sb.append("\n");
            }
            sb.append("\n");
        }
return sb.toString();
    }


    public String ricercaLibroDaNome(String nomeLibro) {
        for (Set<Libro> libri : biblio.values()) {
            for (Libro libro : libri) {
                if (nomeLibro.equals(libro.getNomeLibro()))
                    return libro.getNomeLibro() + " presente\ncodice: "+ libro.getCodiceLibro();
            }
        }
        return nomeLibro + " non presente";
    }


    public String ricercaLibroDaCodice(int codiceLibro) {
        for (Set<Libro> libri : biblio.values()) {
            for (Libro libro : libri) {
                if (codiceLibro == libro.getCodiceLibro())
                    return libro.getNomeLibro() ;
            }
        }
        return codiceLibro + " non presente";
    }

    public void rimozioneLibro(Libro libro){
        for (Set<Libro> libri : biblio.values()) {
                if (libri.contains(libro)) {
                libri.remove(libro);
                break;
                }
            }
        }

        //creare mappa aggiuntiva <id libro, autore>
    //get in O(1) data lachiave, questo è il vantaggio
    //autore serve poi per tenere conto nella rimozioe del libro nel catalogo?
    //perchè come ho fatto vale se ho tutto l'oggetto
    //ma di solito si ha solo un attributo dell'oggetto



    //Getter and Setter
    public Map<Autore, Set<Libro>> getBiblio() {
        return biblio;
    }

    public void setBiblio(Map<Autore, Set<Libro>> biblio) {
        this.biblio = biblio;
    }




}


