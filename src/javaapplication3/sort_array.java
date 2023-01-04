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
public class sort_array {
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[];
        System.out.println("enter the size of array");
        int size=sc.nextInt();
        a=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("enter the value of "+i);
             a[i]=sc.nextInt();
        } 
         int i;
        for(i=0;i<5;i++){
            for(int j=i+1;j<5;j++){
                if(a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
        }
          
     }
          for(i=0;i<size;i++){
                System.out.println("Sort Array"+a[i]);
            }
     }
}
