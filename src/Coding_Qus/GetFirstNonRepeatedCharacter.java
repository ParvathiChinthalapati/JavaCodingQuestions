package Coding_Qus;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
//Print first non-repeated character in the given string
public class GetFirstNonRepeatedCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "MotivityLabs";

		Map<Character, Long> countMap = str.chars().mapToObj(c -> (char) c).filter(Character::isLetter)
				.collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()));

		Character firstNonRepeatedChar = countMap.entrySet().stream().filter(entry -> entry.getValue() == 1)
				.map(Entry::getKey).findFirst().orElse(null);
		//single line of code
		Character countMap1 = str.chars().mapToObj(c -> (char) c).filter(Character::isLetter)
				.collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting())).entrySet().stream().filter(entry -> entry.getValue() == 1)
				.map(Entry::getKey).findFirst().orElse(null);

		System.out.println("firstNonRepeatedChar " + firstNonRepeatedChar);
		System.out.println("firstNonRepeatedChar " + countMap1);

	}

}
