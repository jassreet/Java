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
    public class Animals
            {
              int legs;
              int eyes;
              String colour;
                  void classFunction(){
                      System.out.println("class function");
                  }
               
              
     public static void main(String args[]){
                  Animals dog=new Animals();
                  //dog.classFunction();
                  dog.legs = 4;
                  System.out.println("Dog legs = " +dog.legs);
                  dog.eyes = 2;
                   System.out.println("Dog eyes = " +dog.eyes);
                  dog.colour = "brown";
                  System.out.println("Dog colour = " +dog.colour);
           }

    
}
