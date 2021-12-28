package methods;

public class non_static_method {
//case1
	
	
	public  void method1() {   // instance method without parameter
		
		  System.out.println("Non-static method running");
			
		 }
//case2  
	public  void method2(int Q) {   // instance method with parameter
		
		  System.out.println("Non-static method with parameter running");
			
		 }
	
//case3	  static variable used in non static method  
	
	static int a=55;  // static variable in static level
	
	
	public  void method3() {
		
		System.out.println(non_static_method.a);	
		
	}
	
//case4	  non static variable used in non static method (no need to create object)
	
	
   int b=55;  // static variale in static level
	
	
	public  void method4() {
		
		System.out.println(b);	//call non static variable
		int b =99;             // decleare and initialized loacal variable
		System.out.println(b); //call local variable
		System.out.println(this.b);	// call non static variable when local and global variable same	 
		
	}
	
	// this case is not reccomended
	public static void method5() {
		non_static_method ob1=new non_static_method();
		System.out.println(ob1.b);
		
	}
	
	int w=6;
	public static void main(String[] args) {
			
			
			System.out.println("Main method exceution start");
			
			non_static_method ob=new non_static_method();
		
			System.out.println(ob.w);
			ob.method1();       // case1 call  non static method 
			ob.method2(100);    //case2 call non static method
			ob.method3();
			ob.method4();
			method5();
			System.out.println("Main method exceution end");
	  }
}
