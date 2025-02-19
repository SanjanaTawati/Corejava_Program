/*Create one superclass HillStations and three subclasses Manali, Mussoorie, Gulmarg. 
Subclasses extend the superclass and override its location() and famousFor() method. 
i.call the location() and famousFor() method by the Parent class’, i.e. Hillstations 
class. As it refers to the base class object and the base class method overrides the 
superclass method; the base class method is invoked at runtime. ii.call the location()
and famousFor() method by the all subclass’,and print accordingly.*/

package PracticePrograms;
//Superclass HillStations
class HillStations {
	public void location() {
		System.out.println("Location");
	}
	public void famousFor() {
		System.out.println("Famous for");
	}
}
//Manali subclass
class Manali extends HillStations {
	public void location() {
		System.out.println("Manali is in Himachal Pradesh.");
	}
	public void famousFor() {
		System.out.println("Manali is famous for snow and adventure sports.");
	}
}
//Mussoorie subclass
class Mussoorie extends HillStations {
	public void location() {
		System.out.println("Mussoorie is in Uttarakhand.");
	}

	public void famousFor() {
		System.out.println("Mussoorie is famous for cool weather and views.");
	}
}
//Gulmarg subclass
class Gulmarg extends HillStations {
	public void location() {
		System.out.println("Gulmarg is in Jammu & Kashmir.");
	}
	public void famousFor() {
		System.out.println("Gulmarg is famous for skiing.");
	}
}
public class AbstractClass2 {
	public static void main(String[] args) {
		// Create objects of each hill station
		HillStations manali = new Manali();
		HillStations mussoorie = new Mussoorie();
		HillStations gulmarg = new Gulmarg();
		manali.location();  
		manali.famousFor(); 
		System.out.println(" ");  
		mussoorie.location();  
		mussoorie.famousFor(); 
		System.out.println(" ");
		gulmarg.location();  
		gulmarg.famousFor(); 
	}
}

/*OUTPUT
Manali is in Himachal Pradesh.
Manali is famous for snow and adventure sports.

Mussoorie is in Uttarakhand.
Mussoorie is famous for cool weather and views.

Gulmarg is in Jammu & Kashmir.
Gulmarg is famous for skiing.*/

