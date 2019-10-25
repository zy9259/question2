/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.firstproject;
import java.util.*;

/**
 *
 * @author uwtsd-student
 */
public class Program 
{
    
    private static Scanner stdin = new Scanner(System.in);
    
    public static void main(String[] args)
    {
        //This program contains some deliberate bugs and is not finished!
        //Your job is to fix the errors and finish them.
        
        //Print "Hello, World" to console
        System.out.printf("Hello, World");
        
        //Read two numbers, then print the sum of them
        System.out.printf("Please enter first number: ");
        int num1 = Integer.parseInt(stdin.nextLine());
        
        System.out.printf("Please enter second number: ");
        int num2 = Integer.parseInt(stdin.nextLine());
        
        int result = num1 + num2;
        
        System.out.printf("The result is: %d", result);
        
        //Ask the user for their name and age, then tell them how old they will be in 10 years.
        //For example, if the user says that their name is Jane and they are 25, the program should output:
        //"Jane, you will be 35 in 10 years time."
        
        
        
    }
}
