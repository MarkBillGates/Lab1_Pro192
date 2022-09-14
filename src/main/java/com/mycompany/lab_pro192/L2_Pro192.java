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
Lesson 2 (2 points)

Write a program to input from the keyboard 2 sides of a rectangle. Calculate and
export the perimeter, area, and minor sides of a rectangle.

*/

public class L2_Pro192 {
  // Enter 2 sides of a rectangle 
    public static void getRectangle() throws IOException{
        Scanner rectangle = new Scanner(System.in);
        System.out.println("Enter 2 sides of a rectangle: ");
        // Read user input
        Float widthRectangle = rectangle.nextFloat();
        Float heighRectangle = rectangle.nextFloat();
        float periRectangle = (widthRectangle + heighRectangle) * 2;
        float areaRectangle = widthRectangle * heighRectangle;
        System.out.println("The perimeter of rectangle is: " + periRectangle);
        System.out.println("The area of rectangle is: " + areaRectangle);
        System.out.println("The minor sides of rectangle are: " + widthRectangle + " " + heighRectangle );
        
    }
}
