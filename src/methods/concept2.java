package methods;

public class concept2 {
	
	public static void main(String[] args) { 
		 
		 studentInfo("Akash",1,'A',70.5f); 
		 System.out.println("-----------"); 
		 studentInfo("shushil",2,'B',71.8f); 
		 System.out.println("-----------"); 
		 studentInfo("shivaji",1,'A',70.5f); 
		 System.out.println("-----------"); 
		 studentInfo("ccccdl",2,'B',71.8f);

System.out.println("***********************************************************"); 
	
		 Carinfo("TATA", "MH15-Z-5877", "Black");
		 System.out.println("-----------");  
		 Carinfo("BMW", "MH15-W-5255", "red");     
		 
	} 
	
	
	public static void studentInfo(String name,int RollNum,char grade, float percnt) 
	{
		
		System.out.println("Name: Mr."+ name); 
		 System.out.println("RollNo:"+ RollNum); 
		 System.out.println("Grade:"+ grade); 
		 System.out.println("percentage:"+ percnt); 
	
}
	public static void Carinfo(String Cname,String Nplate,String colour ) {
		
		System.out.println("Car No.:"+ Cname); 
		 System.out.println("No plate:"+ Nplate); 
		 System.out.println("colour:"+ colour); 
		
		
	}
	
	
	
}


