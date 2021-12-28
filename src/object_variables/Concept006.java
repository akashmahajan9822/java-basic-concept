package object_variables;

      // Q1.local variable value move to global variable
      // Q2.global value move to local value

public class Concept006 {

	static int x;       //Static variables
	int w=30;          // non Static variables
	
	public static void main(String[] args) {

//case1 local variable to static variable
		int y=10;
		Concept006.x=y;             

		System.out.println("local value to static value x="+Concept006.x);
//case2 local variable to static variable
		int x=20;
		Concept006.x=x;             
		System.out.println("local value to static value x="+Concept006.x);
//case3	static variable to local variable
		y=Concept006.x;           
		System.out.println("static value to local value y="+y);
			
//case4	non static variable to local variable
		Concept006 ob02=new Concept006();    //object creation
	      y= ob02.w;
	      System.out.println("non static value to local value y="+y);
//case5  local variable to non static variable   
	      ob02.w = x;    
	       System.out.println("local value to non static value w="+ob02.w);	    
	  int w= 100;
	  ob02.w = w;
	       
	       ob02.method(); // call instance method
	}

//case 6 local variable to instance or non static variable in main method
// by using  this concept	
	
	public  void method() {
	//point1
		int z=40;
		  w =z;   //move local to instance int w
		  System.out.println("local value to non static value in instance method w="+w);	  
	//point2
		  int w=50;
		  this.w =w; 
//this used only for instance method to show instance variable if same name for local and global in instance method
		  System.out.println("local value to non static value in instance method w="+w);
	}
}
