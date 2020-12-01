package learnCollections;



import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;




public class LearnSet {
	
	
	
	public static void main(String[] args) {
		
		//Set<Integer> obj = new TreeSet<Integer>();
		//Set<Integer> obj = new TreeSet<Integer>();
	Set<Integer> obj = new LinkedHashSet<Integer>();
		//Set<Integer> obj = new HashSet<Integer>();
		
		
		//1. add items in Set- use add()
		obj.add(444);
		obj.add(125);
		obj.add(721);
		obj.add(123);
		obj.add(456);
		obj.add(101112);
		obj.add(789);
		obj.add(123);
		obj.add(237);
		//obj.add(000);
		obj.add(789);
		
		//2. Get count of Set- use size()
		System.out.println(obj.size());
			
		
		System.out.println("..................................");
		
		//3. print/display all items in the Set -use foreach
		
		/*for (Integer eachInt : obj) {
			System.out.println(eachInt);
		}*/
		
		for (Integer eachObj : obj) {
			System.out.println(eachObj);
		}
		
		/*for (Integer eachObj : obj) {
			System.out.println(eachObj);
			
		}*/
		
		//System.out.println("****************");
		
		
		
		//5. Pick particular item from set- use contains() -output-true/false
		System.out.println(obj.contains(101112));
		
		System.out.println("****************");
		
		//4. delete item from Set - use remove(item)
		obj.remove(101112);
		
		//after delete/remove item
		for (Integer eachInt : obj) {
			System.out.println(eachInt);
		}
		
		System.out.println("****************");
		
		//after delete item
		System.out.println(obj.size());
		
		//System.out.println("****************");
		
		//System.out.println(obj.contains(123));
		
		System.out.println(obj.contains(101112));
		
		System.out.println("****************");
		
	//	6. Remove all items from Set - use obj.clear()
		//obj.clear();
		
		
		//7. Confirm set is Empty or not- use isEmpty()- output- true/false
		System.out.println(obj.isEmpty());
		
		
		
		
		
	}

}
