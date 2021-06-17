package Modulo_2_2;

import java.util.Scanner;
import java.util.Arrays;

public class Labirinto {


    public static void main(String[] args) {
        char[][] lab = {{'P', '-', '-', '-','W', '-', 'W', '-'},{'-', 'W', '-', '-','W', '-', 'W', '-'},{'W', '-', 'W', '-','W', '-', 'W', '-'},
                {'W', '-', 'W', '-','W', 'W', '-', '-'},
                {'-', '-', 'W', '-','W', '-', 'W', 'W'},{'-', '-', 'W', '-','-', '-', '-', 'E'}};
        //modo per stamparla a video
        printLab(lab);
        boolean move = true;
        //boolean noExit = true;
        int pRow=0;
        int pCol=0;
        char nextMove;
        while ( move ) {
            System.out.println("\nInserisci movimento:");
            Scanner sc = new Scanner(System.in);
            char c = sc.next().charAt(0);
           //controllo dov'è P (Peppe)
            for (int i = 0; i < lab.length; i++) {
                for (int j = 0; j < lab[i].length; j++) {
                    if (lab[i][j] == 'P') {
                        pRow = i;
                        pCol = j;
                    }
                }
            }
            //controlli ad ogni movimento se ci sta
            //trattino : via libera, e cammmina
            //E: vince
            //W : muro, rimane dove pè
            switch (c){
                case ( 'D') :
                nextMove = lab[pRow][pCol + 1] ;
                switch(nextMove) {
                    case ('-'):
                        lab[pRow][pCol] = '-';
                        lab[pRow][pCol + 1] = 'P';
                        //modo per stamparla a video
                        printLab(lab);
                        break;
                    case ('E') :
                        System.out.println("VINTO!!!");
                        move = false;
                        break;
                    case ( 'W') :
                        System.out.println("Beccato muro");
                        //modo per stamparla a video
                        printLab(lab);
                        break;
                }
                break;
            case ('A'):
                nextMove = lab[pRow][pCol - 1];
                switch(nextMove) {
                    case ('-'):
                        lab[pRow][pCol] = '-';
                        lab[pRow][pCol - 1] = 'P';
                        //modo per stamparla a video
                        printLab(lab);
                        break;
                    case ('E') :
                        System.out.println("VINTO!!!");
                        move = false;
                        break;
                    case ( 'W') :
                        System.out.println("Beccato muro");
                        //modo per stamparla a video
                        printLab(lab);
                        break;
                    }
                    break;
                case ( 'W') :
               nextMove = lab[pRow-1][pCol];
                switch(nextMove) {
                    case ('-'):
                        lab[pRow][pCol] = '-';
                        lab[pRow - 1][pCol] = 'P';
                        //modo per stamparla a video
                        printLab(lab);
                        break;
                    case ('E'):
                        System.out.println("VINTO!!!");
                        move = false;
                        break;
                    case ('W'):
                        System.out.println("Beccato muro");
                        //modo per stamparla a video
                        printLab(lab);
                        break;
                }
                break;
                case ('S') :
                nextMove=lab[pRow+1][pCol];
                switch(nextMove) {
                    case ('-'):
                        lab[pRow][pCol] = '-';
                        lab[pRow + 1][pCol] = 'P';
                        //modo per stamparla a video
                        printLab(lab);
                        break;
                    case ('E') :
                        System.out.println("VINTO!!!");
                        move = false;
                        break;
                    case ( 'W') :
                        System.out.println("Beccato muro");
                        //modo per stamparla a video
                        printLab(lab);
                        break;
                }
                break;
            }

        }

    }
    public static void printLab(char matrix[][]) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
