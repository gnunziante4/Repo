
package Modulo4.EsLampadina;

public class Lampadina {

    private TipoStatoLampadina status;
    private int maxClick;
    private int tempClick;
    private TipoStatoLampadina tempStatus;
    private boolean presenzaCorr;
    //getter e setter TempStatus
    public TipoStatoLampadina getTempStatus() {
        return tempStatus;
    }

    public void setTempStatus(TipoStatoLampadina tempStatus) {
        this.tempStatus = tempStatus;
    }
//getter e setter presenza Corrente
    public boolean isPresenzaCorr() {
        return presenzaCorr;
    }

    public void setPresenzaCorr(boolean presenzaCorr) {
        this.presenzaCorr = presenzaCorr;
    }
    //getter e setter maxClick
    public int getTempClick() {
        return tempClick;
    }

    public void setTempClick(int tempClick) {
        this.tempClick = tempClick;
    }
//getter e setter maxClick
    public int getMaxClick() {
        return maxClick;
    }

    public void setMaxClick(int maxClick) {
        this.maxClick = maxClick;
    }
//getter e setter status
    public TipoStatoLampadina getStatus() {
        return status;
    }

    public void setStatus(TipoStatoLampadina status) {
        this.status = status;
    }
    //
    // Costruttore : definisco gli attributi e alcunevalori di defaulr
    //per tempClick ipotizzo che si parta da nessun click
    //per presenzaCorr, ipotizzo che la corrente ci sia
    //per tempStatus all inizio non v i sono commutazioni
    //quindi è pari a status
    public Lampadina(TipoStatoLampadina status, int maxClick,boolean presenzaCorr){
        setStatus(status);
        tempStatus=status;
        setMaxClick(maxClick);
        tempClick=0;
        this.presenzaCorr = presenzaCorr;
    }
//mi da lo status della lampadina, già impostato nel costruttore
    public TipoStatoLampadina checkStatus(){
        return status;
    }
    //non mi da niente in output
    //posso accedere ai suoi effetti mediante get
    //
    public void cambiaStato() {
        if (status == TipoStatoLampadina.on) {
            //nella parte della corrente se non aggiungessi
            // quest altro attributo
            //mi avrebbe contato comue una commutazione
            //nel caso in qui non ci sta corrente
                tempStatus = status;
                status = TipoStatoLampadina.off;
            } else if (status == TipoStatoLampadina.off) {
            if (presenzaCorr) {
                tempStatus = status;
                status = TipoStatoLampadina.on;
            } else {
                tempStatus = TipoStatoLampadina.off;
            }
        }
            //aumenta di uno tempclick perchè il metodo è chiamato
            setTempClick(tempClick + 1);
            //controllo per dare stato rotto
            if (tempClick > maxClick) {
                status = TipoStatoLampadina.rotta;
            }
        }

    }



