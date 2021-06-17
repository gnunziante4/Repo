
package Modulo2_Ricorsione;

import java.util.Arrays;

public class RicercaBinaria {


    public static void main(String[] args){
        int[] arr = new int[]{1,4,8,78,45,112,1004,2000};
      //  System.out.println(Arrays.toString(arr));
       System.out.println(trovaNumRB(arr,4));
        //ricBin(arr,0, arr.length,1004);
    }

    public static boolean ricBin(int[] arr,int start, int end,int numRic) {
        //calcolo quello centrale
        //fun fact: con il meno mi va bene quando il numero ric è minore rispetto a quello centrale
        int med = (end + start) /2;
        //finisce quando l'array diviene un singleton
        //infatti in quel caso non ha trovato il numero
        //perchè lo fa solo in quel caso
            if (arr[med] == numRic) {
                return true;
            }
            if (end == start){
                return false;
            }
            if (arr[med] > numRic) {
                return ricBin(arr, 0,  med, numRic);
            }
            if (arr[med] < numRic) {
                return ricBin(arr, med,  end, numRic);
            }
        return false;
    }


    public static String trovaNumRB(int[] arr, int numRic){
        if (ricBin(arr,0,(arr.length),numRic)){
            return  numRic + " presente";
        }else{
            return  numRic + " non presente";
        }

    }

}

