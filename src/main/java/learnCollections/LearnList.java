package learnCollections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		// Step 1:- Create object for ArrayList -class

		//Create a list of all id no of employees 10,11,12,15,25,35,
		
		List<Integer> id = new LinkedList<Integer>();
		//List<String> names = new LinkedList<String>();
	//	List<String> names = new LinkedList<String>();
		id.add(10);
		id.add(15);
		id.add(12);
		
		System.out.println(id);
		
		System.out.println(id.size());
		
		/*names.add("Mamun");
		names.add("Tamim");
		names.add("Atia");*/

	/*	List<String> lst = new ArrayList<String>();
		
		//List<String> lst = new ArrayList<String>();
		
		//Add items in list- use add() method

		lst.add("Emon");
		lst.add("Leemon");
		lst.add("xyz");
		lst.add("yousuf");
		lst.add("shihab");
		lst.add("Mamun");
		lst.add("Kanon");

		
		System.out.println(lst);
		
		//get the count of list	- use size() method

		System.out.println(lst.size());
		//System.out.println(lst.size());	

		System.out.println("...............................................");

		lst.add("Emon");
		System.out.println(lst);
		System.out.println(lst.size());

		System.out.println("...............................................");
		
		//print any item from list - get() method

		System.out.println(lst.get(2));
		System.out.println(lst.get(3));
		System.out.println("...............................................");
		//print all items inside the list- use for loop
			

		for (int i = 0; i < lst.size(); i++) {
			System.out.println(lst.get(i));
		}

		System.out.println("...............................................");

		// delete/remove the item from list- use 
		lst.remove(0);

		System.out.println("...............................................");

		//print all items inside the list after remove	
		
		for (int i = 0; i < lst.size(); i++) {
			System.out.println(lst.get(i));
		}

		System.out.println("...............................................");

		//Contains(item)->Verifing Particular Item in the List-true/false
		
		System.out.println(lst.contains("Leemon"));
		System.out.println(lst.contains("Tayef"));	
		System.out.println(lst.contains("ABC"));	

		System.out.println("...............................................");

		//Clear the List- use clear() method
		lst.clear();

		System.out.println("...............................................");

		//isEmpty()->	Confirms the List is Empty-true/false
		
		System.out.println(lst.isEmpty());
		System.out.println(lst.isEmpty());*/






		/* List<String> lst1 = new ArrayList<String>(); 
		  lst1.add("Shamim");
		  lst1.add("Mamun"); 
		  lst1.add("Yousuf");
		  lst1.add("Limon"); 
		  lst1.add("Shihab");
		  lst1.add("Touhid"); 
		  lst1.add("Gopi"); 
		  lst1.add("Jewel"); 
		  lst1.add("Shahnaz");
		  lst1.add("Farah");


		  //Get the count of the list System.out.println(lst.size());
		  System.out.println("...............................................");

		  lst1.add("shihab"); 
		  System.out.println(lst1.size());
		  System.out.println("...............................................");

		  //Print all items inside the list 
		  for(int i = 0; i < lst.size(); i++) {
		  System.out.println(lst1.get(i));

		  }

		  System.out.println("...............................................");
		  //Delete the item from the list lst.remove(0);

		  //again Print all items inside the list

		  for(int i = 0; i <lst.size(); i++) { 
			  System.out.println(lst.get(i));

		  } System.out.println("...............................................");

		  System.out.println(lst.contains("abc"));

		  System.out.println("...............................................");

		  System.out.println(lst.contains("Yousuf"));

		  System.out.println("...............................................");
		  lst.clear();

		  System.out.println(lst.isEmpty());
		  System.out.println("...............................................");
		 

		System.out.println("...............................................");

		List
		//List<String> names = new LinkedList<String>();
				names.add("Mamun");
				names.add("Tamim");
				names.add("Atia");
				
				

		/*List<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(123);
		lst1.add(101112);
		lst1.add(456);
		lst1.add(789);
		lst1.add(123);



		for (Integer eachLst : lst1) {
			System.out.println(eachLst);
		}*/

	}

}

