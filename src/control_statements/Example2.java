package control_statements;

import java.util.Scanner;



public class Example2 {

    public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner inputValue=new Scanner(System.in);
	System.out.println("Enter the Signal status");
	String currentStateOfSignal=inputValue.nextLine();
	System.out.println("State of signal is " + currentStateOfSignal);
	if (currentStateOfSignal.equals("Green"))
	{
	System.out.println("Go");
	}	
	else if(currentStateOfSignal.equals("Orange"))
	{
		System.out.println("Wait for while");
		}
	else if(currentStateOfSignal.equals("Red"))
	{
		System.out.println("Stop");
	}
	else
	{         System.out.println("Signal is off");    }
}
}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

