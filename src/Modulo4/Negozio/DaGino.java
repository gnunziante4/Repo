/*
package Modulo4.Negozio;

public class DaGino {

    //prima colonna num prodotti alimentari
    // seconda colonna quantità prodtti alimentari
    //terza colonna num prodotti altro
    // quarta colonna quantità prodtti altro
    private double[][] arrProd;
    //per via degli sconti al variare del giorno, il prezzo  cambia per le persone con età magg di 60
    private TipoGiorni giorno;

    public TipoGiorni getGiorno() {
        return giorno;
    }

    public void setGiorno(TipoGiorni giorno) {
        this.giorno = giorno;
    }

    public  double[][] getArrProd() {
        return arrProd;
    }

    public void setArrProd(double[][] arrProdAlim) {
        if (arrProdAlim.length != 0) {
            this.arrProd = arrProd;
        } else System.out.println("inserisci prodotti");
    }

    public DaGino(arrProd) {

        setArrProd(arrProd);

    }



    public double[][] reinscerisciProdotto(double[] insProd, TipoProdotto scelta) {
        if (scelta == TipoProdotto.Alimentari) {
            for (int row = 0; row < arrProdAlim.length; row++) {
                arrProdAlim[row][0] = arrProdAlim[row][0] + insProd[row];
            }
            return arrProdAlim;
        } else {
            for (int row = 0; row < arrProdAltro.length; row++) {
                arrProdAltro[row][0] = arrProdAltro[row][0] + insProd[row];
            }
            return arrProdAltro;
        }
    }

    public double[][] rimozioneProdotto(TipoProdotto prodotto, double[] prodDaComp){
        if (prodotto == TipoProdotto.Alimentari){
            double[][] arrSelected = arrProdAlim;
            for (int i = 0;i<arrSelected.length;i++){
                arrSelected[i][0] = arrSelected[i][0] - prodDaComp[i];
            }
            setArrProdAlim(arrSelected);
            return arrSelected;
        }
        else {
            double[][]  arrSelected =  arrProdAltro ;
            for (int i = 0;i<arrSelected.length;i++){
                arrSelected[i][0] = arrSelected[i][0] - prodDaComp[i];
            }
            setArrProdAlim(arrSelected);
            return arrSelected;
        }
    }

    }


*/
