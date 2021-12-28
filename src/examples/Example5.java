package examples;

public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		   *
//        **
//       ***
		for (int row=1; row<=3; row++) 
	    {
	     for(int colu=3; colu>=row; colu--) {
	    	
			System.out.print(" ");  
		}
	     for (int a=1; a<=row; a++)  {
		System.out.print("*");	  
	}
	     System.out.println();	
	  }	
		  System.out.println("=================================================");  		
		  for (int row=1; row<=3; row++) 
		    {
		     for(int colu=3; colu>=row; colu--) {
				
				System.out.print(" ");  
			}
		     for (int a=1; a<=row; a++)  {
			System.out.print("* ");	  
		}
		     System.out.println();	
		  }		  
		  
		  System.out.println("=================================================");  
		  
//		      *
//	         * *
//	        * * *
		  int alpha=64;
		  for (int row=1; row<=5; row++) 
		    {
		     for(int colu=1; colu<=row; colu++) {
		  
		    	 System.out.print((char)(alpha+ colu )+" ");	 
		  
		     }
		     System.out.println();	
		     }
	
		 
		  
	}

}
