package Strings_Arrays_Streams;

//Java Program to find the if the arrays are equal
//Write a Java program to create a generic method that takes two arrays and checks if they have the same elements in the same order

import java.util.Arrays;

public class CheckArraysEqual {
	
 public static void main(String[] args)
 {
     // Initializing the first array
     int a[] = { 30, 25, 40, 23 };

     // Initializing the second array
     int b[] = { 30, 25, 40, 23 };

     // store the result
     // Arrays.equals(a, b) function is used to check
     // whether two arrays are equal or not
     boolean result = Arrays.equals(a, b);

     // condition to check whether the
     // result is true or false
     if (result == true) 
     {
         // Print the result
         System.out.println(" Same elements in same order");
     }
     else 
     {
         // Print the result
         System.out.println(" Not same elements as per order ");
     }
 }
}
