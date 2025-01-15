//Write java program to check  candidate eligible for voting or not

package PracticePrograms;

import java.util.Scanner;

public class Voting {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);// Create a Scanner object for user input
		System.out.println("Enter your age : ");
		int age=sc.nextInt();// Check the age 
		if (age>=18) {
			System.out.println("You are eligible for voting");
		}
		else{
			System.out.println("You are not eligible for voting");
		}

	}

}


/*OUTPUT
Enter your age : 
12
You are not eligible for voting

Enter your age : 
19
You are eligible for voting*/

