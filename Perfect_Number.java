//Write a java program to check given number is perfect number or not

package PracticePrograms;

import java.util.Scanner;// Import the Scanner class to read input

public class Perfect_Number {

	public static void main(String[] args) {
		// Create Scanner object to read input from the user
		Scanner sc = new Scanner(System.in);
		// Prompt the user to enter a number
		System.out.print("Enter a number to check if it's a perfect number: ");
		int n = sc.nextInt();
		int sum = 0;
		// Calculate the sum of divisors of the number
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}
		// Check if the sum of divisors equals the number
		if (sum == n) {
			System.out.println(n + " is a perfect number");
		} else {
			System.out.println(n + " is not a perfect number");
		}
	}

}

/*OUTPUT
Enter a number to check if it's a perfect number: 6
6 is a perfect number

Enter a number to check if it's a perfect number: 44
44 is not a perfect number*/



