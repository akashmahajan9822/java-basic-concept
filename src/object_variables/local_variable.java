package object_variables;

public class local_variable {
  //declear and initializd static variable
	 static byte a=10;
	 static  short b=20;
	 static  int c=30;
	 static boolean d;
	
	public static void main(String[] args) {
		// declear and initializd local variable 
		
		byte a=100;
		 short b=200;
		 int c=300;
		
		// call local variable 
		
		 System.out.println(a);
			System.out.println(b);
			System.out.println(c); 
		 
		
			
			// call static variable in class 
			System.out.println(local_variable.a);
			System.out.println(local_variable.b);
			System.out.println(local_variable.c); 
			System.out.println(local_variable.d); 
			 
			
		 	 
		 
	}

	
}
