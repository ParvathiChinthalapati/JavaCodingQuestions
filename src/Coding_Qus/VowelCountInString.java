package Coding_Qus;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
/**Write a program find Vowel Count in String using Java 8.**/

public class VowelCountInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "parvathi";
		List<Character> vowelsList = Arrays.asList('a','e','i','o','u');
		Map<Object, Long> charCount = input.chars().mapToObj(c->(char)c).filter(c -> vowelsList.contains(c)).collect(Collectors.groupingBy(c->c,Collectors.counting()));
		charCount.entrySet().forEach(entry -> System.out.println("char: "+entry.getKey()+", value: "+entry.getValue()));
	}

}
