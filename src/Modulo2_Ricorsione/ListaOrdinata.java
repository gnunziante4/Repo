
package Modulo2_Ricorsione;


import java.util.Arrays;

import static Modulo2_Ricorsione.RicercaBinaria.trovaNumRB;

public class ListaOrdinata {

    public static void main(String[] args) {

//RicercaBinaria.ricBin();
        int[] arr = new int[]{10, 25, 32, 40, 90, 130};
       System.out.println(Arrays.toString(insert(55, arr)));
        //insert(80, arr);
    }

    public static int[] insert(int x, int[] arr) {
        int arrLen = arr.length;
        int[] newArr = new int[arrLen + 1];
        if (x >= arr[arrLen - 1]) {
            int k = 0;
            for (int i = 0; i < arrLen; i++) {
                newArr[i] = arr[i];
            }
            newArr[arrLen] = x;
        } else {
            for (int i = 0; i < arrLen; i++) {
                if (arr[i] >= x) {
                    int tempIndex = i;
                    for (int k = 0; k < tempIndex ; k++) {
                        newArr[k] = arr[k];
                    }
                    newArr[tempIndex] = x;
                    int j = tempIndex;
                    for (int k = tempIndex +1; k < arrLen +1 ; k++) {
                        newArr[k] = arr[j];
                        j++;
                    }
                    break;
                }
            }
        }
        return newArr;
    }

    public static boolean indexRic(int x, int[] arr,int start,int end) {
        //calcolo quello centrale
        //fun fact: con il meno mi va bene quando il numero ric è minore rispetto a quello centrale
        int med = (end + start) /2;
        //finisce quando l'array diviene un singleton
        //infatti in quel caso non ha trovato il numero
        //perchè lo fa solo in quel caso
        if (arr[med] == x) {
            return true;
        }
        if (end == start){
            System.out.println("non presente");
       }
        if (arr[med] > x) {
            return indexRic(x, arr,  0, med);
        }
        if (arr[med] < x) {
            return indexRic(x, arr,  med, end);
        }
       return false;
        }
    }

