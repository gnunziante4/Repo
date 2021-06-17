package Modulo_2_2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Tombola {


    public static void main(String[] args) {
        int numRow = 3;
        int numCol = 5;
        int numEstr= 30;
       int[] estr = generaEstrazioni(numEstr);
       int[][] sch = generaCartella(numRow,numCol);
        //stampo la cartella
        //System.out.println("Cartella");
        for (int row = 0; row < numRow; row++) {
            for (int col = 0; col < numCol; col++) {
                System.out.print(sch[row][col] + " ");
            }
            System.out.println();
        }
        //stampo le estrazioni
        System.out.println("Estrazioni");
        for (int i = 0; i < estr.length; i++) {
            System.out.print(estr[i] + " ");
        }

        //stampo il controllo
        System.out.println("\r\nControllo");
        System.out.println(checkCartella(sch, estr));

    }


    public static String checkCartella(int[][] cartella, int[] estrazioni) {
        int ambo = 0;
        int terno = 0;
        int quaterna = 0;
        int quintina = 0;
        //Faccio l'estrazione e vedo se è presente nella cartella
        int numEstr = 0;
        //mi conta il numero di numero uguali nella riga i-esimka
        int[] count = new int[cartella.length];
        //mi salva il numero di elememnti uguali nella riga i-esimka, alla precedente estrazione
        int[] prevCount = new int[cartella.length];
        while (numEstr < estrazioni.length) {
            for (int row = 0; row < cartella.length; row++) {
                for (int col = 0; col < cartella[row].length; col++) {
                    if (estrazioni[numEstr] == cartella[row][col]) {
                        prevCount[row] = count[row];
                        count[row] = count[row] + 1;
                        //Controllo se ho fatto ambo,terno,quaterna,quintina
                        switch (count[row]) {
                            case 2:
                                ambo = ambo + 1;
                                break;
                            case 3:
                                terno = terno + 1;
                                break;
                            case 4:
                                quaterna = quaterna + 1;
                                break;
                            case 5:
                                quintina = quintina + 1;
                                break;
                        }
                        //Evita inutili iterazioni (ipotesi che non vi sono doppioni nella scheda)
                        if (prevCount[row] != count[row]) {
                            break;
                        }
                    }
                }
            }
            numEstr++;
        }
        //Controllo
        if (quintina == cartella.length) {
           return "TOMBOLA";
        }else{
            return "ambo: " + ambo + " volte"+"\r\nterno: " + terno + " volte"+"\r\nquaterna: " + quaterna +
                    "volte"+"\r\nquintina: " + quintina + "volte";
        }
        }

       public static int[] generaEstrazioni(int n) {
           int[] estrazioni = new int[n];
           for (int i = 0; i < n; i++) {
               boolean checkDoub=true;
               while(checkDoub==true){
                   //lo ipotizzo falso
                   checkDoub=false;//while mi sputerà fuori falso se nel for non trova doppioni
                   Random rand = new Random();
                   int temp = 1 + rand.nextInt(90);
                   for (int l = 0; l < i; l++) {
                       if (estrazioni[l]==temp){
                           //mi permette di rigenerare nel while il numero random
                           checkDoub=true;
                           //uscendo dal for
                           break;
                       }
                   }
                   //fuori dal ciclo while esce sicuro un non doppione e quindi lo scrivo quando è falso
                   if (checkDoub==false){
                       estrazioni[i]=temp;
               }
               }
           }
           return estrazioni;
       }
//modificare controllo
        public static int[][] generaCartella(int n,int m) {
            int[][] cartella = new int[n][m];
            //ciclo per scrivere un elemento
            for(int row=0;row<n;row++) {
                for (int col = 0; col < m; col++) {
                    // lo setto true per entrare
                    boolean checkDoub = true;
                    //genero un numero random fin quando non trovo doppioni
                    while (checkDoub == true) {
                        checkDoub = false;
                        Random rand = new Random();
                        int temp = 1 + rand.nextInt(90);
                        //qui controllo tutta la matrice
                        //per questo non può essere molto efficiente
                        //mi esce dall'iterazione non appena
                        //trova un doppione, cosi genera un nuovo numero
                        for (int k = 0; k < n; k++) {
                            for (int l = 0; l < m; l++) {
                                if (cartella[k][l] == temp) {
                                    checkDoub = true;
                                    break;
                                }

                            }
                        }
                        //se e falso, vuol dire che in tutta la marice
                        //non ha trovato il doppione
                        //e me lo stampa nella matrice, andando al prossimo elemento di matrice
                        if (checkDoub==false){
                            cartella[row][col]=temp;
                    }
                }
            }
            }
        return cartella;
        }

    }



