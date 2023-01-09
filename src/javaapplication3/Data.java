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
        int student_id[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String first_name[] = new String[]{"Jatin", "Ashish", "Vishu", "Ekam", "Manmeet", "Jass", "Gopy", "Harleen", "Himanshu", "Arjun"};
        int m1[]  = new int[]{22, 24, 33, 34, 20, 35, 36, 26, 27, 28};
        int m2[] = new int[]{39, 54, 52, 38, 55, 50, 33, 57, 59, 45};
        char grade[]  = new char[]{'B', 'A', 'B', 'C', 'A', 'A', 'C', 'B', 'A', 'C'};
        int i;
        System.out.println("List all the students whose grade is A");
        for (i = 0; i < student_id.length; i++) {
            if (grade[i] == 'A') {
                System.out.println("Students Who Achieve Grade A " + first_name[i]);
            }
        }
        System.out.println("");
        System.out.println("List all the student who have secured more than 35 marks in m1");
        for (i = 0; i < student_id.length; i++) {
            if (m1[i] > 35) {
                System.out.println("student who have secured more than 35 marks in m1 " + first_name[i]);
            }
        }
        System.out.println("");
        System.out.println("Read the Student ID and print the record of the student");
        for (i = 0; i < student_id.length; i++) {
            System.out.println("Student ID and the record of the student " + first_name[i] + " " + m1[i] + " " + m2[i] + " " + grade[i] + " " + (m1[i]+m2[i]));
        }
    }
}
