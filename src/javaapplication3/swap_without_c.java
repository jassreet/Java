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
public class swap_without_c {
    public static void main(String args[]){
        int a=20;
        int b=10;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Value of a after swap"+a);
        System.out.println("Value of b after swap"+b);
    }
}
