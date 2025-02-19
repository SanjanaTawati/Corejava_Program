/*Write a program demonstrating  Exception handling using try catch for Arithmatic 
Exception.*/

package PracticePrograms;

public class ArithmeticExceptionExample {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 0; // This will cause an error during division

		// Attempting the division that may cause an error
		try {
			// This will cause an error because of division by zero
			int result = num1 / num2;  
			System.out.println("Result: " + result);
		} catch (ArithmeticException e) {
			// Handling the error when division by zero occurs
			System.out.println("Error: Division by zero is not allowed.");
		} finally {
			// This block will always run, even if there is an error
			System.out.println("Execution completed.");
		}
	}

}

/*OUTPUT
Error: Division by zero is not allowed.
Execution completed.*/

