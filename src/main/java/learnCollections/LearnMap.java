package learnCollections;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

import javaDemo.ForeachLoop;

public class LearnMap {

	public static void main(String[] args) {
		
		//Map<String, Integer> mp1 = new LinkedHashMap<String, Integer>();
		
		
		Map<String, Integer> mp = new LinkedHashMap<String, Integer>();
		
          //Map<String, Integer> mp = new LinkedHashMap<String, Integer>();// Result order depends on Implementation classes
         
		  mp.put("Basith", 324);
		  mp.put("Atia", 100);
		  mp.put("Emon", 444);
          mp.put("Tasnim", 123);
          mp.put("Khadija", 682);
          mp.put("Dinner", 347);
          mp.put("Abc", 123);
          mp.put("Tasnim", 444);
          mp.put("Masud", 222);
          mp.put("Anwar", 555);
          mp.put("Parsa", 777);
          
          
    
			
		     /*  for (Entry<String, Integer> eachMp : mp.entrySet()) {
        	 System.out.println(eachMp.getKey() +""+ eachMp.getValue());
			
		}
        
        System.out.println(".........................");
        
       for(Entry<String, Integer> eachMp : mp.entrySet()) {
        	  System.out.println(eachMp.getKey() + "    " + eachMp.getValue());
          }*/
        
                          
          // get count of Map entry -size()
        System.out.println(mp.size()); 
          
        
         System.out.println(".........................");
          
          //get();
         System.out.println(mp.get("Tasnim"));
          
          //Remove()
         mp.remove("Anwar"); // just pass the Key
          
         
       System.out.println(".........................");
          
       // After remove Size of Map items
        System.out.println(mp.size());
          
          System.out.println(".........................");
          
          //ContainsKey()-Search by the Key
        System.out.println(mp.containsKey("Mamun")); //true/false
          
          System.out.println(".........................");
          
          //ContainsValue- Search by Value
         System.out.println(mp.containsValue(347)); //true/false
          
          //clear();
          mp.clear(); //Removes all Map data/entry
          
          System.out.println(".........................");
          //After clear
         System.out.println(mp.size());
          
          //System.out.println(".........................");
          
         //verify empty or not
          System.out.println(mp.isEmpty()); // true/false
        
         System.out.println(".........................");
          
          for(Entry<String, Integer> eachMp : mp.entrySet()) {
        	  System.out.println(eachMp.getKey() + "    " + eachMp.getValue());
          }
          
          
         // for Each loop (Single dimension-List & Set)
          
         /* for(datatype VariableName : Collection) { // collection = List or Set
        	  
          }
          */
          
          //Map (2 dimension)
          
        

	}

}
