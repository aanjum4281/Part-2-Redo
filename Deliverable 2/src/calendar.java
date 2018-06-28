import java.time.LocalDate; 
import java.time.Period;
import java.util.Scanner;

//set dates using scanner 

public class calendar {
	private static Scanner input;

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in); 
		
//Can change the date1 in the integers portion 		
	int year1 = 1996;
	int day1 = 01;
	int month1 = 07;
	LocalDate date1 = LocalDate.of(year1 , day1 , month1);
	
//Can change date2 by switching out values in integer	
	int year2 =2018;
	int month2 =06;
	int day2 =01;
	LocalDate date2 = LocalDate.of( year2 , day2 , month2 );
	
	Period diff = Period.between(date1, date2); 
	
	System.out.printf("The difference between the two dates is %d years, %d months, % days" , diff.getYears(), diff.getMonths(), diff.getDays());
	
}

	public static Scanner getInput() {
		return input;
	}

	public static void setInput(Scanner input) {
		calendar.input = input;
	}}
// I could not figure out how to make scanner work
//I though I put in the integer values but Scanner can't detect it
	