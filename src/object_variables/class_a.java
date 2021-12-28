package object_variables;

public class class_a {
	
	// pass one class A variable to class B 

	
	int X= 10;
	static int Z=50;
	
	//pass local variable value to global variable
	 static int s;
	 int w;
	
	public static void main(String[] args) {
		
		System.out.println(class_a.s);  // value of static variable
		int p =40;                     
		class_a.s =p;                    // value of static variable =p
		System.out.println(class_a.s);  
		int s =50;
		class_a.s =s;                     // value of static variable =s
		System.out.println(class_a.s);
	 
		class_a ob1=new class_a();
		    ob1.w =s;
		    System.out.println(ob1.w);
		
	}

}
