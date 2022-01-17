package examples;

public class Patterns {

	public static void main(String[] args) {
		
		int size=3;
		System.out.println(" Problem 1: matrix");
		for (int row=1; row<=size; row++) 
	    {
	     for(int colu=1; colu<=size; colu++) {
			
			System.out.print(row + "*"+ colu+ ",");  //print write at same line
		
		}
	     System.out.println(":");	  //print to next line
	}
		
		
		System.out.println("==============================================================");
		System.out.println(" Problem 2: Right Triangle Star Pattern");
	
		for (int row=1; row<=size; row++) 
		   {
		    for(int colu=1; colu<=row; colu++)
		    {
			        System.out.print("*");  
		    }
		         System.out.println();	  
		   }
		
	      	//OR
		
		for (int row=1; row<=size; row++) 
	    {
	     for(int colu=1; colu<=size; colu++) {
			if(colu<=row)
			System.out.print(" *");  
			else
				System.out.print(" ");
		}
	     System.out.println();	  
	}
		
	
		System.out.println("==============================================================");
		
System.out.println(" Problem 3: Left Triangle Star Pattern");
		
		for (int row=1; row<=4; row++) 
	    {
	     for(int colu=4; colu>=row; colu--) {
	    	
			System.out.print(" ");  
		}
	     for (int a=1; a<=row; a++)  {
		System.out.print("*");	  
	}
	     System.out.println();	
	  }	
		
		
	               	//OR
		
			for (int row=1; row<=size; row++) 
		    {
		     for(int colu=1; colu<=size; colu++) {
				if(colu<=size-row)
				System.out.print(" ");  
				else
					System.out.print("*");
			}
		     System.out.println();	  
		}
	
		
	
	 System.out.println("==============================================================");
	 System.out.println(" Problem 4: Mirrored Right Triangle Star Pattern");
		
	 for (int row=1; row<=4; row++) 
	   {
	    for(int colu=4; colu>=row; colu--)
	    {
		        System.out.print("*");  
	    }
	         System.out.println();	  
	   }

  	//OR  NOT WORK
		
//		for (int row=0; row<=size; row++) 
//	    {
//	     for(int colu=0; colu<=size; colu++) {
//			if(colu<=size-row)
//			System.out.print("*");  
//			else
//				System.out.print(" ");
//		}
//	     System.out.println();	  
//	}
	 System.out.println("==============================================================");
			System.out.println(" Problem 5: Mirrored Left Triangle Star Pattern");
			for (int row=4; row>=1; row--) 
		    {
		     for(int colu=4; colu>row; colu--) 
		     {
		    	System.out.print(" "); 
				}
		     for (int a=1; a<=row; a++)  {
			System.out.print("*");	  
		}
		     System.out.println();	
		  }	

           	//OR
			
			for (int row=1; row<=size; row++) 
		    {
		     for(int colu=1; colu<=size; colu++) {
				if(colu>=row)
				System.out.print("*");  
				else
					System.out.print(" ");
			}
		     System.out.println();	  
		}
			
			
			System.out.println("==============================================================");
				System.out.println(" Problem 6: Right Pascal's Triangle");
		
		
				 for (int row=1; row<=4; row++) 
				   {
				    for(int colu=1; colu<=row; colu++)
				    {   
				    	System.out.print("*");  
				    }
			         System.out.println();	  
		    
			      }
				   
				   for (int row=1; row<=4; row++) 
				   {
				    for(int colu=4; colu>row; colu--)
				    {
					        System.out.print("*");  
				    }
				         System.out.println();	  
				         
				   }
				   
				   	//OR
					
					for (int row=1; row<=size; row++) 
				    {
				     for(int colu=1; colu<=size; colu++) {
						if(colu<=row)
						System.out.print("*");  
						else
							System.out.print(" ");
					}
				     System.out.println();	  
				}
					for (int row=1; row<=4; row++) 
					   {
					    for(int colu=4; colu>row; colu--)
					    {
						        System.out.print("*");  
					    }
					         System.out.println();	  
					   }

	
	System.out.println("==============================================================");
	System.out.println(" Problem 7: Left Pascal's Triangle");
			
	for (int row=1; row<=size; row++) 
    {
     for(int colu=1; colu<=size; colu++) {
		if(colu<=size-row)
		System.out.print(" ");  
		else
			System.out.print("*");
	}
     System.out.println();	  
}
	for (int row=1; row<=size; row++) 
    {
     for(int colu=1; colu<=size; colu++) {
		if(colu>row)
		System.out.print("*");  
		else
			System.out.print(" ");
	}
     System.out.println();	  
}
	
	
	System.out.println("==============================================================");
	System.out.println(" Problem 8:  Pyramid Star Pattern");
	//Left Triangle Star Pattern LOGIC USED
    
	for (int row=1; row<=4; row++) 
    {
     for(int colu=4; colu>=row; colu--) {
		
		System.out.print(" ");  
	}
     for (int a=1; a<=row; a++)  {
	System.out.print(" *");	  
}
     System.out.println();	
  }
	
	
	//OR
	
		for (int row=1; row<=size; row++) 
	    {
	     for(int colu=1; colu<=size; colu++) {
			if(colu<=size-row)
			System.out.print(" ");  
			else
				System.out.print("* ");
		}
	     System.out.println();	  
	}

	
	
	
	
	System.out.println("==============================================================");
	System.out.println(" Problem 9:   Reverse Pyramid Star Pattern");
	   // Mirrored Left Triangle Star Pattern
		for (int row=1; row<=size; row++) 
	    {
	     for(int colu=1; colu<=size; colu++) {
			if(colu>=row)
			System.out.print(" *");  
			else
				System.out.print(" ");
		}
	     System.out.println();	  
	}
		
		//OR
	int rows=8;  
	for (int i=1; i<= rows; i++)  
	{  
	for (int j=1; j<=i; j++)  
	{  
	System.out.print(" ");  
	}  
	for (int k=1; k<=rows-i; k++)  
	{  
	System.out.print(" *");  
	}  
	System.out.println();  
	}  

	
	
	
	System.out.println("==============================================================");
	System.out.println(" Problem 10:  Diamond Shape Pattern");
	
	
	
	
	
	System.out.println("==============================================================");
	System.out.println(" Problem 11:  Sandglass Star Pattern");
		
	
	
	System.out.println("==============================================================");
	System.out.println(" Problem 12:  Alphabet Star Pattern");
		
	
	System.out.println("==============================================================");
	System.out.println(" Problem 13:  Triangle Star Pattern");
		
	
	
	System.out.println("==============================================================");
	System.out.println(" Problem 14:   Down Triangle Pattern");
	
	
	System.out.println("==============================================================");
	System.out.println(" Problem 15:   Diamond Star Pattern");
	
	
	
	}

}
