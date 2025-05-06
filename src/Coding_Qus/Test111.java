package Coding_Qus;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Test111 {
	public static void main(String args[]) {
		Map<Integer, CustomerDetails> inputMap=new HashMap<>();
		CustomerDetails c1 = new CustomerDetails(3,"Parvathi","ch");
		CustomerDetails c2 = new CustomerDetails(2,"Surya","D");
		CustomerDetails c3 = new CustomerDetails(1,"Eshaan","D");

	    inputMap.put( 1, c1);
	    inputMap.put( 2,c2 );
	    inputMap.put( 3,c3 );
	    
	 // Sort the map by customerFirstName using Java 8 Streams and TreeMap 
	    Map<Integer, CustomerDetails> sortedMap = inputMap.entrySet().stream() .sorted(Map.Entry.comparingByValue(Comparator.comparing(CustomerDetails::getFirstname))).collect(Collectors.toMap( Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, TreeMap::new ));
	    
	   //Map<Integer, CustomerDetails> sortedMap = new TreeMap<>(Comparator.comparing(entry -> entry.getValue.getName())); 
	   //Map<Integer, CustomerDetails> sortedMap = new TreeMap<>(Comparator.comparing(CustomerDetails::getFirstName));
	  // sortedMap.putAll(inputMap);
	   
		
	   // Map<Integer,CustomerDetails> sortedMap = inputMap.entrySet().stream().sorted(Map.Entry.<Integer,CustomerDetails>comparingByValue(Comparator.comparing(CustomerDetails::getFirstName))).
	  
	   // Map<Integer,Employee> sortedMap = inputMap2.entrySet().stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)));
	    
	   /*Map<Integer, Employee> sortedMap1 = inputMap.entrySet()
                .stream()
                .sorted(Map.Entry.<Integer,Employee>comparingByValue(Comparator.comparing(Employee::getName))
                .collect(Collectors.toMap(
                        Map.Entry::getKey, // Map key
                        Map.Entry::getValue, // Map value
                        (oldValue, newValue) -> oldValue, // Merge function
                        LinkedHashMap::new // LinkedHashMap to preserve insertion order
                ));    */
	    sortedMap.entrySet().forEach(entry -> System.out.println(entry.getKey()+":"+entry.getValue().getId()+"-"+entry.getValue().getFirstname()+"-"+entry.getValue().getLastname()));
	}

	
    

}
