package learnCollections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
	
	public static void main(String[] args) {
		
		Set<Integer> obj = new LinkedHashSet<Integer>();		
		obj.add(123);
		obj.add(456);
		obj.add(101112);
		obj.add(789);
		obj.add(123);
		obj.add(000);
		obj.add(789);
		
		
		for (Integer eachInt : obj) {
			System.out.println(eachInt);
		}
		
		System.out.println("****************");
		
		System.out.println(obj.size());
		
		System.out.println("****************");
		
		System.out.println(obj.contains(101112));
		
		System.out.println("****************");
		obj.remove(101112);
		
		
		for (Integer eachInt : obj) {
			System.out.println(eachInt);
		}
		
		System.out.println("****************");
		
		System.out.println(obj.size());
		
		System.out.println("****************");
		
		System.out.println(obj.contains(123));
		
		System.out.println(obj.contains(101112));
		
		System.out.println("****************");
		
	//	obj.clear();
		
		System.out.println(obj.isEmpty());
		
		
		
		
		
	}

}
