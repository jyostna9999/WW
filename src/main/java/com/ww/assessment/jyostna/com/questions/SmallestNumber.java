package com.ww.assessment.jyostna.com.questions;

import java.util.Random;
import java.util.Scanner;

public class SmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    int input;
        int[] arraylist = new int[500];
 
        random(arraylist); // Creates random numbers
        arraySort(arraylist); // Sorts random numbers
 
        do{
            System.out.print("Please enter a number between 1 and 500: ");
            Scanner sc = new Scanner(System.in);
            input   = sc.nextInt();                 
        }while(input < 1 || input > 500);
 
        // random numbers to string.
        String result ="";
            for (int j = 0; j < arraylist.length; j++) {
                result += " " + arraylist[j];
            }
 
        // Print all random numbers
        System.out.println("The Numbers are" + result);
 
        // Print user input nth number.
        if(input == 1)
        {
            System.out.println("The " + input + "st number is " + findNthSmallestNumber(input,arraylist) + ".");
            
        }
        else if(input == 2)
        {
            System.out.println("The " + input + "nd number is " + findNthSmallestNumber(input,arraylist) + ".");
            
        }
        else if(input == 3)
        {
            System.out.println("The " + input + "rd number is " + findNthSmallestNumber(input,arraylist) + ".");
            
        }
        else
        {
            System.out.println("The " + input + "th number is " + findNthSmallestNumber(input,arraylist) + ".");
        }   
    } 
 
    /** random number find method */
    public static void random(int[] arraylist)
    {
        for(int i=0; i < arraylist.length; i++)
        {
        	Random r = new Random();
        	arraylist[i]  = r.nextInt(500);
        }
    } 
 
    /** Array sort method */
    public static void arraySort(int [] arraylist){
        int temp;   
        for (int i=1; i<arraylist.length; i++){
            for(int j=0; j < arraylist.length-i; j++){
                if (arraylist[j] > arraylist [j+1]){
                    temp = arraylist [j];
                    arraylist [j] = arraylist [j+1];
                    arraylist [j+1] = temp;
                }
            }
        }
    } 
 
    /** find nth smallest method. */
    public static int findNthSmallestNumber(int n, int[] numbers){
        return numbers[n-1];
    }
}
	

