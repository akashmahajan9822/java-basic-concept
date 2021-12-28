package object_variables;    //package name

public class Concept001   { // class name

	String name="Akash Manoj Mahajan";
	int rollNo=10;         //instance variable
	char div='A';

	static int d=52;         //static variable
	
	public static void main(String[] args) {

		
// CREATING OBJECT S1  CLASSNAME REFVARIABLE=NEW CLASSNAME  to call instance variable
       
		Concept001 s1=new Concept001();
		
		System.out.println(s1.name);
		System.out.println(s1.rollNo);
		System.out.println(s1.div);
 
// call static variable
		System.out.println(Concept001.d);


	}

}
