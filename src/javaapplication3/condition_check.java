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
public class condition_check {
    public static void main(String args[]){
        int a=20;
        int b=30;
        int c=40;
        int s=a+b+c;
        if(a<b && b==c){
            System.out.print("Condidtion Right"+s);
           
        }
        else{
            System.out.print("Condition Wrong");
        }
    }
}
