package Modulo4.Forme;

import Modulo4.Forme.Quadrato;
import Modulo4.Forme.Cerchio;

public class MainForme {

    public static void main(String[] args) {
        Quadrato q = new Quadrato(5,TipoColore.Nero);
        Cerchio c = new Cerchio(10,TipoColore.Nero);
        //sono metodi con stessa chiave ma contnentui in classi diverse
        //quindi non ci sono conflitti
        System.out.println(q.perimetro());
        System.out.println(c.perimetro());
        System.out.println(q.area());
        System.out.println(c.area());
        System.out.println(c.getColore());
        q.setColore(TipoColore.Bianco);
        System.out.println(q.getColore());
    }

}
