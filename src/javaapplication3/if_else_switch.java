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
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a");
        int a=sc.nextInt();
        System.out.println("enter the value of b");
        int b=sc.nextInt();
        System.out.println("enter the value of c\n1 for addition\n2for subtraction\n3for division\n4for multiplication\n5for remainder");
        int c=sc.nextInt();
        switch(c) {
            case 1:
                System.out.println("ans is "+(a+b));
            
            break;
            case 2:
                System.out.println("ans is "+(a-b));
            
            break;
            case 3:
                System.out.println("ans is "+(a/b));
            
            break;
            case 4:
                System.out.println("ans is "+(a*b));
            
            break;
            case 5:
                System.out.println("ans is "+(a%b));
            break;
            default:
            System.out.println("not valid");
            break;
        }
        }

}
