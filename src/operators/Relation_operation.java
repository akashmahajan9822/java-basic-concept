package operators;

public class Relation_operation {

	
	public static void main(String[] args) {
		
		int x=10;
		int y=10;
		System.out.println(x>y);
		System.out.println(x<y);
		System.out.println(x<y | x>y);
		System.out.println(x>=y);
		System.out.println(x<=y);
		System.out.println(x==y);
		System.out.println(x!=y);
		
		x-=3;
		x+=3;
		x*=3;
		x/=3;
		x%=3;
}
	
}
