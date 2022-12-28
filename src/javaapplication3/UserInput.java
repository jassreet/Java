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
public class UserInput {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int a, b;
        System.out.println("Enter the value of a");
        a = scanner.nextInt();
        System.out.println("Enter the value of b");
        b = scanner.nextInt();
        System.out.println("Sum of a and b = "+(a+b));
    }
    
}
