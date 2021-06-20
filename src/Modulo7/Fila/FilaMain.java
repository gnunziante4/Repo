package Modulo7.Fila;

import Modulo7.Fila.ClientiFila;
import Modulo7.Fila.FilaSupermercato;

public class FilaMain {

    public static void main(String[] args) {
        ClientiFila c1 = new ClientiFila("Lucia", "Verdi", 26);
        ClientiFila c2 = new ClientiFila("Mario", "Rossi", 38);
        ClientiFila c3 = new ClientiFila("Giovanni", "Giallo", 89);
        ClientiFila c4 = new ClientiFila("Ciro", "Blu", 74);
        ClientiFila c5 = new ClientiFila("Lorenzo", "Dei Pini", 26);

        FilaSupermercato fila = new FilaSupermercato();

        fila.aggiungiCliente(c1);
        fila.aggiungiCliente(c2);
        fila.aggiungiCliente(c3);
        fila.aggiungiCliente(c4);
        fila.aggiungiCliente(c5);

        System.out.println("Inizio dimensioni fila");
        System.out.println(fila.dimensioniFila());
        //
        ClientiFila primo = fila.capoFila();
        System.out.println("capofila nome " + primo.getNome() + " " + primo.getEtà());
        ClientiFila successivo = fila.prossimoCliente();
        System.out.println("cliente da servire " + successivo.getNome() + " " + successivo.getEtà());
        //
        System.out.println("dimensioni fila dopo prossimo");
        System.out.println(fila.dimensioniFila());
        primo = fila.capoFila();
        System.out.println("capofila nome " + primo.getNome() + " " + primo.getEtà());
        successivo = fila.prossimoCliente();
        System.out.println("cliente da servire " + successivo.getNome() + " " + successivo.getEtà());
        //
        System.out.println("dimensioni fila dopo prossimo");
        System.out.println(fila.dimensioniFila());
        primo = fila.capoFila();
        System.out.println("capofila nome " + primo.getNome() + " " + primo.getEtà());
        successivo = fila.prossimoCliente();
        System.out.println("cliente da servire " + successivo.getNome() + " " + successivo.getEtà());
        //
        System.out.println("dimensioni fila dopo prossimo");
        System.out.println(fila.dimensioniFila());
        primo = fila.capoFila();
        System.out.println("capofila nome " + primo.getNome() + " " + primo.getEtà());
        successivo = fila.prossimoCliente();
        System.out.println("cliente da servire " + successivo.getNome() + " " + successivo.getEtà());
        //
        System.out.println("dimensioni fila dopo prossimo");
        System.out.println(fila.dimensioniFila());
        primo = fila.capoFila();
        System.out.println("capofila nome " + primo.getNome() + " " + primo.getEtà());
        successivo = fila.prossimoCliente();
        System.out.println("cliente da servire " + successivo.getNome() + " " + successivo.getEtà());
    }

}





