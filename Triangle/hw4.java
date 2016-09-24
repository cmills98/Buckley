package TriangleWithException;

import java.util.*;


 class triangle  
 {
	 private double side1;
	 private double side2;
	 private double side3;
	 
	 
	 public triangle(double side1, double side2, double side3) throws IllegalTriangleException
	 {
		 
		 if(side1 + side2 <= side3 | side1 + side3 <= side2 | side2 + side3 <= side1)
		 {

			throw new IllegalTriangleException("You need to fix the length of your sides");
		 }
		 
		 else
			 System.out.println("Good Job!");
	 }
 }
 
 class IllegalTriangleException extends Exception
 {

	public IllegalTriangleException(String msg)
	{
		super(msg);
	}
 }
 
public class TriangleWithException {

	
public static void main(String[] args) throws IllegalTriangleException {

    Scanner input = new Scanner(System.in);

    // create triangle
    triangle tri;
    boolean done = false;
    double side1;
    double side2;
    double side3;

    System.out.println("Enter three sides: ");

    while (!done) {
        try {
            side1 = input.nextDouble();
            side2 = input.nextDouble();
            side3 = input.nextDouble();
            tri = new triangle(side1, side2, side3);
            done = true;
        }
        
        
        	catch(IllegalTriangleException e)
        	{
        		System.out.println(e.getMessage());
        		System.out.println("Enter three new sides: ");
        		System.out.println();
        	}
        
    
        
        
    }

}


 }
