package Modulo7.Tweet;

import java.awt.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class TweetMain {

    public static void main(String[] args) throws FileNotFoundException {

        //faccio la mappa mettendo id univoco del tweet come chiave
        //e array list del tweet senza i caratteri speciali come valore
        Map<String, ArrayList<String>> map = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader("realdonaldtrump.csv"))) {
            String line;
            //qui leggo già la prima del file ma non ci facci niente
            // dalla seconda inizio a riempire la mappa
            line = br.readLine();
            while ((line = br.readLine()) != null) {
                String[] lineItems = line.split(",");
                ArrayList<String> cont = new ArrayList<>();
                String[] contItems = lineItems[2].split(" ");
                for (int i = 0; i < contItems.length; i++) {
                    //[^a-zA-Z0-9]
                    // regex per mantenere solo caratteri alphanumerici, ma se ci sta un url non lo elimina
                    //se ci sta un carattere non alphanumerico isolato, rimane lo spazio
                    //"https?://\\S+\\s?"
                    //regex che dovrebbe eliminare gli URL
                    String noURL = contItems[i].toLowerCase().replaceAll("https?://\\S+\\s?", "");
                    String noSC = noURL.replaceAll("[^a-zA-Z0-9]", "");
                    cont.add(noSC);
                }
                //metto come chiave l'id del tweet e contenuto un arraylist del relativo contenuto del tweet
                map.put(lineItems[0], cont);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

      /*  // stampo la hashmap creata
      int cont = 0;
        for (Map.Entry<String, ArrayList<String>> en : map.entrySet()) {
            //  if (cont >= 10) break;
            System.out.println("Key = " + en.getKey() +
                    ", Value = " + en.getValue());
            //   cont++;
        }
*/


        //Hasmap con le prole come chiave
        HashMap<String, Integer> contaParole = new HashMap<>();
        for (String key : map.keySet()) {
            ArrayList<String> strLista = map.get(key);
            for (String parola : strLista) {
                if (parola.length()<=1) continue;
                contaParole.merge(parola, 1, Integer::sum);
            }
        }


        //posso filtrare le parole che non devono essere contate
        try (BufferedReader br1 = new BufferedReader(new FileReader("english_stopwords.txt"))) {
            String line;
            while ((line = br1.readLine()) != null) {
                // process the line.
                //non rimuove ma legge solo
                contaParole.remove(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
/*
       // int cont = 0;
        for (Map.Entry<String, Integer> en : contaParole.entrySet()) {
            //  if (cont >= 10) break;
            System.out.println("Key = " + en.getKey() +
                    ", Value = " + en.getValue());
            //   cont++;
        }*/

        Map<String, Integer> hm1 = sortByValue(contaParole);

        int cont = 0;
        for (Map.Entry<String, Integer> en : hm1.entrySet()) {
            if (cont >= 10) break;
            System.out.println("Key = " + en.getKey() +
                    ", Value = " + en.getValue());
            cont++;
        }


        //res = list(contaParole.keys())[0];


    }

    public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm) {
        // Create a list from elements of HashMap
        List<Map.Entry<String, Integer>> list =
                new LinkedList<Map.Entry<String, Integer>>(hm.entrySet());

        // Sort the list
        list.sort((o1, o2) -> (o2.getValue()).compareTo(o1.getValue()));

        // put data from sorted list to hashmap
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;


    }
}

