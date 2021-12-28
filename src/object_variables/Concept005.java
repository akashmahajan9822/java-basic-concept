package object_variables;

 // local variable use in all types of method.
// local variable is only for that method. we can not acces out of the method

public class Concept005 {
	
	 //local variable used in  static method
	public static  void case1() {
		  int P=55; 
			 byte Q=33;
			 long R=40;
			float S=50.5058f;
			double T=60.9872d;
			System.out.println("local variable used in  static method");	
			System.out.println(P);	
			System.out.println(Q);	
			System.out.println(R);	
			System.out.println(S);	
			System.out.println(T);	
			System.out.println("--------------------------------------------------------------");		
	}
	
	 //local variable used in non static method
	public void case2() {
		
		 int P=55; 
		 byte Q=33;
		 long R=40;
		float S=50.5058f;
		double T=60.9872d;
		System.out.println("local variable used in non static method");	
		System.out.println(P);	
		System.out.println(Q);	
		System.out.println(R);	
		System.out.println(S);	
		System.out.println(T);	
		System.out.println("--------------------------------------------------------------");		

		
	}
	
	
	public static void main(String[] args) {
	

		case1();// call static method
		Concept005 ob1=new Concept005()	;
		ob1.case2();  // call non static method
	
		 //local variable used in main method
		
		 int P=55; 
		 byte Q=33;
		 long R=40;
		float S=50.5058f;
		double T=60.9872d;
		System.out.println("local variable used in main method");	
		System.out.println(P);	
		System.out.println(Q);	
		System.out.println(R);	
		System.out.println(S);	
		System.out.println(T);	
		
	}
}
