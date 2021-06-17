package Modulo_2_2;

public class Esercizio14 {

    public static void main(String[] args) {
        int[][] matrice=Tab(11,11);
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] Tab(int n,int m){
        int[][] matr = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matr[i][j]=i*j;
            }
        }
        return matr;
    }

}
