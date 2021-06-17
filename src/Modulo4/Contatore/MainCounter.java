package Modulo4.Contatore;
//in un altro file devo importare la classe da usare
//la sintassi è diversa
//dipende il percorso dve sta

import Modulo4.Contatore.Counter;

public class MainCounter {

    public static void main(String[] args) {
        //inizializzo contatore
        Counter contatore = new Counter();
        //cast fatto per provare
        //Counter contatore1 = (Counter) contatore;
        //vedo se funziona chiamando i metodi all'interno di Counter
        //
        //vedo se esce quello di default (10)
        System.out.println(contatore.getCount());
        //seto il counter
        //non va con sout perchè setnon da niente scrive solo (è void)
        contatore.setCount(89);
        System.out.println(contatore.getCount());
        //inizializzo contatore con parametro iniziale
        Counter contatore1 = new Counter(7);
        //System.out.println(contatore1.getCount());
        System.out.println(contatore.incremento());
        //incrementando this.count, mi riferisco al attributo count (private)
        //il quale è utilizzato da getCount
        //quindi sto andnando a cambiare quel attributo
        System.out.println(contatore.getCount());
        System.out.println(contatore.resettare());
        System.out.println(contatore.resetValue(110));
        System.out.println(contatore.getCount());
    }

}
