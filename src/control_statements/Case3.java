package control_statements;

// IF - ELSE - IF statement  or ELSE - IF statement



public class Case3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cakeprice=800;
		
		 if(cakeprice<=300 ) {    
			System.out.println("buy 1kg of a cake");
			}
			else if(cakeprice>300 & cakeprice<500)
		{
			System.out.println(" buy 2kg of a cake");
			}
			else if(cakeprice==500)
			{
				System.out.println(" buy 5kg of a cake");
				}
			else
			{
				System.out.println("don't buy cake");
				}	 
		 	 
		 
		 
		 System.out.println("program ended");
			System.out.println("***********************************************************"); 
				
		 
		 
			float marks=1010.00f;
			
			 if(marks<35.00 ) {    
				System.out.println("fail with percentage:"+ marks);
				}
				else if(marks>=35.00 & marks<45.00)
			{
				System.out.println("pass with   percentage:"+ marks);
				}
				else if(marks>=45.00 & marks<60.00)
				{
					System.out.println("pass with second class  percentage:"+ marks);
					}
				else if(marks>=60.00 & marks<75.00)
				{
					System.out.println("pass with first class  percentage:"+ marks);
					}
				else if(marks>=75.00 & marks<=100.00)
					{
						System.out.println("pass with disting class  percentage:"+ marks);
						}
				else  if(marks>100.00)
				{
					System.out.println("invalid ");
					}	 
			 System.out.println("program ended");
			 
 System.out.println("***********************************************************");				           
		      
				// we can also used if statement in else condition
				
				int sub=1;
				int sub1=2;
				int sub2=3;
				
				 if(sub==2) {        
						System.out.println(sub);
						}
						else
					{
							 if(sub1==2) {          
									System.out.println(sub1);
									}
									else if(sub2==3)
								{
										System.out.println(sub2);
									}
						
						}
				
					 
			 
	}

}
