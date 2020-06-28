package learnCollections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class LearnMap {

	public static void main(String[] args) {

          Map<String, Integer> mp = new TreeMap<String, Integer>();// Result order depends on Implementation classes
          mp.put("Haque", 571);
          mp.put("Rob", 682);
          mp.put("Ali", 347);
          mp.put("abc", 123);
          mp.put("Ali", 444);
          mp.put("Gopi", 222);
          
          for(Entry<String, Integer> eachMp : mp.entrySet()) {
        	  System.out.println(eachMp.getKey() + "   " + eachMp.getValue());
          }
          //size()
          //System.out.println(mp.size());
          
          System.out.println(".........................");
          
          //get();
          System.out.println(mp.get("Ali"));
          
          //Remove()
         mp.remove("Gopi"); // just pass the Key
          
          System.out.println(".........................");
          
          //after remove Size of Map items
          System.out.println(mp.size());
          
          System.out.println(".........................");
          
          //ContainsKey()-Search by the Key
          System.out.println(mp.containsKey("Mamun")); //true/false
          
          System.out.println(".........................");
          
          //ContainsValue- Search by Value
          System.out.println(mp.containsValue(347)); //true/false
          
          //clear();
          mp.clear(); //Removes all Map data/items
          
          System.out.println(".........................");
          
          System.out.println(mp.size());// true/false
          
          System.out.println(".........................");
          
          System.out.println(mp.isEmpty());
          
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
