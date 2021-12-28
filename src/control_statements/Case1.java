package control_statements;

                          //IF only  statement

public class Case1 {

		
	
	public static void main(String[] args) {
		

		int price=1000;
		if (price<1000) {            //if( false condition & <= also used)
			System.out.println(price<1000); // show condition output on console
			System.out.println("program executed");
		
		}
		System.out.println("program ended");
	System.out.println("***********************************************************"); 	
	
		if (price>1000) {            //if( false condition & => also used)
			System.out.println(price>1000); // show condition output on console
			System.out.println("program executed");
		
		}
		System.out.println("program ended");
	System.out.println("***********************************************************"); 
		
		if (price==1000) {            //if(true condition)
			System.out.println(price==1000 );// show condition output on console
			System.out.println("program executed");
		
		}
		System.out.println("program ended");
	System.out.println("***********************************************************"); 
	
	
	
	
	System.out.println("after removing braces output at bothe true and false condition");
	
//if braces are remove then he consider only 1st statement after 'if statment'& remaining executed as it is.
 // advantage :after if we have only one statement then we can also used without condition

// at false condition	
	if (price<1000)             //if( condition)
		
		System.out.println(price==1000); // consider as a statement
		System.out.println("program executed");
	
	
	System.out.println("program ended");
System.out.println("***********************************************************"); 
	
// at true condition	
    if (price==1000)             //if( condition)
	
	System.out.println(price==1000); // consider as a statement
	System.out.println("program executed");


System.out.println("program ended");
System.out.println("***********************************************************"); 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}