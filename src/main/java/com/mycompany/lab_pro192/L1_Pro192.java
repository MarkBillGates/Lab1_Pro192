/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_pro192;
import java.util.Scanner; 
import java.io.*;
/**
 *
 * @author Admin
 */

/* 
Lesson 1 (2 points)

Write a program that allows entering student's full name, average score from the
keyboard, then output to the screen in the format: <<full name>> << average score
>> .

*/

public class L1_Pro192 {
     // Enter student information 
    public static void getStudent() throws IOException{
        // Create Scanner Object
        Scanner student = new Scanner(System.in);
        System.out.println("Enter full name and the average score of student");
        // Read user input 
        String fullName = student.nextLine();
        Float averageScore = student.nextFloat();  
        System.out.println("<<" + fullName + ">>" + "<<" + averageScore + ">>");
    }
}
