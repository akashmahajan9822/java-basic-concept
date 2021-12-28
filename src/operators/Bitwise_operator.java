package operators;

public class Bitwise_operator {

	public static void main(String[] args) {
		int x=15;
		int y=4;
		
		//logic && , & and
		
		System.out.println(x<y & x<y);
		System.out.println(x<y & x>y);
		System.out.println(x>y & x<y);
		System.out.println(x>y & x>y);
		
		
		System.out.println("*******************************");
		
		
		//logic || , | or
		
		System.out.println(x<y | x<y);
		System.out.println(x<y | x>y);
		System.out.println(x>y | x<y);
		System.out.println(x>y | x>y);
		
	}

}
