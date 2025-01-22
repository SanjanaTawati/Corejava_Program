//Write java program to invoke current class method using this keyword

package PracticePrograms;
class Example{
	void method1() {
		//Method1 that calls Method2 using 'this'
		System.out.println("Inside method1");
		this.method2(); // Using 'this' to call method2 from the same class
	}

	// Method2 that is called by method1
	void method2() {
		System.out.println("Inside method2");
	}
}
public class ThisKeyword {

	public static void main(String[] args) {
		Example obj = new Example(); // Create an object of Example class
		obj.method1(); // Call method1, which will use 'this' to invoke method2
	}

}


/*OUTPUT
Inside method1
Inside method2*/