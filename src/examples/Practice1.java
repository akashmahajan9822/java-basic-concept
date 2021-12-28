package examples;

public class Practice1 {

	public static void main(String[] args) {
		
System.out.println(" Problem 1: FibonacciExample1");
		
		
int n1=0,n2=1,n3,i,count=10;     
for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
{    
 n3=n1+n2;    
 System.out.print(" "+n3);    
 n1=n2;   
 n2=n3;    
} 
System.out.println(" ");   

System.out.println("******************************************************");   

System.out.println("Write the simple java program to reverse the given no using while loop.");
 // Write the simple java program to reverse the given no using while loop.

int y=1234, remain=0, revNo=0;

while (y!=0)
{
	remain=y%10;    //modules or remainder 
	revNo=revNo*10+remain;    //1st 0*10+4=4, 2nd 4*10+3=43;
	y=y/10;
	
	}
System.out.println("Reverse number value  " + revNo);



System.out.println(" *****************************************************");

//palindrome number is a number that is same after revers
// same as reverse number just compare reverse no and input no.
	
System.out.println(" Problem 3: palindrome number is a number that is same after revers");
	
	
	
int number=12321, remainder=0, reverseNo=0 , temp=number  ;

while (number!=0)
{
	remainder=number%10;    //modules or remainder 
	reverseNo=reverseNo*10+remainder;    //1st 0*10+4=4, 2nd 4*10+3=43;
	number=number/10;
	
	}
if(reverseNo==temp)
System.out.println(reverseNo+ " is a palindrome number  " );
	
else 	
	System.out.println(reverseNo+ " is not a palindrome number  "  );

System.out.println(" *****************************************************");
System.out.println(" Problem 3: Factorial Program");
//4! = 4*3*2*1 = 24  
//5! = 5*4*3*2*1 = 120

int factor=1, input=5;
for(int i1=1; i1<=input; i1++) {
	factor=factor*i1;
}

System.out.println(factor+" is a factor of "+ input);

System.out.println(" *****************************************************");
//System.out.println(" Problem 5: Armstrong number");
//3: 31 = 3
//153: 13 + 53 + 33 = 1 + 125+ 27 = 153
//125: 13 + 23 + 53 = 1 + 8 + 125 = 134 (Not an Armstrong Number)
//1634: 14 + 64 + 34 + 44 = 1 + 1296 + 81 + 256 = 1643
	
System.out.println(" Problem 5: Random Number");



	}
}
