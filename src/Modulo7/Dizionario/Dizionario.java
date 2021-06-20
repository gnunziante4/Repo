

package Modulo7.Dizionario;

import java.util.*;

public class Dizionario {

    private Map<Character, TreeMap<String, Set<String>>> dizionario =
            new TreeMap<>();

    //Costruttore
    public Dizionario() {
        setDizionario(dizionario);
    }

    //Getter  and Setter
    public Map<Character, TreeMap<String, Set<String>>> getDizionario() {
        return dizionario;
    }

    public void setDizionario(Map<Character, TreeMap<String, Set<String>>> dizionario) {
        this.dizionario = dizionario;
    }

    //Metodi
    public void inserisciParola(String parola, String significato) {
        Character lettera;
        lettera = Character.toUpperCase(parola.charAt(0));
        Set<String> insiemeSignificati = new TreeSet<>();
        TreeMap<String, Set<String>> mapParole = new TreeMap<>();
        if (dizionario.containsKey(lettera)) {
            //mi seleziona la mappa per quella specifica chiave - lettera
            mapParole = dizionario.get(lettera);
            // se ci sta la lettera e ci sta la parola
            if (mapParole.containsKey(parola)) {
                //mi seleziona la mappa per quella specifica chiave - parola
                insiemeSignificati = mapParole.get(parola);
                //mi aggiunge quel significato al set
                insiemeSignificati.add(significato);
                //mi aggiunge quel significato alla mappa
                mapParole.put(parola, insiemeSignificati);
            } else {
                insiemeSignificati.add(significato);
                mapParole.put(parola, insiemeSignificati);
            }
        } else {
            insiemeSignificati.add(significato);
            mapParole.put(parola, insiemeSignificati);
            dizionario.put(lettera, mapParole);
        }
    }


    public void inserisciSignificato(String parola, String significato) {
        Character lettera;
        lettera = Character.toUpperCase(parola.charAt(0));
        TreeMap<String, Set<String>> mapParole = new TreeMap<>();
        if (mapParole.containsKey(parola)) {
            Set<String> insiemeSignificati = new TreeSet<>();
            insiemeSignificati = mapParole.get(parola);
            //mi aggiunge quel significato al set
            insiemeSignificati.add(significato);
            // dizionario.put(lettera, mapParole);
        } else {
            inserisciParola(parola, significato);
        }

    }

    // for (Map.Entry<Character, TreeMap<String, Set<String>>> entry : dizionario.entrySet()) {
    @Override
    public String toString () {
        StringBuilder sb = new StringBuilder();
        for (Character key : dizionario.keySet()) {
            sb.append(key).append(":[");
            TreeMap<String, Set<String>> mapParole = dizionario.get(key);
            for (String parola : mapParole.keySet()) {
                sb.append(parola + "(");
                for (String significati : mapParole.get(parola)) {
                    sb.append(significati).append(";");
                }
                sb.deleteCharAt( sb.length() - 1 );
                sb.append(")").append(",");
            }
            sb.deleteCharAt( sb.length() - 1 );
            sb.append("]\n");
        }
return sb.toString();
        }
    }





