/*Create abstract class vaccine.Create two variables age(int),nationality(String).
create 2 concrete methods firstDose() and secondDose(). 
Scenario 1:user can take the first dose if the user is Indian and age is 18.After 
vaccination the user has to pay 250rs(which will be displayed on the console). 
Scenario 2: Users are eligible to take the second dose only after completing the 
first dose. 
Scenario 3: create abstract method boosterDose() in abstract class Vaccine.
Create one implementation class vaccinationSuccessful, where implement boosterDose() 
method. Create main class vaccination and invoke all methods accordingly. 
[Hint:Create constructor to initialize variables age and nationality,Use flow control
(Ifelse) to check condition]*/

package PracticePrograms;
class Vaccine {
	int age;
	String nationality;
	boolean firstDoseCompleted = false; 
	public Vaccine(int age, String nationality) {
		this.age = age;
		this.nationality = nationality;
	}
	// First dose
	public void firstDose() {
		if (age >= 18 && nationality.equalsIgnoreCase("India")) {
			firstDoseCompleted = true; 
			System.out.println("First dose taken. Pay Rs. 250.");
		} else {
			System.out.println("Not eligible for the first dose.");
		}
	}
	// Second dose
	public void secondDose() {
		if (firstDoseCompleted) {
			System.out.println("Second dose taken.");
		} else {
			System.out.println("First dose not completed. Take it first.");
		}
	}
	// Booster dose
	public void boosterDose() {
		if (firstDoseCompleted) {
			System.out.println("Booster dose taken.");
		} else {
			System.out.println("Complete the first dose before taking the booster dose.");
		}
	}
}
public class AbstractClass1 {
	public static void main(String[] args) {
		Vaccine user = new Vaccine(25, "India");
		user.firstDose();   
		user.secondDose();  
		user.boosterDose();
	}
}

/*OUTPUT
First dose taken. Pay Rs. 250.
Second dose taken.
Booster dose taken.*/

