package methods;

public class concept1 {
   
	
static int V=20;	
int n=30;
	
	public static void name1(String name) {
   
		 System.out.println(name);
		
		 System.out.println(concept1.V);  // call static variable in static method
		
		 
		 concept1 obb=new concept1();
		 System.out.println(obb.n);   //call instance variable in static method nut it is not recommonded
	}
	
	
	public static void main(String[] args) {
		
		name1("Mr. Akash Mahajan");     // call static method in main mehtod
	}

}
