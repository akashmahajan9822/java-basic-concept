package object_variables;

public class Concept002 {

// DECLEAR VARIABLES
	
	String name ;                  //non static
	int rollNo ;                   //non static
	static char div = 'A' ;       // STATIC VARIABLE
	
	static String name2="DHONI";  // STATIC VARIABLE
	
	
	
	public static void main(String[] args) {
		
Concept002 ss1=new Concept002();  // CREATING OBJECT S1 
Concept002 ss2=new Concept002();  // CREATING OBJECT S2

//initialized variable WTH REFERNCE TO OBJECT

		ss1.name="Akash Manoj Mahajan";
		ss1.rollNo=10;
		
	    System.out.println(ss1.name);
		System.out.println(ss1.rollNo);
		System.out.println(div);
	
		ss2.name="Virat kohli";
		ss2.rollNo=11;
		
		
		System.out.println(ss2.name);
		System.out.println(ss2.rollNo);
		System.out.println(div);
	
	// CALL STATIC VARIABLE (NO NEED TO USED OBJECT)	
	 
		 System.out.println(name2);	 
		      //OR
		 System.out.println(Concept002.name2);	
		 // OR USEND OBJECT
		// Concept002 ss3=new Concept002();
		// System.out.println(ss3.name2);
	}

}
