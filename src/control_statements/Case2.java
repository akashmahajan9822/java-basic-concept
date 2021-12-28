package control_statements;

        // IF - ELSE statement

public class Case2 {

	public static void main(String[] args) {
		
		int cakeprice=500;
		
		 if(cakeprice<500) {    //if( false condition )
			System.out.println("buy cake");
			}
			else
		{
			System.out.println("don't buy cake");
			}
System.out.println("***********************************************************"); 
	
        	if(cakeprice>500) {          //if( false condition )
			System.out.println("buy cake");
			}
			else
		{
			System.out.println("don't buy cake");
			}
System.out.println("***********************************************************"); 
	    
         if(cakeprice==500) {          //if( false condition )
			System.out.println("buy cake");
			}
			else
		{
			System.out.println("don't buy cake");
			}
		System.out.println("***********************************************************"); 
		
			
		//without condition also used as it has only one statement to execute
	// at multple statement we have to used compulsary braces
		System.out.println("after removing braces output program  ");
             if(cakeprice==500) 		
			System.out.println("buy cake");
				else
			System.out.println("don't buy cake");
          
             
             
  System.out.println("***********************************************************");				           
      
	// we can also used if statement in else condition
	
	int sub=1;
	int sub1=1;
	int sub2=1;
	
	 if(sub==2) {        
			System.out.println(sub);
			}
			else
		{
				 if(sub1==3) {          
						System.out.println(sub1);
						}
						else
					{
							System.out.println(sub2);
						}
			
			}
	
		
	
	
	}
}
