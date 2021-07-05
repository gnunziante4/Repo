
package Modulo7.TinderLike;

import java.util.*;

public class TinderGestore {
    // <id, [Interessi1,Interessi2,...]>
    //mi carico nel frattempo un altra mappa <id utente,[id interesse1,id interesse2,..]>
    // che mi serve per i metodi di rimozione
    //e per ottenreun rapido accesso all'id interesse
    private  Map<Utenti, HashSet<Interessi>> tinderMap ;
    private Map<Integer,HashSet<Integer>> mapIdUtenteidInteressi ;


    public Map<Utenti, HashSet<Interessi>> getTinderMap() {
        return tinderMap;
    }

    public void setTinderMap(Map<Utenti, HashSet<Interessi>> tinderMap) {
        this.tinderMap = new HashMap<Utenti, HashSet<Interessi>>();;
    }

    public Map<Integer, HashSet<Integer>> getMapIdUtenteidInteressi() {
        return mapIdUtenteidInteressi;
    }

    public void setMapIdUtenteidInteressi(Map<Integer, HashSet<Integer>> mapIdUtenteidInteressi) {
        this.mapIdUtenteidInteressi = new HashMap<Integer, HashSet<Integer>>();
    }

    public TinderGestore() {
        setTinderMap(tinderMap);
        setMapIdUtenteidInteressi(mapIdUtenteidInteressi);
    }

    public void aggiungiUtente(Utenti utente){
        HashSet<Interessi> interesseSet = new HashSet<>();
        tinderMap.put(utente,interesseSet);
    }

    public void aggiungiInteresse(Utenti utente,Interessi interesse){
        HashSet<Interessi> interesseSet=new HashSet<>();
        HashSet<Integer> setIdInteressi = new HashSet<>();
        Integer idInt = interesse.getTipoInteressi().getId();
        Integer idUtente = utente.getId();
        //
        if (tinderMap.containsKey(utente)) {
            //li aggiungo in parallello
            //controllo solo sulla tinderMap perchè sono solo
            //aggiunti di attributi di Utente e interessi
            interesseSet = tinderMap.get(utente);
            setIdInteressi = mapIdUtenteidInteressi.get(idUtente);
            interesseSet.add(interesse);
            setIdInteressi.add(idInt);
        }else {
            interesseSet.add(interesse);
            setIdInteressi.add(idInt);
            tinderMap.put(utente, interesseSet);
            mapIdUtenteidInteressi.put(idUtente,setIdInteressi);
        }
    }

   /* public boolean rimuoviUtente(Utenti idUtente){
       if (mapIdUtenteidInteressi.containsKey(idUtente)){
            return true;
        }
        return false;

    }

    //questo è barare, si deve togliare dato un attributo

    public Map<Utenti,Integer> mappaInteressiComuni(Utenti utente) {
        //sicuro sarà un hashmap
        Map<Utenti, Integer> mapNonOrdinata  = new HashMap<>();
        Set<Interessi> interesseUtente;
        int numeroInteressiComuni;
        if (tinderMap.containsKey(utente)) {
            interesseUtente = tinderMap.get(utente);
            //copia di interesseUtente
            //addall implicito
            Set<Interessi> interesseIntersezione = new HashSet<Interessi>(interesseUtente);
            //interesseIntersezione.addAll(interesseUtente);
            for (Utenti tempUtente : tinderMap.keySet()) {
                Set<Interessi> interesseTempUtente =  tinderMap.get(tempUtente);
                if (tempUtente.getId() != utente.getId()) {
                    interesseIntersezione.retainAll(interesseTempUtente);
                    numeroInteressiComuni = interesseIntersezione.size();
                    mapNonOrdinata.put(tempUtente,numeroInteressiComuni);
                }
            }
        }
        return sortByValue((HashMap<Utenti, Integer>) mapNonOrdinata);
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
    }*/

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for(Utenti utente : tinderMap.keySet()){
            str.append(utente.getNomeUtente()).append(":");
            Set<Interessi> interessi = tinderMap.get(utente);
            //Gli oggetti nel Hashset sono di tipo TipoInteressi
            //ne segue che devo accedere a loro col tipo TipoInteressi e poi stmparne la stringa
            for (Interessi interesse : interessi) {
                str.append(interesse.getTipoInteressi().getStr()).append(",");
            }
            str.deleteCharAt( str.length() - 1 );
            str.append("\n");
        }
        return str.toString();
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

