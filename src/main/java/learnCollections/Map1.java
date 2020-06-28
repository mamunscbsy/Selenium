package learnCollections;

import java.util.HashMap;
import java.util.Map;

public class Map1 {

	public static void main(String[] args) {
		Map<String, String>	people = new HashMap<String, String>();
		people.put("Bangladesh", "Dhaka");
		people.put("India", "New Delli");
		people.put("USA", "DC");
		people.put("UK", "London");
		
		System.out.println(people.size());
		
		}

}
