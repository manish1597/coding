package Array;

import java.util.Scanner;

public class Testing {

    public  static void printarray(int matrix[][]){
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

   public static void Transpose(int matrix[][]){
        int latest[][]= new int[matrix[0].length][matrix.length];
        for (int i=0;i< matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                latest[j][i]=matrix[i][j];
            }
        }
        printarray(latest);

   }

    public static void main(String[] args) {
        int matrix[][]={
                {4,7,8},
                {8,8,7}};

        printarray(matrix);
        System.out.println("The transpose of matrix is ");
        Transpose(matrix);
    }



}

