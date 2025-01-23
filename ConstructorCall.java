//Write a Java Program  to pass  this keyword as argument in the constructor call.

package PracticePrograms;

class Task1
{
	ConstructorCall  arg;
	Task1(ConstructorCall  arg) // Constructor
	{
		this.arg=arg;
	}
	void show() // Method to display a message
	{
		System.out.println("This is Constructor Argument using this keyword");
	}
}

public class ConstructorCall 
{
	ConstructorCall ()  
	{
		System.out.println("This is Constructor");
		Task1 obj=new Task1(this);
		obj.show(); // Call the show() method of Task1 using the created object
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorCall  obj=new ConstructorCall ();  // Creating object of class
	}

}

/* OUTPUT
This is Constructor
This is Constructor Argument using this keyword */
