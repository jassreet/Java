/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;
//Take three variables of one of int and second of float and third double 
//and save their sum in int, float and double variables with explicit type casting

/**
 *
 * @author DELL
 */
public class TypeCasting {

    public static void main(String args[]) {
        int a = 10;
        float b = 20f;
        double c = 30;
        int SumInt = (int) (a + b + c);
        System.out.println("Sum is" +SumInt);
        float SumF = (float) (a + b + c);
        System.out.println("Sum is" +SumF);
        double SumD = (double) (a + b + c);
        System.out.println("Sum is" +SumD);
    }

}
