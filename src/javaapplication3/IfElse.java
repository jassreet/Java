/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;
//Get an input from the user
//Perform division if the number is >0
//Multiplication if number < 0
//Don't perform anything if number is equal to 0
/**
 *
 * @author DELL
 */
public class IfElse {
     public static void main(String args[]) {
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        a = sc.nextInt();
        System.out.println("Enter the value of b");
        b = sc.nextInt();
        if(a>0){
            System.out.println("A is greater than 0" +(a/b));
        }else if(a<0){
            System.out.println("A is less than 0" +(a*b));
        }
        else if(a==0){
            System.out.println("A is eqal to 0");
        }
     }
}
