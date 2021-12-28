package examples;

public class Example6 {

	//String reverse
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="ABCDefgh";
		String rev="";
		System.out.println(s.length());   // show length  of string    s.length()   s= is string variable name
		System.out.println(s.charAt(0));// show each charactor of string  s.charAt()  character at index
		System.out.println(s.charAt(1));
		System.out.println(s.charAt(2));
		System.out.println(s.charAt(3));
		
		for(int i=s.length()-1; i>=0; i--) {     // s.length show string length
			
			rev =rev + s.charAt(i);
			
			}
		System.out.println("reverse string "+ rev);
		
	
		int count=0;
for(int i=1; i<=s.length(); i++) {     // s.length show string length
			
			count++;
			
			}
		
     System.out.println(count);
		
	}

}
