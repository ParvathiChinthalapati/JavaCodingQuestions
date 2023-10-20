package Coding_Qus;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
//Sort list of integer in desc order
public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(7, 9, 1, 6, 3);
		List<Integer> sortedList = list.stream().sorted(Comparator.reverseOrder()).toList();
		System.out.println(sortedList);
	}

}
