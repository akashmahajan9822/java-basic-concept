package methods;

public class BeforeMainmethod {
	
	// by using static block
 static  {
		
		System.out.println("hellow");
		
	}
 
 
 // by using initialization we initialized static vatriable using static method having return type is same as that variable 
	
//	public static int print() {
//		
//		System.out.println("hellow");
//		return 0;
//	}
//
//	public static int value= print();
//	
	
	public static void main(String[] args) {
		
		System.out.println("main");	
		
	}
}
