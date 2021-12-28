package constructor;

public class Basic {
 int x =500;
 
 
 
	String Name;
	char Div ;
	int rollNo;
	
	 
	public Basic(String n, char d , int r)
	{ 
		this();
		
		
		Name=n;
		Div=d;
		rollNo=r;
		System.out.println(Name);
		System.out.println(Div);
		System.out.println(rollNo);
		}	
	
	
	public Basic(String inputname)
	{ 
		this("aaa",'a',12 ); 
		
		System.out.println(inputname);
		}	
	
	public Basic()
	{
	
		System.out.println("int");
		}	
	
	public static void main(String[] args) {
		Basic ob1=new Basic("sushil");
		System.out.println(ob1.Name+" "+ob1.Div+" "+ob1.rollNo);
		
		Basic ob2=new Basic("sushil", 'A', 5);
		System.out.println(ob2.Name+" "+ob2.Div+" "+ob2.rollNo);

	}

}
