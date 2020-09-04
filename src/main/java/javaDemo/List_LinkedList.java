package javaDemo;

import java.util.LinkedList;
import java.util.List;

public class List_LinkedList {

	public static void main(String[] args) {


		List<String> emp = new LinkedList<String>();
		
		emp.add("Rahim");
		emp.add("Karim");
		emp.add("Doha");
		emp.add("Zia");
		emp.add("Tanzan");
		
		System.out.println(emp.size());
		
		for (String eachEmp : emp) {
			System.out.println(eachEmp);
			
		}

	}

}
