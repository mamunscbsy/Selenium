package javaDemo;

public class ArrayPractice {

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

		String	z = "Tamim";
		//System.out.println(num0);

		//NonPrimitive Datatype (String, Arrays, Classes and Interfaces)

		String txt = "Tamim";


		// syntax for Arrays:
		// names = "yousuf", "shihab", "Mamun"				

		//1. How to store the values into Arrays(Note: Two ways available)

		// first way
		
		String [] words = {"Lipa","Zahid","Shipa","Kanon"};
		
		String [] names = {"Samiul", "Atia", "Shipa", "Kanon"}; 		

		int[] ph = {68220840, 4565555, 7895555, 10 ,20 ,30 ,40};	

		char[] ch1 = {'a', 'b', 'c', 'd'};

		short[] id = {1,2,3,4};
		
		/*System.out.println(words[0]);
		System.out.println(names[2]);
		System.out.println(ph[6]);
		System.out.println(ch1[1]);
		System.out.println(id[2]);
		//length of Array
		System.out.println(names.length);
		System.out.println(ph.length);*/


		// Second way, and mainly we use that 		
		//ClassName obj = new ClassName();

		String[] obj = new String[4];
				
				obj[0] = "Zahid";
				obj[1] = "Ashraf";
				obj[2] = "WXYZ";
				obj[3] = "xyz";
				
				//obj[4] = "Atiq"; 			//try to write 5th Arrays through an exception

		//2. How to pick value from Array ---> array[indexNumber]		
		System.out.println(obj[2]); 	//ArrayIndexOutOfBoundsException

		//3. how to get count of Array ---> array.lenght
		System.out.println(obj.length);
		

		//4. Print all value from Arrays use -for loop
		for(int i= 0 ; i <= 3; i++) {			
					System.out.println(obj[i]);
				}





	}

}
