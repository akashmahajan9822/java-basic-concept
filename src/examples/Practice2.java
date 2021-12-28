
//Random Number:

//in Java programming, we often required to generate random numbers while we develop applications.
//Many applications have the feature to generate numbers randomly, such as to verify the user many applications use the OTP. 

  
//Random numbers are the numbers that use a large set of numbers and selects a number using the mathematical algorithm.
//      It satisfies the following two conditions:
//  //The generated values uniformly distributed over a definite interval.
//  //It is impossible to guess the future value based on current and past values

//Using the random() Method
//Using the Random Class
//Using the ThreadLocalRandom Class
//Using the ints() Method (in Java 8)

package examples;

import java.lang.Math;
public class Practice2 {

	public static void main(String[] args) {
		System.out.println(" Problem 1: Random Number Using the random() Method");
// It generates only double type random number greater than or equal to 0.0 and less than 1.0. 
//Before using the random() method, we must import the  "java.lang.Math class".
	

System.out.println("1st Random Number: " + Math.random());   
System.out.println("2nd Random Number: " + Math.random());  
System.out.println("3rd Random Number: " + Math.random());   
System.out.println("4th Random Number: " + Math.random()); 
System.out.println("******************************************************");   

//create a program that generates random numbers between 200 to 400.
System.out.println("create a program that generates random numbers between 200 to 400.");

int min = 200, max =400;
System.out.println("Random value of type double between "+min+" to "+max+ ":");    
double a = Math.random()*(max-min+1)+min;   
System.out.println(a); 
	
System.out.println("Random value of type int between "+min+" to "+max+ ":");  
int b = (int)(Math.random()*(max-min+1)+min);  
System.out.println(b);

	}

}
