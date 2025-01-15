//Write a program to check leap year using if else. How to check whether a given year is a leap year or not


package PracticePrograms;
import java.util.Scanner;
public class LeapYear {

		  public static void main(String[] args) {
		    Scanner sc=new Scanner(System.in);// Create Scanner object to read input from the user
		    System.out.println("Enter year : ");
		    int year=sc.nextInt();
		 // Check if the year is divisible by 400 (leap year condition)
		    if (year % 400 == 0) {
		      System.out.println(year + " is a leap year.");
		    } 
		 // Check if the year is divisible by 100 but not by 400 (not a leap year)
		    else if (year % 100 == 0) {
		      System.out.println(year + " is not a leap year.");
		    } 
		 // Check if the year is divisible by 4 but not by 100 (leap year condition)
		    else if (year % 4 == 0) {
		      System.out.println(year + " is a leap year.");
		    } 
		    // If none of the above conditions are true, it's not a leap year
		    else {
		      System.out.println(year + " is not a leap year.");
		    }

	}

}



/*OUTPUT
Enter year : 
1990
1990 is not a leap year.


Enter year : 
2000
2000 is a leap year.*/


