package control_statements;

             // SWITCH CASE
    //SWITCH(EXPRESSION)  we can used expression string also
             // BODY
                  // CASE1 
                 // CASE2
                  // CASE3

public class Case6 {

	public static void main(String[] args) {
		
		int day=5;
		// without break
		//if case not match then default executed
		
		switch(day){       //take decission base on the day value
		
		case 1 : String day1 ="Monday";
		System.out.println(day1);
		
		case 2 : String day2 ="Tuesday";
		System.out.println(day2);
		
		case 3 : String day3 ="wendsday";
		System.out.println(day3);
		
		case 4 : String day4 ="Thursday";
		System.out.println(day4);
		
		case 5 : String day5 ="friday";
		System.out.println(day5);
		
		case 6 : String day6 ="satarday";
		System.out.println(day6);
		
		case 7 : String day7 ="Sunday";
		System.out.println(day7);
		
		default : System.out.println("invalid statement");
				}
		
		System.out.println("***********************************************************"); 		

          
		//with break which break program and only match case executed
		
		
	
		 switch(day){       //take decission base on the day value
		
		case 1 : String day1 ="Monday";
		System.out.println(day1);
		break;
		
		case 2 : String day2 ="Tuesday";
		System.out.println(day2);
		break;
		
		case 3 : String day3 ="wendsday";
		System.out.println(day3);
		break;
		
		case 4 : String day4 ="Thursday";
		System.out.println(day4);
		break;
		
		case 5 : String day5 ="friday";
		System.out.println(day5);
		break;
		
		case 6 : String day6 ="satarday";
		System.out.println(day6);
		break;
		
		case 7 : String day7 ="Sunday";
		System.out.println(day7);
		break;
		
		default : System.out.println("invalid statement");
		}
		
		 System.out.println("***********************************************************"); 		
		
		 String months= "Jan";
		
		 switch(months){  
		 
		 case "Jan" : System.out.println("Jan");
		break;
		
		 case "Feb" : System.out.println("Feb");
			break;
		 
		 case "March" : System.out.println("March");
			break;
			
		 case "April" : System.out.println("April");
			break;
			
		 case "May" : System.out.println("May");
			break;
			
		 case "Jun" : System.out.println("Jun");
			break;
			
		 case "Jully" : System.out.println("Jully");
			break;
			
		 case "Aug" : System.out.println("Aug");
			break;
			
		 case "Sub" : System.out.println("sub");
			break;
			
		 case "Oct" : System.out.println("Oct");
			break;
			
		 case "Nov" : System.out.println("Nov");
			break;
			
		 case "Dec" : System.out.println("Dec");
			break;
		 
		 default : System.out.println("invalid statement");
			
		 }
		
	}

}
