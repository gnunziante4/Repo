/*



import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = new int[]{4, 187, 46, 98, 3, 48};
        //System.out.println(Arrays.toString(arr));
        //System.out.println(Arrays.toString(ms(arr,0, arr.length)));
    }

    public static int[] mergesort(int[] arr, int start, int end) {
        int med = (start + end) / 2;
        int arrLen = arr.length;
        int[] arrHalf1 = new int[med];
        int[] arrHalf2 = new int[med - arrLen];
        //se è pari la lunghezza [0 1 2 3 4 5]
        //arrLen=6, med = 3, le partizioni saranno [0,1,2] e [3,4,5]
        //
        //se è dispari la lunghezza [0 1 2 3 4]
        //arrLen=5, med = 2, le partizioni saranno [0,1,2] e [3,4]
        if (arrLen == 2) {
            if (arr[0] > arr[1]) {
                int temp = arr[1];
                arr[0] = arr[1];
                arr[1] = arr[0];
            }
        } else {
            for (int j = 0; j < med; j++) {
                arrHalf1[j] = arr[j];
            }
            int i = med + 1;
            for (int j = 0; j < arrLen - med; j++) {
                arrHalf2[j] = arr[i];
                i++;
            }
        }

       mergesort(arrHalf1,0,med);
        mergesort(arrHalf1,med + 1 ,arrLen-med);

    }
}




*/
