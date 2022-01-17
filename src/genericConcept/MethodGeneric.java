package genericConcept;

public class MethodGeneric {

	
	// define E generic parameter in angular bracket <> 
	//and define array s whose type is generic E parameter
	// i.e we can define E data Type and it should be non premetive like String and integer.
	// we can declear no of parameter any thing wth E
public<E> void printall(E []s) {
	
	for(E i:s) {
		
		System.out.println(i);
	}
	
	
	
}
	public static void main(String[] args) {
		//we call here above generic method as per requirement
		
		String [] name= {"akash","deepak","sushil","shivaji"};
		Integer[] rollNo= {1,2,3,4};
		MethodGeneric ob=new MethodGeneric();
		ob.printall(name);
		ob.printall(rollNo);



	}

}
