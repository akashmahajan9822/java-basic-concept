package object_variables;

                  //static variable use in all types of method.

public class Concept003 {

	
	static int P=55; 
	static byte Q=33;
	static long R=40;
	static float S=50.5058f;
	static double T=60.9872d;
	
	      //static variable used in  static method
public static void case1() {
		// local variable of static method
	 int P=44; 
	 byte Q=22;
	 long R=30;
	 float S=400.5058f;
	 double T=500.9872d;
	 System.out.println("static variable used in  static method");
	 System.out.println(Concept003.P);	
		System.out.println(Concept003.Q);	
		System.out.println(Concept003.R);	
		System.out.println(Concept003.S);	
		System.out.println(Concept003.T);	
		System.out.println("--------------------------------------------------------------");		

		System.out.println(P);	
		System.out.println(Q);	
		System.out.println(R);	
		System.out.println(S);	
		System.out.println(T);	
		
		System.out.println("--------------------------------------------------------------");	
		
}
	
              //static variable used in non static method
public  void case2() {
	 System.out.println("static variable used in non static method");	
	System.out.println(Concept003.P);	
	System.out.println(Concept003.Q);	
	System.out.println(Concept003.R);	
	System.out.println(Concept003.S);	
	System.out.println(Concept003.T);	
		
	}
	
	
	public static void main(String[] args) {

		
		case1(); // call static method
		Concept003 ob2=new Concept003()	;
		ob2.case2();  // call non static method
		System.out.println("--------------------------------------------------------------");		
		
		//static variable used in main method
		 System.out.println("static variable used in main method");		
		System.out.println(Concept003.P);	
		System.out.println(Concept003.Q);	
		System.out.println(Concept003.R);	
		System.out.println(Concept003.S);	
		System.out.println(Concept003.T);	
		
		
	}

}
