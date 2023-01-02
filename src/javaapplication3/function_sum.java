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
public class function_sum {
    public static void main(String args[]){
        int a;
        int b;
         Scanner sc=new Scanner(System.in);
        
        System.out.println("enter the value of a");
        a=sc.nextInt();
        
        
         System.out.println("enter the value of b");
        b=sc.nextInt();
        sum(a,b);
        int c=multiply(a,b);
        System.out.println("c" +c);
    }
    // function with argument without return type
    static void sum(int a,int b){
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("a+b "+(a+b) );
    }
    // function with argument with retuen type
     static int multiply(int a,int b){
        System.out.println("a="+a);
        System.out.println("b="+b);
       return a*b;
     }
}