package examples;



//*
//**
//***
public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("problem 2");
		System.out.println("A");
			
		for (int row=1; row<=3; row++) 
		{
		   for(int colu=1; colu<=3; colu++) {
				if(colu<=row)
		         {
			        System.out.print("*");  
		         }
		      else 
		           {
			        System.out.print("");
		           }
			}
			System.out.println();	 
		}

		System.out.println("=================================================");
		System.out.println("B");

		for (int row=1; row<=3; row++) 
		{
		for(int colu=1; colu<=3; colu++)
		   {
			 if(colu<=row)
		    {
		       System.out.print("*");  
		    }

		  }
		    System.out.println();	
		}
		System.out.println("=================================================");
		System.out.println("C explain");
		 
		for (int row=1; row<=3; row++) 
		   {
		    for(int colu=1; colu<=row; colu++)
		    {
			        System.out.print("*");  
		    }
		         System.out.println();	  
		   }
		System.out.println("=================================================");
		System.out.println("d ");
		
		int i, j, row=6;   
		//outer loop for rows  
		for(i=0; i<row; i++)   
		{   
		//inner loop for columns  
		for(j=0; j<=i; j++)   
		{   
		//prints stars   
		System.out.print("* ");   
		}   
		//throws the cursor in a new line after printing each line  
		System.out.println();   
		} 
	
	
	}

}
