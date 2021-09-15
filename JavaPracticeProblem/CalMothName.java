import java.util.*;
class CalMonthName {  
  public static void main(String args[]) { 
    String monthName= ""; 

	String answer;
do{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number b/w 1 to 12");
	  int month = sc.nextInt();
	  // sc.close();
	 

	  switch(month){
		  case 1: 
			monthName = "1-January";
			System.out.println(monthName);
			  break;

		  case 2: 
			  monthName = "2-February";
			  System.out.println(monthName);
			  break;

		  case 3: 
			  monthName = "3-March";
			  System.out.println(monthName);
			  break;

		  case 4: 
			  monthName = "4-April";
			  System.out.println(monthName);
			  break;

			  case 5: 
			  monthName = "5-May";
			  System.out.println(monthName);
			  break;

			  case 6: 
			  monthName = "6-Jun";
			  System.out.println(monthName);
			  break;

			  case 7: 
			  monthName = "7-Jul";
			  System.out.println(monthName);
			  break;

			  case 8: 
			  monthName = "8-Aug";
			  System.out.println(monthName);
			  break;

			  case 9: 
			  monthName = "9-Sep";
			  System.out.println(monthName);
			  break;

			  case 10: 
			  monthName = "10-Oct";
			  System.out.println(monthName);
			  break;

			  case 11: 
			  monthName = "11-Nov";
			  System.out.println(monthName);
			  break;

			  case 12: 
			  monthName = "12-Dec";
			  System.out.println(monthName);
			  break;

		  default: System.out.println("number not found");
	  }
	
	Scanner scanner = new Scanner(System.in);
		System.out.println("Do you want to keep repeating type (YES/NO)");
		 answer = scanner.nextLine();
	}
	while(answer.toLowerCase().equals("yes"));
			  
	
	  
	 	  

  } 
}
