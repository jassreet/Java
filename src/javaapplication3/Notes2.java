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
public class Notes2 {
     public static void main(String args[]){
        int size;
        int a[];
        int amount;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of currency denomination" );
    size = sc.nextInt();
    a=new int[size];
    
    for(int i=0; i<size; i++){
        System.out.println("Enter the currency denomination" +i );
        a[i] = sc.nextInt();
        
    }
    System.out.println("Enter the amout you want to pay");
    amount = sc.nextInt();
    System.out.println("Payement Approach " );
    }
}
