package loops;

    //nasted loop   break   continue


public class Case4 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int x=1; x<=3; x++) 
		{
			for(int y=1; y<=3; y++){
				
				System.out.println("inner loop"+"value of x "+ x + " value of y" +y);		
				
				break;  // break whole loop execution
				}

			}
		
		System.out.println("******************************************************"); 
		
		
		for(int y=1; y<=5; y++)
		{
			if(y==2) {
				continue;}    // skip below execution only at current iteration (2nd) and continue execution
                        // and goes to next iteration
			
			if(y==4) {
				break;
			}
			
			System.out.println( " value of y" +y);		
			
			}
		
		
		
System.out.println("******************************************************"); 

		
		
		for(int x=1; x<=3; x++) 
		{
			for(int z=1; z<=3; z++) {
				if(z==2)
					continue;   // skip below execution only at current iteration (2nd) and continue execution
				                // and goes to next iteration
				System.out.println("inner loop"+"value of x "+ x + " value of z" +z);		
				
				}
			
			}
		
		
	System.out.println("******************************************************"); 

		
		
		for(int x=1; x<=3; x++) 
		{
			for(int z=1; z<=3; z++) {
				   
				System.out.println("inner loop"+"value of z "+ z );		
				
				}
			if(x==2)
				continue;
			System.out.println("outer loop"+"value of x "+ x );	  //  <---- skip this iteration at x==2
			}
		}

}
