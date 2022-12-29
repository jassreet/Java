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
public class sum_of_array {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int b[]; //declaration
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        b=new int[size]; // array initilization
        for(int i=0;i<size;i++){
            System.out.println("Enter the value to store at"+i);
            b[i]=sc.nextInt(); // store the value at particular index
        }
        int sum=0;
        for(int i=0;i<size;i++)
        {
            System.out.println("b at " + i + " equals " + b[i]);
            sum=sum+b[i];
            
        }
        System.out.println("Sum = "+sum);
    }
}
