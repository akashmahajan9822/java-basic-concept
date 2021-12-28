package methods;

public class concept_of_arguments {

   
	public static void method(int w) {
		
	System.out.println("static method with argument running method "+'w' + w);
		
     }	
	
	
	public static void method2(int x , int y) {
		
		int c = x +y ;
		
		System.out.println("static method with argument running method2 "+'c' + c);
			
	     }	
	
	
	public static void main(String[] args) {

  // call static method in main mehtod
		method(100);
		method2(10,20);
	
		
	}

}
