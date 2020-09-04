package javaDemo;

public class StringConcept {

	public static void main(String[] args) {

		//way-1 String Literal
		//String text = "String Concept";
		//String text1 = "String Concept";
		
		//way-2 using String Object
		//String txt1 = new String("String Concept");
		
		/*System.out.println(System.identityHashCode(text));
		System.out.println(System.identityHashCode(text1));
		
		System.out.println(text);
		System.out.println(text1);
		
		//String class Method
		//1. equals -return true or false
		System.out.println(text.equals(text1));
		
		//System.out.println(text.equals(text1)); // equals function compare the value of two different variable(text n text1)
		System.out.println(text == text1); //compares memory address of String variable
		
		System.out.println(System.identityHashCode(text));
		System.out.println(System.identityHashCode(text1));*/
		
		//2. Length()- return count of String
		String text = "String Concept  ";
		String text2 = "Learning String";
		System.out.println(text.length());
		
	
		//3. Concat()- if you want to Concat (join more than one Strings) two String
		
			System.out.println(text.concat(text2)); 
			
		//If you want to concat different datatype variable, we use + 
			String num = "20";
			//String num1 ="30";
			int a = 10;
			int b = 20;
			System.out.println(num + a);
			System.out.println(a+b);
					
		//4. trim()- want to remove white space from both side of a String use trim()
		//	String line = "    Java String concept    ";
			//System.out.println(line);
			//System.out.println(line.length());
			//System.out.println(line.trim());
			//System.out.println(line.trim().length());
			
			//5. substring()- return partial string
			
			String text3 = "Learning String"; //return String word only i.e beginning from 9th index
			//String text3 = "Learning String is very important concept in java"; 
			//System.out.println(text3.substring(9));
			//System.out.println(text3.substring(9));
			//Substring()- print a particular String i.e beginIndex to endinIndex
			//System.out.println(text3.substring(4, 9));
			//System.out.println(text3.substring(0, 9));
			//System.out.println(text3.substring(9, 15));
			
			//6. toLowerCase()- convert all of the String as LowerCase()
			String text4 = "Compares String";
			System.out.println(text4.toLowerCase());
						
			//toUpperCase()- convert all of the String as UpperCase()
			//String text5 = "compares string";
			String text5 = "Compares String";
			System.out.println(text5.toUpperCase());
			
			//7. charAt() - returns character based on given index number
			System.out.println(text5.charAt(2));
			System.out.println(text5.charAt(9));
			
		//8. indexOf() - return the position of the given character 
			System.out.println(text5.indexOf('C'));
			System.out.println(text5.indexOf('S'));
			
			//9. startsWith() - given String start with particular Character/collection of char or not -return true/false
			System.out.println(text5.startsWith("c"));
			System.out.println(text5.startsWith("Com"));
			
			//endsWith() -given String ends with particular Character/collection of char or not -return true/false 
			System.out.println(text5.endsWith("s"));
			System.out.println(text5.endsWith("ing"));
			
			//contains() -given String is available in entire String or not - return true/false
			System.out.println(text5.contains("mpa"));
			System.out.println(text5.contains("tex"));
			
			
			
		
	}

}
