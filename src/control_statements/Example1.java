package control_statements;

          // signal program


public class Example1 {

	public static void main(String[] args) {
		
		
		
	
		
		System.out.println("***********************************************************"); 
		// OR
		
		String currentState="green";
		
		 if(currentState.equals("green") ) {     //.equal("string") used in String concept
			System.out.println("GO");
			}
			else if(currentState.equals("red"))
		{
			System.out.println(" STOP");
			}
			else if(currentState.equals("orange"))
			{
				System.out.println(" WAIT");
				}
			else
			{
				System.out.println("SIGNAL NOT WORKING");
				}
		
	}

}
