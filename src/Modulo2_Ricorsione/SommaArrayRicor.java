package Modulo2_Ricorsione;

import java.util.Arrays;

public class SommaArrayRicor {

    public static void main(String[] args) {

        int arr[] = {3,4,7,78,45,77,123,47, 1, 10, 1,1,8};
        int sum = sommaArray(arr);

        System.out.println(sum);
    }


    private static int sommaArray(int arr[]) {

        //base
        int n = arr.length;
        if (n <= 0) {
            return 0;
        }
        //ricorsione
        return sommaArray(Arrays.copyOfRange(arr,0,n-1) )+ arr[n-1];
    }




}
