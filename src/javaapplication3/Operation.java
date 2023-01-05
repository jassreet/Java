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
public class Operation {

    int a;
    int b;
    int c;

    void classFuction() {
        System.out.println("class function");
    }

    void subtract(int a, int b) {
        System.out.println("Ans is" + (a - b));
    }

    void division() {
        System.out.println("Ans is" + (a / b));
    }

    void multiply() {
        System.out.println("Ans is" + (a * b));
    }

    void remainder() {
        System.out.println("Ans is" + (a % b));
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Operation op = new Operation();
        System.out.println("Enter the value of a");
        op.a = sc.nextInt();
        System.out.println("Enter the value of b");
        op.b = sc.nextInt();
        System.out.println("select the operation \n1 for addition \n2 for subtraction \n3 for division \n4 for multiply \n5 for remainder");
        op.c = sc.nextInt();
        switch (op.c) {
            case 1:
                System.out.println("Ans is" + (op.a + op.b));
                break;
            case 2:
                op.subtract(op.a, op.b);
                break;
            case 3:
                op.division();
                break;
            case 4:
                op.multiply();
                break;
            case 5:
                op.remainder();
                break;

        }

    }

}
