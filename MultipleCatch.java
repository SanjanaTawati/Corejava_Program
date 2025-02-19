//Write a program demonstrating multiple catch statements and finally block.

package PracticePrograms;
public class MultipleCatch {
	public static void main(String[] args) {
		try {
			// Trying division by zero
			int result = 10 / 0; 
			// Trying to access an invalid array index
			int[] numbers = {1, 2, 3};
			System.out.println(numbers[5]);
		} 
		// Catch division by zero error
		catch (ArithmeticException e) {
			System.out.println("Cannot divide by zero.");
		}
		// Catch array index out of bounds error
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid array index.");
		}
		// Finally block will always execute
		finally {
			System.out.println("End of program.");
		}
	}
}

/*OUTPUT
Cannot divide by zero.
End of program.*/

