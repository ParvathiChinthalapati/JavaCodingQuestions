package Coding_Qus;

import java.util.Arrays;
import java.util.List;

/* find second largest number without any predefined functions */

public class SecondLargestNumber_Without_PredefinedFunctions {

	public static void main(String[] args) {
	
	
	int[] array = {500,0,40,60,70,101,200};
	int temp =0;
	for(int i=0;i<array.length-1;i++) {
		if(array[i]>array[i+1]) {
			temp=array[i+1];
			array[i+1]=array[i];
			array[i] = temp;
		}
	}
	for(int i=0;i<array.length;i++) {
		System.out.println(array[i]);
	}
	System.out.println("Second largest number "+array[array.length - 2]);
	
	
	//using streams
	List<Integer> arrayList =Arrays.asList(500,0,40,60,70,101,200);
	List<Integer> sortedList = arrayList.stream().sorted().toList();

	System.out.println(sortedList);
	System.out.println("Second largest number "+sortedList.get(sortedList.size() - 2));
}
}


	 

