package operators;

public class Linear_operator {

	public static void main(String[] args) {
		// unary Operators 2 type
				// 1)pri incriment and decriment
				//while move jvm from left to right 1tt get ++ &-- sign then a variable so called pri incriment and decriment           
				 
		System.out.println("pri incriment "); 
		    int a=10;
				 System.out.println("initial value of a "+a);
			
				 int b=++a;          //add 1 to a then move to b 
				 System.out.println("final value of a "+a); 
				 System.out.println("final value of b "+b); 
				 
	 System.out.println("************************************************");	 
			
				 System.out.println("pri decriment ");  
		
				 System.out.println("initial value of a "+a);
		          int d=--a;          //subtract 1 to a then move to d 
				 System.out.println("final value of a "+a); 
				 System.out.println("final value of b "+d); 
				 
	 System.out.println("************************************************");	
				 
				 
				 
				 
				 
				// 2)post incriment and decriment
					//while move jvm from left to right 1tt get a variable then   ++ &-- sign so called pri incriment and decriment           
				 	
				 System.out.println("post incriment ");  
				
				 System.out.println("initial value of a "+a);
		         
				 int c=a++;   // move initial value a to c then add 1 to a
				 System.out.println("final value of a "+a); 
				 System.out.println("final value of c "+c); 
				 
				 
				 System.out.println("************************************************");	 
				 
				 System.out.println("post decriment ");  
		      System.out.println("initial value of a "+a);
		         
				 int e=a--;          //move initial value a to e then subtract 1 to a 
				 System.out.println("final value of a "+a); 
				 System.out.println("final value of b "+e); 
				 
				 System.out.println("************************************************");	
				 
            int x=10;
            int y=10;

				 System.out.println(x++ + ++x);//10+12=22  
				 System.out.println(y++ + y++);//10+11=21
				 
				 System.out.println(x-- + --x);  
				 System.out.println(y-- + y--);
				 
				 
				 
				 
	}

}
