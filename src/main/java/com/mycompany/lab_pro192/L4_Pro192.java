/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_pro192;
/**
 *
 * @author Admin
 */

import java.util.Scanner; 
import java.io.*;

/* 
Lesson 4 (2 points)

Write a program that input an integer from the keyboard and indicate whether the
number is prime or not (prime number is a number that is only divisible by 1 and
itself .

*/
public class L4_Pro192 {
   public static void primeNumber() throws IOException{
       Scanner number = new Scanner(System.in);
       System.out.println("Enter integer number: ");
       Integer primeNumber = number.nextInt();
       if(isPrime(primeNumber)) {
            System.out.println(primeNumber + " is prime number");
        }
        else{
            System.out.println(primeNumber + " is a non-prime number");
        }
   }
   static  boolean isPrime(int num)
    {
        if(num<=1)
        {
            return false;
        }
       for(int i=2;i<=num/2;i++)
       {
           if((num%i)==0)
               return  false;
       }
       return true;
    }
}
