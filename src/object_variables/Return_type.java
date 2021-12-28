package object_variables;


//return show output of the whole method 
	// in above static method of is c and his data type is int as decle in void
	//if we uesd void and used return command it show compile error
  

public class Return_type {

	int x=30;
	int y=20;

   public int  method() {
	
	   int c=x+y;
	    return c;
	 
	}
   
   public int  method2() {
		  @SuppressWarnings("unused")
		int x =2; 
	    return this.x ;
	// we can not write any statement after return it show compile time error. 
	
   }
   
   
   public static void main(String[] args) {
		
		
		System.out.println("Main method exceution start");
		
		Return_type returnobject=new Return_type();
		System.out.println(returnobject.method());
		System.out.println(returnobject.method()+60);
		System.out.println(returnobject.method2());
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
