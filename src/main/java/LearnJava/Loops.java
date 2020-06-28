package LearnJava;

import java.util.Arrays;

public class Loops {
	
	 static String x = "Mamun";
	
	
	//1. for iterator ---> based on index
	//2. for each ---> based on items
	//3. while loop
	//4. do while loop
	
	
	public static void main(String[] args) {
		
		System.out.println("x");
		
		// for iterator
		// syntax for "for iterator"
		/* for(startsvalue; conditions; increment or decrement){
		
		    // body of for loop
		
	    }*/
		
//1. for Iterator
				
		/*for(int i=1; i<=10; i++) {
			System.out.println(i);
		}*/
		
//2. While loop
		/*int i = 1;		
		while(i<=10) {
			System.out.println(i);
			i++;
		}*/
		
//3. foreach
		//Syntax for "forEach"
		/*for(DataType eachColleciton : collection) {
			
		}*/
		
		String[] names = {"yousuf", "shihab", "abcd", "mamun"}; 
		
		
		for(String eachName : names) {			
			System.out.println(eachName);			
		}
		
		
		int[] ph = {123, 456, 789, 1 ,2 ,3 ,4};	
		Arrays.sort(ph);
		
		for( int eachPh : ph) {			
			System.out.println(eachPh);
		}
		
		
		
		
		
		
		
	}

}
