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

Write a program to input monthly electricity usage and calculate electricity bill by
progressive method
If the number of electricity used is from 0 to 50, the price for each number is 1000
If the amount of electricity used is over 50, the price for each excess number of
electricity is 1200


*/

public class L3_Pro192 {
    public static void getElectricityBill() throws IOException{
         Scanner electricityBill = new Scanner(System.in);
         System.out.println("Enter your monthly electricity usage");
         Integer usageElectricity = electricityBill.nextInt();
         int priceElectricity;
         if( usageElectricity >= 0 && usageElectricity <= 50){
             priceElectricity = usageElectricity * 1000;
         }else{
             priceElectricity = (usageElectricity - 50) * 1200 + 50 * 1000;
         }
         System.out.println("The price of electricity is: " + priceElectricity);
    }
}
