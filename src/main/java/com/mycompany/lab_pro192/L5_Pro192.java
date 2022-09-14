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
Lesson 5 (2 points)

Write a program to organize a menu with 4 functions to call the above 4 items and a
function to exit the application.

*/
public class L5_Pro192 {
    public static void callFunction() throws IOException{
        Scanner callItem = new Scanner(System.in);
        // Menu items
        System.out.println("---> Menu <---");
        System.out.println("1 -> Lesson1. Name and average of student");
        System.out.println("2 -> Lesson2. Rectangle ");
        System.out.println("3 -> Lesson3. Electricity bill");
        System.out.println("4 -> Lesson4. Check prime number");
        System.out.println("5 -> Exit");
        // Enter your choice 
        System.out.println("Enter your choice to call item functions");
        Integer chooseNumber = callItem.nextInt();
        switch(chooseNumber){
            case 1 -> L1_Pro192.getStudent();
            case 2 -> L2_Pro192.getRectangle();
            case 3 -> L3_Pro192.getElectricityBill();
            case 4 -> L4_Pro192.primeNumber();
            case 5 -> System.exit(0); 
        }
    }
}
