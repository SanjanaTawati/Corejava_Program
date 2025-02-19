/*Write a program using ArrayDeque to add book names and add,delete the values from 
both ends of que.*/

package PracticePrograms;
import java.util.ArrayDeque;
public class ArrayDequeueExample {
	
	public static void main(String[] args) {	
		ArrayDeque<String> books = new ArrayDeque<>(); // Creating ArrayDeque
		
		// Adding books from both ends
		books.addFirst("Harry Potter");
		books.addLast("The Alchemist");
		books.addFirst("Rich Dad Poor Dad");
		books.addLast("Atomic Habits");

		// Display books
		System.out.println("Books: " + books);

		// Removing books from both ends
		books.removeFirst(); // Removes from front
		books.removeLast();  // Removes from rear
		// Display books after removal
		System.out.println("After Deletion: " + books);
	}
}

/*OUTPUT
Books: [Rich Dad Poor Dad, Harry Potter, The Alchemist, Atomic Habits]
After Deletion: [Harry Potter, The Alchemist]*/

