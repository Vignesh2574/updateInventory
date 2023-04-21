package com.example.updateinventory;

public class tester {
    public static void main(String[] args) {
        int rows, cols;

        int a[][] = {
                {1, 2, 3},
                {8, 6, 4},
                {4, 5, 6}
        };


        //Calculates number of rows and columns present in given matrix
        rows = a.length;
        cols = a[0].length;
        System.out.println("rows "+rows+" cols "+cols);
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(j>=i) {
                    System.out.println("[" + j + "," + i + "]");
                    System.out.print(a[j][i+j]);
                }

            }
        }
    }

}
