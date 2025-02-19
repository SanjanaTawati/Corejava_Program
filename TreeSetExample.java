//Write a program using TreeSet insert Integer values and print them.

package PracticePrograms;
import java.util.TreeSet;
public class TreeSetExample {
	public static void main(String[] args) {
		// Creating a TreeSet to store Integer values
		TreeSet<Integer> numbers = new TreeSet<>();
		
		// Inserting Integer values
		numbers.add(50);
		numbers.add(10);
		numbers.add(30);
		numbers.add(20);
		numbers.add(40);
		
		// Printing the TreeSet 
		System.out.println("TreeSet Elements: " + numbers);
	}

}

/*OUTPUT
TreeSet Elements: [10, 20, 30, 40, 50]*/

