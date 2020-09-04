package javaDemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Collection_ListArrayList {

	public static void main(String[] args) {


		//create a object of ArrayList
		List<String> names = new ArrayList<String>();
		
	
		//1. add items in list- use add()
		names.add("Tipu");
		names.add("Nasir");
		names.add("Mamun");
		names.add("Touhid");
		names.add("Mizan");
		names.add("Shah");
		names.add("Shihab");
		names.add("Ashraf");
		names.add("Shah");
		names.add("Zia");
		
		System.out.println(names);
		
		//2. get count of list -use size()
		//System.out.println(names.size());
		
		
		//System.out.println(names.get(5));
		
		//4. after adding item -size of list
				//names.add("123");
				//System.out.println(names.size());
		
				
				//System.out.println("...........................................");
		//3. pick any item from list -use get()
		//System.out.println(names.get(3));
			
		//5. print all item from list- use for loop
	
				/*for (int i = 0; i <names.size(); i++) {
			System.out.println(names.get(i));
			}*/
		
			//6. delete particular item from list- use remove()
			//names.remove(4);
			//after remove
			/*for (int i = 0; i <names.size(); i++) {
				System.out.println(names.get(i));
				}*/
			
			//7. Verifing particular item in the list -use contains(item)- result true/false
			//System.out.println(names.contains("Shihab"));
			
			
			//8. Remove all the items from list- use -clear()
			//names.clear();
			
			//System.out.println("..............................");
			//9. For confirms the list is empty or not - use isEmpty()
			//System.out.println(names.isEmpty());
			//System.out.println(names.isEmpty());
			
		//print all item of list- use for each loop
		/*for (String eachName : names) {
			System.out.println(eachName);
		}*/
		
		//System.out.println("..........................................");
		
		
		List<Integer> lst = new ArrayList<Integer>();
		//List<Integer> num = new LinkedList<Integer>();
		
		lst.add(123);
		lst.add(101012);
		lst.add(12345);
		lst.add(456);
		
		for(Integer eachLst : lst) {
			System.out.println(eachLst);
		}
		
		}
		
		
		

	}


