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
public class if_else_switch {

    public static void main(String args[]) {
        int a;
        int b;
        int c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        a = sc.nextInt();
        System.out.println("Enter the value of b");
        b = sc.nextInt();
        System.out.println("Select the operation to perform \n1 for addition \n2 for subtraction \n3 for division \n4 for multiplication \n5 for modolus");
        c = sc.nextInt();
        if (c < 1 || c > 5) {
            System.out.println("Invalid Input");
        }
        switch (c) {
            case 1:
                System.out.println("Sum is" + (a + b));
                break;
            case 2:
                System.out.println("Subtraction is" + (a - b));
                break;
            case 3:
                System.out.println("Division is" + (a / b));
                break;
            case 4:
                System.out.println("Multilication is" + (a * b));
                break;
            case 5:
                System.out.println("Modolus is" + (a % b));
                break;

        }
    }

}
