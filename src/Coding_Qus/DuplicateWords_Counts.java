package Coding_Qus;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateWords_Counts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "Hi My name is Parvathi. My company is techblocks";
		String[] wordArray = sentence.split(" ");
		List<String> wordList = Arrays.asList(wordArray);
		for (int i = 0; i < wordArray.length; i++) {
			System.out.println("Words " + wordArray[i]);
		}

		Map<String, Long> countMap = wordList.stream()
				.collect(Collectors.groupingBy(word -> word, Collectors.counting()));
		countMap.entrySet().stream().forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));

	}

}
