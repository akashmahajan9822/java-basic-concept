package genericConcept;

// here we declare one class with generic parameter <T> we can give any name called generic class.
// T is parameter and we can define its deta type by declearing it with multiple data type.


class myGenericClass<T> {
	
	T value;   // Declare instance variable with T type
	
	public void method1(T newValue) {
		
		value=newValue;
		
		}
	
	public T method2() {   // we can also decleare T generic parameter as a return type
		
		return(value);
			
	}
	
	
}




public class GenericClassConcept {

	public static void main(String[] args) {
		// Declare object of generic class using generic concept and define parameter
		myGenericClass<String> ob1=new myGenericClass<String>();
		myGenericClass<Integer> ob2=new myGenericClass<Integer>();
		
		ob1.method1("akash"); // give String value 
		ob2.method1(2);  // give int value 
		System.out.println("read String value "+ob1.method2()); 
		System.out.println("read int value "+ob2.method2()); 
		
		Integer  k=new Integer(50);  // define integer or wrapper class
		ob2.method1(k); // give Integer value 
		System.out.println("read integer value "+ ob2.method2()); 
	}

}
