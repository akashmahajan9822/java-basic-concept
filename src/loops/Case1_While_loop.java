package loops;


    //     while (condition true/false) {
	//     body execute till when condition is  true
    // when condition false it stop to execute
    //    }


public class Case1_While_loop {

	public static void main(String[] args) {
		int x=1;
	
		while (x<10) {
			
		System.out.println("hi" +x);  
			
			x++ ;
			}	
		System.out.println("******************************************************"); 	
	int xx=10;
		while (xx>1)
		{
					//body
					//actions
			System.out.println("Hi " + xx);
			//update
			
			--xx;
		}
	
		System.out.println("******************************************************"); 
      
		int y=23253522;
		int length=0;
		while (y!=0)
		{
			y=y/10;	
			length =length+1;
			System.out.println("length " + length);
			
		}
		System.out.println("length of the y is " + length);
		
		System.out.println("******************************************************"); 	
	// we can used if in while also
		
		
		int z=1;
		  while (z<12)
		   {
			 System.out.println("hi " +z);  
			       if (z==6)
			          {	
		              break;
	                  }
			z++ ;
			
		    }
		  System.out.println( "loop completed");
	}	
}
