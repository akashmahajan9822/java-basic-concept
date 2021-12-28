package constructor;

public class Super extends Basic{

	public Super(int aa) {
		super();
		System.out.println(" super class execute");
	}
	
	
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Super ob2=new Super(1);

	}

}
