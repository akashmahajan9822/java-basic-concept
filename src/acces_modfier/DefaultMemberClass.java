package acces_modfier;


/* we can access the private member with in same package only
we can access this member of class into various class but within package
*/
public class DefaultMemberClass {
	

	static int x=10;
    static void method1() {
 System.out.println("Default - method1");
}


public static void main(String[] args) {

		
    method1();
		System.out.println(x);


	}

}
