//Write a program to check given number is prime number or not

package PracticePrograms;

import java.util.Scanner;// Import the Scanner class to read input

public class Prime_Number {
	public static void main(String[] args) {
		// Create Scanner object to read input from the user
		Scanner sc = new Scanner(System.in);
		// Taking input from the user
		System.out.print("Enter a number: ");
		int num = sc.nextInt();      
		// Checking if the number is prime
		if (num <= 1) {
			System.out.println(num + " is not a prime number.");
		} else {
			// Assume the number is prime
			boolean isPrime = true;
			for (int i = 2; i < num; i++) {
				// If num is divisible by i, it's not prime
				if (num % i == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				// If isPrime is still true, then the number is prime
				System.out.println(num + " is a prime number.");
			} else {
				// If isPrime is false, the number is not prime
				System.out.println(num + " is not a prime number.");
			}
		}
	}
}

/*OUTPUT
Enter a number: 2
2 is a prime number.

Enter a number: 8
8 is not a prime number.*/



