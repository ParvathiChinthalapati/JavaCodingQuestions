package Coding_Qus;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//consider integer list as input and expected output in the format of string separated with commas.
public class NumberList_to_StringWithCommas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		list.add(76);
		list.add(90);
		list.add(34);
		list.add(12);
		
		String finalString = list.stream().map(Object::toString).collect(Collectors.joining(","));
		System.out.println("finalString "+finalString);

	}

}
