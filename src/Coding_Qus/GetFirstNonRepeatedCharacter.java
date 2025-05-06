package Coding_Qus;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
//Print first non-repeated character in the given string
public class GetFirstNonRepeatedCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "MotivityLabs";
		String[] inputArray = str.split("");
		List<String> inputList = Arrays.asList(inputArray);
		Map<String,Long> countMap1 = inputList.stream().collect(Collectors.groupingBy(c->c,LinkedHashMap::new,Collectors.counting()));
		String firstNonRepeatedChar1 = countMap1.entrySet().stream().filter(entry -> entry.getValue()==1).map(Entry::getKey).findFirst().orElse(null);
		System.out.println("firstNonRepeatedChar1 " + firstNonRepeatedChar1);
		Map<Character, Long> countMap = str.chars().mapToObj(c -> (char) c).filter(Character::isLetter)
				.collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()));

		Character firstNonRepeatedChar = countMap.entrySet().stream().filter(entry -> entry.getValue() == 1)
				.map(Entry::getKey).findFirst().orElse(null);
		System.out.println("firstNonRepeatedChar " + firstNonRepeatedChar);
		
		String name = "PARVATHI";
		Map<Character,Long> nameMap =name.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,LinkedHashMap::new,Collectors.counting()));
		Character firstNonRepeatedChar2 = nameMap.entrySet().stream().filter(c->c.getValue() == 1).map(c->c.getKey()).findFirst().orElse(null);
		System.out.println("firstNonRepeatedChar2 " + firstNonRepeatedChar2);
		
		String name2 = "SURYA";
		Map<Character,Long> map = name2.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c, LinkedHashMap::new,Collectors.counting()));
		Character nonreperated1 = map.entrySet().stream().filter(entry-> entry.getValue() ==1).map(Entry::getKey).findFirst().orElse(null);
		System.out.println("firstNonRepeatedChar2 " + nonreperated1);
	}

}
