package learnCollections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LearnMap {

	public static void main(String[] args) {

		Map<String, Integer> mp = new LinkedHashMap<String, Integer>();
          //Map<String, Integer> mp = new LinkedHashMap<String, Integer>();// Result order depends on Implementation classes
         
          mp.put("Doha", 123);
          mp.put("Zia", 682);
          mp.put("Mizan", 347);
          mp.put("Abc", 123);
          mp.put("Mizan", 444);
          mp.put("Hasnath", 222);
          mp.put("Nasir", 555);
          mp.put("Rumman", 007);
       
         for(Entry<String, Integer> eachMp : mp.entrySet()) {
        	  System.out.println(eachMp.getKey() + "    " + eachMp.getValue());
          }
        
                          
          // get count of Map entry -size()
         System.out.println(mp.size());
          
        
         System.out.println(".........................");
          
          //get();
        System.out.println(mp.get("Mizan"));
          
          //Remove()
        // mp.remove("Hasnath"); // just pass the Key
          
         
         System.out.println(".........................");
          
          //after remove Size of Map items
        System.out.println(mp.size());
          
          //System.out.println(".........................");
          
          //ContainsKey()-Search by the Key
         System.out.println(mp.containsKey("Mamun")); //true/false
          
          System.out.println(".........................");
          
          //ContainsValue- Search by Value
         System.out.println(mp.containsValue(347)); //true/false
          
          //clear();
         //mp.clear(); //Removes all Map data/entry
          
          System.out.println(".........................");
          
         System.out.println(mp.size());// true/false
          
          //System.out.println(".........................");
          
          System.out.println(mp.isEmpty());
        
          System.out.println(".........................");
          
          for(Entry<String, Integer> eachMp : mp.entrySet()) {
        	  System.out.println(eachMp.getKey() + "    " + eachMp.getValue());
          }
          
          
         // for Each loop (Single dimension-List & Set)
          
         /* for(datatype VariableName : Collection) { // collection = List or Set
        	  
          }
          */
          
          //Map (2 dimension)
          
        /*  for(Entry<String, Integer> eachMp : mp.entrySet()) {
        	  System.out.println(eachMp.getKey() + "   " + eachMp.getValue());
          }*/

	}

}
