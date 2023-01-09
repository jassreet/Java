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
public class Data {

    public static void main(String args[]) {
        int Student_Id[];
        String First_name[];
        int M1[];
        int M2[];
        int Total[];
        String Grade[];
        Student_Id = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        First_name = new String[]{"Jatin", "Ashish", "Vishu", "Ekam", "Manmeet", "Jass", "Gopy", "Harleen", "Himanshu", "Arjun"};
        M1 = new int[]{22, 24, 33, 34, 20, 35, 36, 26, 27, 28};
        M2 = new int[]{39, 54, 52, 38, 55, 50, 33, 57, 59, 45};
        Grade = new String[]{"B", "A", "B", "C", "A", "A", "C", "B", "A", "C"};
        int i;
        System.out.println("List all the students whose grade is A");
        for (i = 0; i < Student_Id.length; i++) {
            if (Grade[i] == "A") {
                System.out.println("Students Who Achieve Grade A " + First_name[i]);

            }
        }
        System.out.println("");
        System.out.println("List all the student who have secured more than 35 marks in M1");
        for (i = 0; i < Student_Id.length; i++) {
            if (M1[i] > 35) {
                System.out.println("student who have secured more than 35 marks in M1 " + First_name[i]);
            }
        }
        System.out.println("");
        System.out.println("Read the Student ID and print the record of the student");
        for (i = 0; i < Student_Id.length; i++) {
            System.out.println("Student ID and the record of the student " + First_name[i] + " " + M1[i] + " " + M2[i] + " " + Grade[i]);
        }
    }
}
