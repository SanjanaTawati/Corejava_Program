/*Write a Java program to take Employee id,name,address & salary from user and display on to screen.*/


package PracticePrograms;
import java.util.Scanner;
public class EmpDetails {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);// Create a Scanner object to read input from the user
		System.out.println("Enter employee id : ");
		int empId=sc.nextInt();
		sc.nextLine(); 
		System.out.println("Enter employee name : ");
		String empName=sc.nextLine();
		System.out.println("Enter employee address : ");
		String empAddress=sc.nextLine();
		System.out.println("Enter employee salary : ");
		double empSalary=sc.nextDouble();
		System.out.println("\nEmployee Details:");// Display the employee details
		System.out.println("Employee ID: " + empId);
		System.out.println("Employee Name: " + empName);
		System.out.println("Employee Address: " + empAddress);
		System.out.println("Employee Salary: " + empSalary);

	}

}

/*Enter employee id : 
101
Enter employee name : 
ABC
Enter employee address : 
Solapur, Maharashtra
Enter employee salary : 
90000

Employee Details:
Employee ID: 101
Employee Name: ABC
Employee Address: Solapur, Maharashtra
Employee Salary: 90000.0*/

