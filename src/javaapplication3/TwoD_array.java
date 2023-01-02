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
public class TwoD_array {
   public static void main(String args[]){
       int a[][];
       Scanner sc= new Scanner(System.in);
       
       System.out.println("Enter the column");
       int column=sc.nextInt();
       System.out.println("Enter the row");
       int row=sc.nextInt();
       //size of array
       a=new int[column][row];
       //initialization of array
       for(int i=0;i<column;i++){
           for(int j=0;j<row;j++){
               System.out.println("Enter the value at i" +i+ "j" +j);
               a[i][j]=sc.nextInt();
               
           }
       }
       //display value stored in array
       for (int i=0;i<column;i++){
           for(int j=0;j<row;j++)
           {
               System.out.print(a[i][j] + "");
               
           }
           System.out.println("");
       }
   }
}
