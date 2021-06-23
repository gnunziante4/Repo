
package Modulo7.TinderLike;

import java.util.*;

public class TinderGestore {
    // <id, [Interessi1,Interessi2,...]>
    private  Map<Utenti, HashSet<TipoInteressi>> tinderMap = new HashMap<>();

    public TinderGestore() {
        setTinderMap(tinderMap);
    }

    public void aggiungiUtente(Utenti utente){
        HashSet<TipoInteressi> interesseSet = new HashSet<TipoInteressi>();
        tinderMap.put(utente,interesseSet);
    }

    public void aggiungiInteresse(Utenti utente,TipoInteressi interesse){
        HashSet<TipoInteressi> interesseSet=new HashSet<TipoInteressi>();
        if (tinderMap.containsKey(utente)) {
            interesseSet = tinderMap.get(utente);
            interesseSet.add(interesse);
        }else {
            interesseSet.add(interesse);
            tinderMap.put(utente, interesseSet);
        }
    }

    public boolean rimuoviUtente(Utenti utente){
        if (tinderMap.containsKey(utente)){
            tinderMap.remove(utente);
            return true;
        }
        return false;
    }

    public Map<Utenti,Integer> mappaInteressiComuni(Utenti utente) {

        //sicuro sarà un hashmap
        HashMap<Utenti, Integer> mapNonOrdinata  = new HashMap<>();
        HashSet<TipoInteressi> interesseUtente;
        int numeroInteressiComuni;
        if (tinderMap.containsKey(utente)) {
            interesseUtente = tinderMap.get(utente);
            //copia di interesseUtente
            //addall implicito
            HashSet<TipoInteressi> interesseIntersezione = new HashSet<TipoInteressi>(interesseUtente);
            //interesseIntersezione.addAll(interesseUtente);
            for (Utenti tempUtente : tinderMap.keySet()) {
                HashSet<TipoInteressi> interesseTempUtente =  tinderMap.get(tempUtente);
                if (tempUtente.getId() != utente.getId()) {
                    interesseIntersezione.retainAll(interesseTempUtente);
                    numeroInteressiComuni = interesseIntersezione.size();
                    mapNonOrdinata.put(tempUtente,numeroInteressiComuni);
                }
            }
        }
        return sortByValue(mapNonOrdinata);
    }

    public Utenti migliorMatch(Utenti utente) {
        Map<Utenti,Integer> mappaInteressi = mappaInteressiComuni(utente);

        Utenti primoUtente = mappaInteressi.keySet().iterator().next();

        Integer interessiComuniPrimoUtente = mappaInteressi.get(primoUtente);

        if (interessiComuniPrimoUtente == 0){
            return utente;
        }else{
            return primoUtente;
        }
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for(Utenti utente : tinderMap.keySet()){
            str.append(utente.getNomeUtente()).append(":");
            HashSet<TipoInteressi> interessi = tinderMap.get(utente);
            //Gli oggetti nel Hashset sono di tipo TipoInteressi
            //ne segue che devo accedere a loro col tipo TipoInteressi e poi stmparne la stringa
            for (TipoInteressi interesse : interessi) {
                str.append(interesse.getStr()).append(",");
            }
            str.deleteCharAt( str.length() - 1 );
            str.append("\n");
        }
        return str.toString();
    }

    public Map<Utenti, HashSet<TipoInteressi>> getTinderMap() {
        return tinderMap;
    }

    public void setTinderMap(Map<Utenti, HashSet<TipoInteressi>> tinderMap) {
        this.tinderMap = tinderMap;
    }

    //
    public static Map<Utenti, Integer> sortByValue(HashMap<Utenti, Integer> hm) {
        // Create a list from elements of HashMap
        //non posso ordinare TreeMAp perchè ordina già per chiavi, quindi uso HashMap

        //creo una linkedlist, list, in cui gli elementi sono gli oggetti map.entry
        //coppia chiave valore
        List<Map.Entry<Utenti, Integer>> list = new ArrayList<>(hm.entrySet());

        // Sort the list
        list.sort((o1, o2) -> (o2.getValue()).compareTo(o1.getValue()));

        // put data from sorted list to hashmap
        HashMap<Utenti, Integer> temp = new LinkedHashMap<Utenti, Integer>();
        for (Map.Entry<Utenti, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }

}

