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
public class TwoArray {

    public static void main(String args[]) {
        int size;
        int a[];
        int b[];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        size = sc.nextInt();
        a = new int[size];
        b = new int[2 * size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the values for a" + i);
            a[i] = sc.nextInt();

        }
        
    }
}
