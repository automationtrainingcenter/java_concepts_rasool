package basics;
/*
* In java we have mainly two types of data types
* 1. primitive
* 		boolean either true or false - Boolean
* 		char which will store single character - Character
*		byte store integer values - Byte
*		short store integer values - Short
*		int store integer values -Integer
*		long store integer values - Long
*		float store floating point number -Float
*		double store floating point number - Double
* 	
* 2. reference
* 		Arrays
* 		Strings
* 
*  Wrapper class: For every primitive data_type we have an equivalent class in Java. Those classes
* are known as Wrapper classes. These are used to perform different operations on data.
* 		1. Boolean
* 		2. Character
* 		3. Byte
* 		4. Short
* 		5. Integer
* 		6. Long
* 		7. Float
* 		8. Double
* 
* 	WCData_type obj_name = new WCData_type(value);
* 
* 	Type Casting: converting one type of data to another type of data
* 	up casting: lower memory type to higher memory type : widening : no data loss
* 	down casting: higher memory data type to lower memory data type : narrowing : data loss is possible
* 
* 	Converting primitive data type to wrapper class: boxing
*  Converting wrapper to primitive : un-boxing
* 
* 
* syntax to create primitive data type
* data-type var-name  = value; //initialization
* data-type var-name; //declaration
* var-name = value; //assignment to the variable which is already declared
* 
* variable is nothing but name of memory location where we are storing data
*/

public class DataTypesDemo {

	public static void main(String[] args) {
		// boolean type
		boolean b = false;
		System.out.println("boolean value is " + b);
		System.out.println("************************************************");

		// byte
		byte by = 120;
		System.out.println("byte value is " + by);
		System.out.println("byte size in bits is " + Byte.SIZE);
		System.out.println("byte size in bytes is " + Byte.BYTES);
		System.out.println("min value of byte variable is " + Byte.MIN_VALUE);
		System.out.println("max value of byte variable is " + Byte.MAX_VALUE);
		System.out.println("************************************************");
		// short
		short sh = 1234;
		System.out.println("short value is " + sh);
		System.out.println("short size in bits is " + Short.SIZE);
		System.out.println("short size in bytes is " + Short.BYTES);
		System.out.println("min value of short variable is " + Short.MIN_VALUE);
		System.out.println("max value of short variable is " + Short.MAX_VALUE);
		System.out.println("************************************************");
		// int
		int i = 12345;
		System.out.println("int value is " + i);
		System.out.println("integer size in bits is " + Integer.SIZE);
		System.out.println("integer size in bytes is " + Integer.BYTES);
		System.out.println("min value of integer variable is " + Integer.MIN_VALUE);
		System.out.println("max value of integer variable is " + Integer.MAX_VALUE);
		System.out.println("************************************************");
		// long
		long l = 12345689999l;
		System.out.println("long value is " + l);
		System.out.println("long size in bits is " + Long.SIZE);
		System.out.println("long size in bytes is " + Long.BYTES);
		System.out.println("min value of long variable is " + Long.MIN_VALUE);
		System.out.println("max value of long variable is " + Long.MAX_VALUE);
		System.out.println("************************************************");

		// float
		float f = 12.22f;
		System.out.println("float value is " + f);
		System.out.println("float size in bits is " + Float.SIZE);
		System.out.println("float size in bytes is " + Float.BYTES);
		System.out.println("min value of float variable is " + Float.MIN_VALUE);
		System.out.println("max value of float variable is " + Float.MAX_VALUE);
		System.out.println("************************************************");
		// double
		double d = 123.44;
		System.out.println("double value is " + d);
		System.out.println("double size in bits is " + Double.SIZE);
		System.out.println("double size in bytes is " + Double.BYTES);
		System.out.println("min value of double variable is " + Double.MIN_VALUE);
		System.out.println("max value of double variable is " + Double.MAX_VALUE);
		System.out.println("************************************************");

		// character
		char ch = 'a';
		System.out.println("character value is " + ch);
		System.out.println("character size in bits is " + Character.SIZE);
		System.out.println("character size in bytes is " + Character.BYTES);
		System.out.println("min value of character variable is " + Character.MIN_VALUE);
		System.out.println("max value of character variable is " + Character.MAX_VALUE);
		System.out.println("************************************************");

		// up casting
		short shL = 12345;
		int iH = shL;
		System.out.println(iH);

		int iL = 123456;
		float fh = iL;
		System.out.println(fh);

		// down casting
		// lower_data_type var_name = (lower_data_type) higher_data_type_var_name

		short sH = 120;
		byte bL = (byte) sH;
		System.out.println(bL);

		float ftH = 12.99f;
		int inL = (int) ftH;
		System.out.println(inL);

		// primitive to reference
		int ip = 1234;
		String iS = Integer.toString(ip);
		System.out.println(iS + 20);

		double dp = 123.44;
		String dS = Double.toString(dp);
		System.out.println(dS + 10);

		String bs = Boolean.toString(b);
//		System.out.println(b+10);
		System.out.println(bs + 10);

		// reference to primitive
		String sr = "18977";
		int intp = Integer.parseInt(sr);
		System.out.println(intp + 10);

		String st = "32447.89";
		float flp = Float.parseFloat(st);
		int inf = (int) flp;
		System.out.println(flp + 10);
		System.out.println(inf);
		
		//primitive to wrapper
		ip = 9876;
		Integer iw = Integer.valueOf(ip);
		System.out.println(iw);
		
		
		//wrapper to primitive
		Float fw = new Float(344.77f);
		float fp = fw.floatValue();
		System.out.println(fp);
		

	}

}
