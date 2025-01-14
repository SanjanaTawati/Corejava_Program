/*Write a program to find the perimeter of the square*/


package PracticePrograms;
import java.util.Scanner;
public class SquarePerimeter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  // Create a Scanner object
		System.out.print("Enter the side length of the square: ");
		double side = sc.nextDouble(); 

		// Calculate the perimeter of the square
		double perimeter = 4 * side;  // Perimeter of square = 4 * side

		// Display the result
		System.out.println("The perimeter of the square is: " + perimeter);

	}

}


/*Enter the side length of the square: 2
The perimeter of the square is: 8.0*/
