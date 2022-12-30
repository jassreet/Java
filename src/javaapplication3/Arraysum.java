/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author DELL
 */import java.util.Scanner;
public class Arraysum {
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
        int value=0;
        for(int i=0;i<size;i++){
            System.out.println("value is "+a[i]);
                value=value+a[i];
        }
        System.out.println("sum is "+value);
    }
}

