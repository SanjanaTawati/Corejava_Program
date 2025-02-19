//Write a java program for  Unboxing.(all types).

package PracticePrograms;
public class Unboxing {
	public static void main(String[] args) {
		
		System.out.println("UnBoxing");
		Integer i1=new Integer(40);
		int i=i1.intValue();//explicit conversion of Integer
		System.out.println("Int Value: "+i);
		
		Float f1=new Float(20.9);
		float f=f1.floatValue();//explicit conversion of Float
		System.out.println("Float Value: "+f);
		
		Character c1=new Character('A');
		char c=c1.charValue();//explicit conversion of Character
		System.out.println("Character Value: "+c);
		
		Double d1=new Double(40.233245534375);
		double d=d1.doubleValue();//explicit conversion of Double
		System.out.println("Double Value: "+d);
		
		Long l1=new Long(343243247897L);
		long l=l1.longValue();//explicit conversion of Long
		System.out.println("Long Value: "+l);
		
		Boolean b1=new Boolean(true);
		boolean b=b1.booleanValue();//explicit conversion of Boolean
		System.out.println("Boolean Value: "+b);
		
		short s1=70;
		Short s=Short.valueOf(s1);
		System.out.println("Short Value: "+s);

	}
}

/*OUTPUT
UnBoxing
Int Value: 40
Float Value: 20.9
Character Value: A
Double Value: 40.233245534375
Long Value: 343243247897
Boolean Value: true
Short Value: 70*/
