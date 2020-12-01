package javaDemo;

public class Arrays {

	public static void main(String[] args) {


		// Data Types:- 1. Primitive DataTypes and NonPrimitive DataType

		// num = 9600234
		//float, short, boolean, bit, byte

		short num0 = 1;
		int num1 = 10; 	
		long num2 = 11111111111111111l;

		double num3 = 10.10;
		float num4 = 10.10f;

		boolean num5 = false;
		char ch = 'p';
		
		int x =10;
		
	char y = 'a';
	
String	z = "Yousuf";
	

		//NonPrimitive Datatype (String, Arrays, Classes and Interfaces)
		
	//String txt = "yousuf";



		// syntax for Arrays:
		// names = "yousuf", "shihab", "Mamun"				

		//1. How to store the values into Arrays(Note: Two ways available)

		// first way
		String[] names = {"Tasnim", "Basith", "abcd", "Khadija"}; 		
		int[] ph = {123, 456, 789, 1 ,2 ,3 ,4};		
		char[] ch1 = {'a', 'b', 'c', 'd'};
	
		System.out.println(names[3]);
		
		System.out.println(ch1[2]);
		//way-2		
		//ClassName obj = new ClassName();
		
		//String[] names = new String[4];
	
		System.out.println("...................................");
	String[] obj = new String[4];
		obj[0] ="dinnar";
		obj[1] = "lovely";
		obj[2] = "Anwar";
		obj[3] = "xyz";
		//obj[4] = "abc";
	//	obj[5] ="xyz";
		
		//System.out.println(5);


		//2. How to pick value from Array ---> array[indexNumber]		
		System.out.println(obj[3]);


		//3. how to get count of Array ---> array.lenght
		System.out.println(obj.length);


		//4. how to Sort the Arrays ----> Arrays.sort()		
		//System.out.println(names[0]);		
		//Arrays.sort(names[0]);		
		//System.out.println(names[1]);

		//System.out.println("**********************************************************");


		//5. using for iterator, while loops and forEach		

		for (int i= 0; i <obj.length; i++) {			
			System.out.println(obj[i]);
		}

		//String[] obj = new String[4];
		//obj[0] = "yousuf";
		//obj[1] = "emon";
		//obj[2] = "dinner";
		//obj[3] = "Parsa";	

		System.out.println("-------------------------------------------------------------");

		//1.
		for(String eachObj : obj) {			
			System.out.println(eachObj);
		}		

		System.out.println("-------------------------------------------------------------");

		//2.		
		for(int i= 0 ; i <= 3; i++) {			
			System.out.println(obj[i]);
		}		

		System.out.println("-------------------------------------------------------------");

		//3.		
		int i =0;
		while (i<=3) {				
			System.out.println(obj[i]);
			i++;
		}


	}

	
		
	}



