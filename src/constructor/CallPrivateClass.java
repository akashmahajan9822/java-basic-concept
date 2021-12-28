package constructor;

import acces_modfier.ProtectedMemberClass;  


/*important point  if not used then while inheritance show error
it is used to point out the package whos class we have to called.
*/


public class CallPrivateClass extends ProtectedMemberClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CallPrivateClass ob=new CallPrivateClass();
		ob.marry1();
		
	// if we try to call by has a relation show compile time error	
//		ProtectedMemberClass ob2=new ProtectedMemberClass();
//		ob2.marry1();
		
		
	}

}
