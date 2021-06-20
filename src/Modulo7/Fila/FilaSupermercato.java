package Modulo7.Fila;
import Modulo7.Fila.ClientiFila;
import java.util.PriorityQueue;
import java.util.Queue;

public class FilaSupermercato {


    private PriorityQueue<ClientiFila> fila = new PriorityQueue<ClientiFila>() ;


    public FilaSupermercato() {
        setFila(fila);
    }

    public int dimensioniFila(){
        return fila.size();
    }
    public boolean aggiungiCliente(ClientiFila cliente){
       return fila.add(cliente);
    }
    public ClientiFila prossimoCliente(){
        return fila.poll();
    }
    public ClientiFila capoFila(){
        return fila.peek();
    }

    public PriorityQueue<ClientiFila> getFila() {
        return fila;
    }

    public void setFila(PriorityQueue<ClientiFila> fila) {
        this.fila = fila;
    }
}
