/*
package Modulo4.Negozio;
import Modulo4.Negozio.DaGino;
import Modulo4.Negozio.TipoGiorni;

import java.util.Arrays;

public class MainNegozio {

    public static void main(String[] args) {
        double[][] prod = new double[][]{{5,20,2,20},{4,8,3,10},{3,7,4,}};
        double[] riforAlim = new double[]{4,7,10};
        double[] acquisto = new double[]{2,0,1};
        DaGino negozio = new DaGino(prod);
        Cliente c1 = new Cliente("Tizio",72);
        System.out.println("Prima aquisto Alimentari");
        System.out.println("prodotti disponibili Negozio");
        for (int i = 0; i < prod.length+1; i++) {
            for (int j = 0; j < prod[i].length + 1; j++) {
                if (i == 0 ){
                    System.out.println();
                }
                System.out.print(prod[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("---------------------");
        System.out.println("prodotti acquistati da " + c1.getNome());
        System.out.println(Arrays.toString(acquisto));
      double spesa =  c1.spesaCliente(negozio,TipoProdotto.Alimentari,acquisto,TipoGiorni.Lunedi);
        System.out.println("Cliente: "+ c1.getNome()+" spesa: "+ spesa);
        System.out.println("Fornitura rimasta");
        for (int i = 0; i < prod.length; i++) {
            for (int j = 0; j < prod[i].length; j++) {
                System.out.print(prod[i][j] + " ");
            }
            System.out.println();
        }
       System.out.println("prodotti Altro");
        for (int i = 0; i < prodAltro.length; i++) {
            for (int j = 0; j < prodAltro[i].length; j++) {
                System.out.print(prodAltro[i][j] + " ");
            }
            System.out.println();
        }
      // double[][] sconto =  negozio.scontoOver60();

       negozio.reinscerisciProdotto(riforAlim,TipoProdotto.Alimentari);
        System.out.println("rifornimento Alimentari");
        System.out.println(Arrays.toString(riforAlim));
        for (int i = 0; i < prod.length; i++) {
            for (int j = 0; j < prod[i].length; j++) {
                System.out.print(prod[i][j] + " ");
            }
            System.out.println();
        }
    }
}
*/
