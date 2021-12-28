package examples;

public class Example2 {
//	***
//	***
//	***

	public static void main(String[] args) {
		
 System.out.println("problem 1");	
 System.out.println("A");
 
  for (int row=1; row<=3; row++) 
     {
         for(int colu=1; colu<=3; colu++)
         {
		 if(colu<=row)
	            {
		        System.out.print("*");  //print write at same line
	            }
	         else 
	              {
		        System.out.print("*");
	              }
	    }
	     System.out.println();	  //print to next line
      }
		
System.out.println("=================================================");	
System.out.println("B");

for (int row=1; row<=3; row++) 
{

	for(int colu=1; colu<=3; colu++) {
		
	if(colu==row) {
		System.out.print("*");  //print write at same line
	}
	else {
		System.out.print("*");
	   }
	}
	System.out.println();	  //print to next line
}





System.out.println("=================================================");	
System.out.println("C explain ");
  
for (int row=1; row<=10; row++) 
    {
     for(int colu=1; colu<=10; colu++) {
		
		System.out.print("*");  //print write at same line
	
	}
     System.out.println();	  //print to next line
}

System.out.println("==============================================================");	




	
	}

}
