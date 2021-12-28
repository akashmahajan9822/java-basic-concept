package object_variables;

public class class_b {
	
	
	public static void main(String[] args) {
		
		class_a A=new class_a();
		
			System.out.println(A.X);  // call instance variable from class_a to class_b

			System.out.println(class_a.Z); // call static variable from class_a to class_b
		
			
			// call static variable from local_variable to class_b
					
			System.out.println(local_variable.a);
			System.out.println(local_variable.b);
			System.out.println(local_variable.c); 
		 
	 	 
	 
			
			
			
	}
}
