package Coding_Qus;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
//Print repeated characters count in a string
public class DuplicateCharsWithFrequency_HashMap {

	public static void main(String[] args) {
		String duplicateString= "HIIIIIII Eshaan";
		char duplicatesArray[] = duplicateString.toCharArray();
		
		HashMap<Character,Integer> hashMap=new HashMap<Character,Integer>();
		
		System.out.println(" Original String "+duplicateString);
		
		for(int i=0;i< duplicatesArray.length;i++) {
			if(hashMap.containsKey(duplicatesArray[i])) {
				
				hashMap.put(duplicatesArray[i], hashMap.get(duplicatesArray[i]) + 1);
			}
			else {
				hashMap.put(duplicatesArray[i], 1);
			}
			
		}
		Iterator<Entry<Character, Integer>> itr=hashMap.entrySet().iterator();
		while(itr.hasNext())
		{
			Entry<Character, Integer> entry = itr.next();
			System.out.println(" ");
			System.out.println(" Number = "+entry.getKey()+" -- "+entry.getValue());
			
		}
		
		//using java8
		System.out.println(" Using java8 ");
		Map<Character, Long> countsMap = duplicateString.chars().mapToObj(c->(char)c).filter(Character::isLetter).collect(Collectors.groupingBy(c->c,Collectors.counting()));
		Iterator<Entry<Character, Long>> itr1=countsMap.entrySet().iterator();
		while(itr1.hasNext())
		{
			Entry<Character, Long> entry = itr1.next();
			System.out.println(" ");
			System.out.println(" Number = "+entry.getKey()+" -- "+entry.getValue());
			
		}
	}

}
