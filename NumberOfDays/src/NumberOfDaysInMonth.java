import java.util.Scanner;

public class NumberOfDaysInMonth {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int month, year;
		int NumberOfDay = 0;
		
		do {
		System.out.println("enter month:");
		month = input.nextInt();
		if(month < 1 || month > 12) {
			System.out.println("month must be between 1 and 12.Try again!");
			NumberOfDay = 0;
			
		}
		} while (month < 1 || month > 12);
		System.out.println("enter year:");
		
		do {
		year = input.nextInt();
		if (year <=0) {
			System.out.println("year must be great than 0.Try again!");
			NumberOfDay = 0;
		}
		} while (year <= 0);
		
			
		
		 
		
		
	  
		
			

		
	switch(month) {
	case 2:
		if((year % 4 ==0 && year % 100 !=0) || (year %400 == 0)) {
		NumberOfDay = 29;
	} else {
		NumberOfDay = 28;
	}
		break;
	case 4:
	case 6:
	case 9:
	case 11:
		NumberOfDay = 30;
		break;
	default:
		NumberOfDay = 31;
		break;
		
}
	System.out.println("the number of month " + month + "/" + year + " is: " + NumberOfDay);
}
}
