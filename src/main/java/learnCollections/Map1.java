package learnCollections;


import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;


public class Map1 {

	public static void main(String[] args) {
		Map<String, String>	country = new TreeMap<String, String>();
		
		country.put("Bangladesh", "Dhaka");
		country.put("India", "New Delli");
		country.put("USA", "Washington DC");
		country.put("UK",  "London");
		
		System.out.println(country.size());
		
		for(Entry<String, String> eachCountry : country.entrySet()) {
      	  System.out.println(eachCountry.getKey() + "    " + eachCountry.getValue());
        }
		
		}

}
