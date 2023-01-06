/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author DELL
 */
public class FunctionOverloading {

    int area(int a) {
        return a * a;
    }

    int area(int a, int b) {
        return 2 * (a * b);
    }

    float area(float r) {
        return 22 / 7 * (r * r);
    }

    float area(float a, float b) {
        return 1 / 2 * a * b;
    }

    public static void main(String args[]) {
        System.out.println("Creating obejct to calculate area");
        FunctionOverloading fo = new FunctionOverloading();
        System.out.println("area of square = " + fo.area(3));
        System.out.println("area of rectangle = " + fo.area(5, 7));
        System.out.println("area of circle = " + fo.area(66));
        System.out.println("area of rohmbus = " + fo.area(30, 10));
    }
}
