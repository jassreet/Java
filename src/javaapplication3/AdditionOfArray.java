/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class AdditionOfArray {

    int[][] getValues(int column, int row) {
        int a[][] = new int[column][row];
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                System.out.println("Enter the values " + i + "j" + j);
                Scanner sc = new Scanner(System.in);
                a[i][j] = sc.nextInt();
            }
        }
        return a;
    }

    void show(int column, int row, int c[][]) {
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int a[][];
        int b[][];
        int c[][];
        AdditionOfArray additionofarray = new AdditionOfArray();
        Scanner sc = new Scanner(System.in);
        int column, row;
        System.out.println("Enter the count of column");
        column = sc.nextInt();
        System.out.println("Enter the count of row");
        row = sc.nextInt();
        a = new int[column][row];
        b = new int[column][row];
        c = new int[column][row];
        System.out.println("Enter values of a");

        a = additionofarray.getValues(column, row);
        System.out.println("Enter values of b"); 
        b = additionofarray.getValues(column, row);
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("showing values of a");
        additionofarray.show(column, row, a);
        System.out.println("showing values of b");
        additionofarray.show(column, row, b);
        System.out.println("showing values of c");
        additionofarray.show(column, row, c);
    }
}
