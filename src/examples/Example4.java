package examples;

public class Example4 {
	
	
//	***
//	**
//	*

	public static void main(String[] args) {
		System.out.println("problem 3    Reverse Q2");
		System.out.println("A");	
		    
		   for (int row=1; row<=3; row++) {
		         for(int colu=1; colu<=3; colu++) {
		        	    
		        	 if(colu>=row) 
		        	 System.out.print("*");  
		        	 
		      }
		         System.out.println();	
		         }
		   
		   System.out.println("=================================================");   
		   System.out.println("B");
		   
		   for (int row=1; row<=3; row++) 
		      {
		          for(int colu=1; colu<=3; colu++)
		          {
		 		 if(colu>=row)
		 	            {
		 		        System.out.print("*");  //print write at same line
		 	            }
		 	         else 
		 	              {
		 		        System.out.print("");
		 	              }
		 	    }
		 	     System.out.println();	  //print to next line
		       }
		   
		   System.out.println("=================================================");   
		   System.out.println("C");  
		   
		   for (int row=1; row<=3; row++) 
		   {
		    for(int colu=3; colu>=row; colu--)
		    {
			        System.out.print("*");  
		    }
		         System.out.println();	  
		   }
			
			
		   System.out.println("=================================================");  		
			
//		   *
//		   **
//		   ***
//		   **
//		   *	
		   
		   for (int row=1; row<=3; row++) 
		   {
		    for(int colu=1; colu<=row; colu++)
		    {   
		    	System.out.print("*");  
		    }
	         System.out.println();	  
    
	      }
		   
		   for (int row=1; row<=3; row++) 
		   {
		    for(int colu=3; colu>row; colu--)
		    {
			        System.out.print("*");  
		    }
		         System.out.println();	  
		   }
		   
		System.out.println("=================================================");  		
					   

	}

}
