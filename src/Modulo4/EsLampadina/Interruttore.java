
package Modulo4.EsLampadina;
import Modulo4.EsLampadina.Lampadina;
import Modulo4.EsLampadina.TipoStatoLampadina;
public class Interruttore {

private Lampadina lamp;

    public Interruttore(Lampadina lamp) {
            this.lamp = lamp;
    }

public boolean checkNoRotta(){
        //deve solo richiamare il meodo in Lampadina
    if (lamp.getStatus() == TipoStatoLampadina.rotta){
        return false;
    }
    return true;
}
    public boolean checkCorr(){
        //deve solo richiamare il meodo in Lampadina
        if (lamp.isPresenzaCorr() == false){
            return false;
        }
        return true;
    }

public void premiBottone(){
        if (checkCorr()==true && checkNoRotta()==true){
           lamp.cambiaStato();
        }if (checkNoRotta()==false){
            lamp.setStatus(TipoStatoLampadina.rotta);
    }
    if (checkCorr()==false){
        lamp.cambiaStato();
        //lamp.setStatus(TipoStatoLampadina.off);
    }
}
}

