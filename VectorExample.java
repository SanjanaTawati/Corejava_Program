/*Write a program using Vector to store the list of students details and print 
 the details.*/

package PracticePrograms;
import java.util.Vector;

//Candidate class to store student details
class Candidate {  
	String name;
	int age;
	String course;
	
	// Constructor to initialize candidate details
	Candidate(String name, int age, String course) {
		this.name = name;
		this.age = age;
		this.course = course;
	}
	// Method to display candidate details
	void display() {
		System.out.println("Name: " + name + ", Age: " + age + ", Course: " + course);
	}
}
public class VectorExample {
	public static void main(String[] args) {
		Vector<Candidate> candidates = new Vector<>();

		// Adding candidates to the vector
		candidates.add(new Candidate("A", 20, "CSE"));
		candidates.add(new Candidate("B", 21, "IT"));
		candidates.add(new Candidate("C", 22, "ECE"));

		// Displaying candidate details
		for (Candidate c : candidates) {
			c.display();
		}

	}
}

/*OUTPUT
Name: A, Age: 20, Course: CSE
Name: B, Age: 21, Course: IT
Name: C, Age: 22, Course: ECE*/

