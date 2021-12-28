package examples;

public class Example1 {

/* 1. print the even no till 20 using while loop
   2. print the odd no till 20 using while loop
   3. Write the simple java program to reverse the given no using while loop.
   4. Reverse string logic
   5.  count string length logic  
   6.Write a simple program using for loop to identify given no is perfect no.
   7.Write the simple java program using for loops to decide given no is prime or not?
*/
	
	public static void main(String[] args) {
		

		System.out.println("odd and even");
		for(int x=50; x<=100; x++)
		{
			if(x%2==0)   // remainder 0 then even no and if block executed
			         	// remainder 1 then odd no and else block executed
			{
				System.out.println("even no is " + x);
			}
			else    
			System.out.println("odd no is "+ x);
			
		}	
		
		
		System.out.println("******************************************************");   		
		System.out.println("print the even no till 20 using while loop");
		  // print the even no till 20 using while loop
		
		int Even_No=0;
		while(Even_No<10) {
			Even_No=Even_No+2;
			System.out.println(Even_No); 	
		}
		
		
		
		
		System.out.println("******************************************************");   
		System.out.println("print the odd no till 20 using while loop");
		// print the odd no till 20 using while loop
		
		int odd_No=1;
		while( odd_No<19)
		   {
				 odd_No=odd_No+2;
			System.out.println( "odd no "+odd_No); 	
	       }	
		
		System.out.println("******************************************************");
		System.out.println("odd from 20 o 1");
		// odd from 20 o 1
		
		int odd_No_1=19;
		while( odd_No_1>1) {
			System.out.println( odd_No_1);
			 odd_No_1=odd_No_1-2;
			
			 System.out.println( "odd no "+ odd_No_1); 	
		}	
		
		
		System.out.println("******************************************************");   

		System.out.println("Write the simple java program to reverse the given no using while loop.");
		 // Write the simple java program to reverse the given no using while loop.
		
		int y=1234;
		
		int remainder=0;
		int reverseNo=0;
		
		while (y!=0)
		{
			remainder=y%10;    //modules or remainder 
			reverseNo=reverseNo*10+remainder;    //1st 0*10+4=4, 2nd 4*10+3=43;
			y=y/10;
			
			}
		System.out.println("Reverse number value  " + reverseNo);
		
		
		System.out.println("******************************************************");
		
		
	System.out.println("4. Reverse string logic");
		// 4. Reverse string logic

		String s="ABCD";
		String rev="";
		System.out.println(s.length());   // show length  of string    s.length()   s= is string variable name
		System.out.println(s.charAt(0));  // show each character of string  s.charAt()  character at index
		System.out.println(s.charAt(1));
		System.out.println(s.charAt(2));
		System.out.println(s.charAt(3));
		
		for(int i=s.length()-1; i>=0; i--) {     // s.length show string length
			
			rev =rev + s.charAt(i);
			
			}
		System.out.println("reverse string "+ rev);
		
		System.out.println("*****************************************************************************************************");
		System.out.println("5.  count string length logic");
		 //5.  count string length logic  
		int count=0;
for(int i=1; i<=s.length(); i++) {     // s.length show string length
			
			count++;
			}
		 System.out.println("lengthof the string : "+count);
		 System.out.println(s.length());   // show length  of string    s.length()   s= is string variable name
		
		
		 System.out.println("*****************************************************************************************************");
	
		 System.out.println("6.Write a simple program using for loop to identify given no is perfect no.");
		 //6.Write a simple program using for loop to identify given no is perfect no.
	
	int sum=0;
	int no=6;
	
		for (int i=1; i<no; i++) 
		{
			if(no%i==0) 
			sum+=i;   
		}   
		
		if(sum==no)
		System.out.println( no+" is a perfect no is: ");
		else
			System.out.println( no+ " is a non perfect no is: ");
		
		
System.out.println("*****************************************************************************************************");
		
	
	//7.Write the simple java program using for loops to decide given no is prime or not?
	// no divisible by itself and 1 called prime no
System.out.println("7.Write the simple java program using for loops to decide given no is prime or not?");
	
  int number=6, condition=0;
	
	if(number==0||number==1){  
	 System.out.println(number+" is not prime number");      
		  }
	else { 
	for(int i=2; i<number; i++)
	{   
		if(number%i==0)
			condition+=1; 
	}
	 
	if(condition==0)
		System.out.println(number+" is prime no");
	else
		System.out.println(number+" is not prime no");
		  }
	
	
	}

}
