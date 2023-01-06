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
public class Constructor {
    Constructor(){
       System.out.println("Deafault"); 
    }
    Constructor(int a){
        System.out.println("Parameterized"+a);
    }
    
    public static void main(String args[]){
        Constructor d= new Constructor();
        Constructor p= new Constructor(3);
    }
}
