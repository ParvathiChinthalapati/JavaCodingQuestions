package Coding_Qus;

import java.util.Arrays;
import java.util.HashMap;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

//Print repeated numbers count in array
public class DuplicatesNumbersWithFrequency_HashMap {

	public static void main(String[] args) {
		int duplicates[] = { 8, 1, 6, 1, 10, 7, 8, 1, 7, 7, 7 };
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		int count = 1;
		System.out.println(" Original Array ");
		for (int i = 0; i < duplicates.length; i++) {
			System.out.print(duplicates[i] + " , ");
		}

		for (int i = 0; i < duplicates.length; i++) {
			if (hashMap.containsKey(duplicates[i])) {

				hashMap.put(duplicates[i], hashMap.get(duplicates[i]) + 1);
			} else {
				hashMap.put(duplicates[i], count);
			}

		}
		Iterator<Entry<Integer, Integer>> itr = hashMap.entrySet().iterator();
		while (itr.hasNext()) {
			Entry<Integer, Integer> entry = itr.next();
			System.out.println(" ");
			System.out.println(" Number = " + entry.getKey() + " -- " + entry.getValue());

		}

		// using java8
		System.out.println(" Using java8");
		List<Integer> list = Arrays.asList(8, 1, 6, 1, 10, 7, 8, 1, 7, 7, 7);
		Map<Integer, Long> hashMap1 = list.stream().collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		Iterator<Entry<Integer, Long>> itr1 = hashMap1.entrySet().iterator();
		while (itr1.hasNext()) {
			Entry<Integer, Long> entry = itr1.next();
			System.out.println(" ");
			System.out.println(" Number = " + entry.getKey() + " -- " + entry.getValue());

		}
	}
}
