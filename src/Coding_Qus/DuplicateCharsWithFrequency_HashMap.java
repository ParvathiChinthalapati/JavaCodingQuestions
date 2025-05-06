package Coding_Qus;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;
//Print repeated characters count in a string
public class DuplicateCharsWithFrequency_HashMap {

	public static void main(String[] args) {
		String duplicateString= "HIIIIIII Eshaan";
		String duplicatesArray[] = duplicateString.split("");//duplicateString.toCharArray();
		
		List<String> inputList = Arrays.asList(duplicatesArray);
		
		HashMap<String,Integer> hashMap=new HashMap<String,Integer>();
		
		System.out.println(" Original String "+duplicateString);
		
		for(int i=0;i< duplicatesArray.length;i++) {
			if(hashMap.containsKey(duplicatesArray[i])) {
				
				hashMap.put(duplicatesArray[i], hashMap.get(duplicatesArray[i]) + 1);
			}
			else {
				hashMap.put(duplicatesArray[i], 1);
			}
			
		}
		Iterator<Entry<String, Integer>> itr=hashMap.entrySet().iterator();
		while(itr.hasNext())
		{
			Entry<String, Integer> entry = itr.next();
			System.out.println(" ");
			System.out.println(" Number = "+entry.getKey()+" -- "+entry.getValue());
			
		}
		
		//using java8
		System.out.println(" Using java8 ");
		Map<Object, Long> countMap = duplicateString.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()));
		countMap.entrySet().stream().forEach( entry -> System.out.println("Character "+entry.getKey()+" value "+entry.getValue()));
		System.out.println(" Using list of strings print only duplicate");
		Map<String,Long> countsMap2 = inputList.stream().collect(Collectors.groupingBy(input -> input, Collectors.counting()));
		  countsMap2.entrySet().stream().filter(number -> number.getValue() > 1).map(
				  entry -> "Character "+entry.getKey()+" value "+entry.getValue()).forEach(System.out::println);

		System.out.println("sentence");
		String sentence = "I am learning Java. Java is a programming language. Java is used in web development.";
		String[] strArray = sentence.split(" ");
		List<String> strList = Arrays.asList(strArray);
		Map<Object, Long> countmap1 = strList.stream().collect(Collectors.groupingBy(s->s,Collectors.counting()));
		countmap1.entrySet().forEach(entry -> System.out.println(entry.getKey()+":"+entry.getValue()));
		
	}

}
