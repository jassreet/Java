/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;
import java.util.Scanner;
//Test Case 1 :
//Enter the size of currency denominations 5
//5
//Enter the currency denomination to 0 position
//100
//Enter the currency denomination to 1 position
//50
//Enter the currency denomination to 2 position
//20
//Enter the currency denomination to 3 position
//1
//Enter the currency denomination to 4 position
//5
//Enter the amount you want to pay 450
//450
//Your payment approach in order to give min no of notes will be
//100 : 4
//50 : 1
/**
 *
 * @author DELL
 */
public class Notes {
    public static void main(String args[]){
        int size;
        int a[];
        int amount;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of currency denomination" );
    size = sc.nextInt();
    a=new int[size];
    
    for(int i=0; i<size; i++){
        System.out.println("Enter the currency denomination" +i );
        a[i] = sc.nextInt();
        
    }
    System.out.println("Enter the amout you want to pay");
    amount = sc.nextInt();
    System.out.println("Payement Approach ");
     
    }
}
