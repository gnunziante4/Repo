package Modulo2_Ricorsione;

public class MaxMinRec {

    public static void main(String[] args) {

        int[] arr = {1224, 5, 9,98,78,145, 7, 7879163};
        System.out.print(minMaxRec(arr));
    }

    public static int maxArr(int[] arr) {
        int arrLen = arr.length;
        if (arrLen <= 1) {
            return arr[0];
        }
        else {
            int[] arrTemp = new int[arrLen-1];
            int temp=arr[arrLen-1];
            for (int i =0; i<arrLen - 1 ;i++) {
                arrTemp[i] = arr[i];
            }
            if (temp>maxArr(arrTemp)){
                return temp;
            } else {
                return maxArr(arrTemp);
            }
        }
    }

    public static int minArr(int[] arr) {
        int arrLen = arr.length;
        if (arrLen <= 1) {
            return arr[0];
        }
        else {
            int[] arrTemp = new int[arrLen-1];
            int temp=arr[arrLen-1];
            for (int i =0; i<arrLen - 1 ;i++) {
                arrTemp[i] = arr[i];
            }
            if (temp<minArr(arrTemp)){
                return temp;
            } else {
                return minArr(arrTemp);
            }
        }
    }

    public static String minMaxRec(int [] arr){
        return minArr(arr) + " " + maxArr(arr);
    }

}
