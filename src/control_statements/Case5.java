package control_statements;

      //NASTED-IF_ELSE
public class Case5 {

	public static void main(String[] args) {
		
		int a=60;
		int b=30;
		int c=40;
		@SuppressWarnings("unused")
		int maxNo=0;  
	//we initialized or write value before write hence we don't have to initialized 
		//otherwise we can weite int maxNo=00; 
		 	
	// we can used if statement in else block also	
	
		
if (a>b) {
			
	if (a>c) {
				maxNo=a;
				 System.out.println("Max no is a");
			}                                          // complete if (a>c)
		
		else {
				System.out.println(" a is smaller than c");
			}                                        // complete else of  (a>c)
			
		    }                                        // complete if (a>b)
		
		      else {
			
			        if(b>c) {                           // we can used if statement in else block also	
				       maxNo=b;
				       System.out.println("Max no is b");
			      }                      // complete if (b>c)
			 else {
				 maxNo=c;
				 System.out.println("Max no is c");
			 }           // complete else of  (b>c)
			
		}                       // complete else of  (a>b)
	
	
	
	}

}
