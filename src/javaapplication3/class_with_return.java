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
public class class_with_return {

    int classFunction() {
        System.out.println("class function");
        return 2;
    }

    void withargumentnoreturn(int a) {
        System.out.println("value of a" + a);
    }

    int withargumentreturn(int a, int b) {
        return a + b;
    }
    

    public static void main(String args[]) {
        class_with_return dog = new class_with_return();
        int a = dog.classFunction();
        System.out.println("value of a is" + a);
        System.out.println("vale of a is" + dog.classFunction());
        dog.withargumentnoreturn(3);
        dog.withargumentreturn(5, 10);
        System.out.println("sum of a and b is" + dog.withargumentreturn(5, 10));
    }
}
