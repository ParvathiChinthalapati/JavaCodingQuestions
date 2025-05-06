package Coding_Qus;

import java.util.*;
import java.util.stream.Collectors;

public class PrintSecondLargestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "i am a good programmer";
		String inputArr[] = input.split(" ");
		List<String> inputList = Arrays.asList(inputArr);
		Map<String, Long> countMap = new HashMap<String, Long>();

		for (int i = 0; i < inputList.size(); i++) {
			countMap.put(inputList.get(i), (long) inputList.get(i).length());
		}
		countMap.entrySet().stream().sorted((a, b) -> b.getValue().compareTo(a.getValue())).limit(2).skip(1).forEach(entry -> System.out.println("secondLargest word" + entry.getKey()));
//using comparator
		System.out.println("secondLargest word using comparator");
		countMap.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue,Comparator.reverseOrder())).limit(2).skip(1).forEach(entry -> System.out.println("secondLargest word" + entry.getKey()));

	}

}
