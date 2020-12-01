package javaDemo;

public class StringConcept01 {

	public static void main(String[] args) {

		//String class Method


		//1. equals -return true or false
		//System.out.println(text.equals(text1)); // equals function compare the value of two different variable(text n text1)

		String text = "String Concept";
		String text1 = "String Concept";

		System.out.println(text.equals(text1));

		//System.out.println(text.equals(text1)); 

		System.out.println(System.identityHashCode(text));
		System.out.println(System.identityHashCode(text1));

		//System.out.println(text == text1); //compares memory address of String variable

		System.out.println(System.identityHashCode(text));
		System.out.println(System.identityHashCode(text1));

		//2. Length()- return count of String
		//String text = "String Concept  ";

		String text2 = "Learning String";
		System.out.println(text2.length());
		System.out.println(text2.length());

		System.out.println("...............................");

		//3. Concat()- if you want to Concat (join more than one Strings) two String

		System.out.println(text.concat(text2));
		System.out.println(text.concat(text2)); 
		System.out.println(text +", "+ text2);

		//If you want to concat different datatype variable, we use + 

		String num = "20";
		String num1 ="30";
		int a = 10;
		int b = 20;

		String firstName = "Mamunur";
		String lastName ="Chowdhury";

		System.out.println( num +","+ num1);

		System.out.println( num + a);

		System.out.println(firstName +" "+lastName);
		System.out.println(a+b);

		String line = "    Java String concept   ";
		System.out.println(line.trim());

		//6. toLowerCase()- convert all of the String as LowerCase()
		String text4 = "Compares String";
		System.out.println(text4.toLowerCase());

		//toUpperCase()- convert all of the String as UpperCase()
		String text5 = "compares string";
		//String text5 = "Compares String";
		System.out.println(text5.toUpperCase());

		String text6 = "compares string";

		//contains() -given String is available in entire String or not - return true/false
		System.out.println(text6.contains("mpa"));
		System.out.println(text6.contains("tex"));
		System.out.println(text6.contains("ing"));
		
		String name = "Basith";
		System.out.println(name.contains("Ba"));
		
		String name1 = "Omar";
		System.out.println(name1.equals("Omar"));


	}


}


