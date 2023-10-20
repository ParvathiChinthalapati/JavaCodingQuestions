package Coding_Qus;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

//Get highest repeated character count in given String
public class Higehst_Char_count_in_String {

	public static void main(String args[]) {

		String s = "heellllloooooo";
		Map<Character, Long> frequencyMap = s.chars().mapToObj(c -> (char) c).filter(Character::isLetter)
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		Character highestRepeatedChar = frequencyMap.entrySet().stream().max(Entry.comparingByValue())
				.map(Entry::getKey).orElse(null);
		System.out.println("highestRepeatedChar char " + highestRepeatedChar + " with frequency "
				+ frequencyMap.get(highestRepeatedChar));

		// without java8
		Map<Character, Integer> frequencyMap1 = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if (frequencyMap1.containsKey(s.charAt(i))) {
				frequencyMap1.put(s.charAt(i), frequencyMap1.get(s.charAt(i)) + 1);
			} else {
				frequencyMap1.put(s.charAt(i), 1);
			}
		}

		Iterator<Entry<Character, Integer>> itr = frequencyMap1.entrySet().iterator();
		while (itr.hasNext()) {
			Entry<Character, Integer> entry = itr.next();
			System.out.println("Char " + entry.getKey() + " value " + entry.getValue());
		}

//print max number in list
		List<Integer> inputList = Arrays.asList(13, 9, 99, 5, 24, 6);
		List<Integer> sortedList = inputList.stream().sorted(Comparator.reverseOrder()).toList();
		Optional<Integer> maxNumber = inputList.stream().max(Comparator.naturalOrder());
		System.out.println("Max number " + sortedList.get(0));
		System.out.println("Max number using max operator " + maxNumber.get());
		System.out.println("Max number using max function " + sortedList.get(0));

	}
}
