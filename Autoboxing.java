//Write  a java program for Autoboxing.(All Primitive Types)

package PracticePrograms;
public class Autoboxing {
	public static void main(String[] args) {
		
		System.out.println("AutoBoxing");
		int i=40;
		Integer i1=Integer.valueOf(i);//explicit conversion
		System.out.println("integer:"+i1);
		
		byte b = 20;
		Byte b1 = Byte.valueOf(b);// Explicit conversion
		System.out.println("byte:"+b1);
		
		short s = 10;
		Short s1 = Short.valueOf(s);// Explicit conversion
		System.out.println("short:"+s1);
		
		long l = 120L;
		Long l1 = Long.valueOf(l);// Explicit conversion
		System.out.println("long:"+l1);
		
		double d = 89.99;
        Double d1 = Double.valueOf(d);// Explicit conversion
        System.out.println("double:"+d1);
        
        char c = 'B';
        Character c1 = Character.valueOf(c);// Explicit conversion
        System.out.println("char:"+c1);

        boolean bl = true;
        Boolean bl1 = Boolean.valueOf(bl);// Explicit conversion
        System.out.println("boolean:"+bl1);
        
        float f = 5.70f;
        Float f1 = Float.valueOf(f);// Explicit conversion
        System.out.println("float:"+f1);

	}

}

/*OUTPUT
integer:40
byte:20
short:10
long:120
double:89.99
char:B
boolean:true
float:5.7  */
