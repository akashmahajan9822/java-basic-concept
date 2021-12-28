package object_variables;

             // non static variable use in all types of method.


public class Concept004 {

	     int P=55; 
		 byte Q=33;
		 long R=40;
		float S=50.5058f;
		double T=60.9872d;
		 //non static variable used in  static method
		// not recommended this method 
		//bz we can create object in static method which not serve any purpose
		public static  void case1() {
			Concept004 ob=new Concept004();
			System.out.println("non static variable used in  static method");
			System.out.println(ob.P);	
			System.out.println(ob.Q);	
			System.out.println(ob.R);	
			System.out.println(ob.S);	
			System.out.println(ob.T);	
			System.out.println("--------------------------------------------------------------");		
		}
		
		 //non static variable used in non static method
		public void case2() {
			System.out.println("non static variable used in non static method");
			System.out.println(P);	
			System.out.println(Q);	
			System.out.println(R);	
			System.out.println(S);	
			System.out.println(T);	
			System.out.println("--------------------------------------------------------------");		
		}
	
	public static void main(String[] args) {
		
		case1();// call static method
		Concept004 ob1=new Concept004()	;
		ob1.case2();  // call non static method
		
		// non static variable used in main method
		System.out.println(" non static variable used in main method");
		System.out.println(ob1.P);	
		System.out.println(ob1.Q);	
		System.out.println(ob1.R);	
		System.out.println(ob1.S);	
		System.out.println(ob1.T);	
		
	}

}
