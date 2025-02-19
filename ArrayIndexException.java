//Write a program using exception handling to handle array index out of bounds.

package PracticePrograms;
public class ArrayIndexException {
	public static void main(String[] args) {
		int[] numbers = {10, 20, 30};  // Array with 3 elements
		try {
			// Trying to access an index that doesn't exist (index 5)
			System.out.println(numbers[5]);  
		} catch (ArrayIndexOutOfBoundsException e) {
			// Handling the exception when trying to access an invalid index
			System.out.println("Error: Index out of bounds. Please check the array size.");
		} finally {
			// This block will always execute
			System.out.println("Execution finished.");
		}
	}

}


/*OUTPUT
Error: Index out of bounds. Please check the array size.
Execution finished.*/
