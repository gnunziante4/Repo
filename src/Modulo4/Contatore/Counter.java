package Modulo4.Contatore;

public class Counter {

    //inizializzo gli attributi
    //count, in questo caso
    //deve essere priv e intero
    //non static perchè non deve essere
    // possibile entrarci da classi esterne
    private int count;
    //mi serve il getter
    public int getCount() {
        return count;
    }
    //ed il setter di questo parametro
    //sono void perchè non danno niente in output
    public void setCount(int count) {
        if (count >= 0) {
            this.count = count;
        }
    }
    //in modo che  posso modificarlo esternamente (setter)
    //ricevere il valore (getter)
    //
    //Ora scrivo il cotruttore, che è identificabile perchè
    //si chiama come la classe e non ritorna niente
    //
    //L'esercizio chiedeva di poterla istanziare con un valore iniziale
    public Counter(){
    count = 10;
    }
    //oppure da noi
    public Counter(int count){
        //metto qui setCount cosi mi da la varbile con i controlli fati in setCOunt
        setCount(count);
    }
    //un metodo per incrementare il valore
    //In questo caso senza l'attributo perchè lo piglia da count
    //
    //this.count o count in questo caso per non ambiguita posso mettere count
    //e me lo riferisce a quello
    //altrimenti bisogna metterlo, in modo che vdo a modificare l'attributo principale
    public int incremento(){ return count = count + 1; }
    //resettare conteggio a zero
    public int resettare(){
           return  count = 0  ;
    }
    //resettare conteggio ad un altro valore
    public int resetValue(int x) {
        return count = x;
    }
}
