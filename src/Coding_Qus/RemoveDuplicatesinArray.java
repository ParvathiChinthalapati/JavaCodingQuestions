package Coding_Qus;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
//remove duplicate elements from an array
public class RemoveDuplicatesinArray {
	
	public static void main(String args[]) {
		int org_Array[]= {8,5,2,8,9,2,9,4,5,1};
		System.out.println("Original Array");
		for(int i=0;i<org_Array.length;i++) {
			System.out.print(" "+org_Array[i]);
		}
		Arrays.sort(org_Array);
		System.out.println("");
		System.out.println("After Sorting");
		for(int i=0;i<org_Array.length;i++) {
			System.out.print(" "+org_Array[i]);
		}
		int temp_array[] = new int[org_Array.length];
		int temp_array_length=0;
		
		for(int i=0;i<org_Array.length-1;i++) {
			if(org_Array[i]!=org_Array[i+1]) {
				temp_array[temp_array_length++]=org_Array[i];
			}
		}
		temp_array[temp_array_length++]=org_Array[org_Array.length-1];
		System.out.println("");
		System.out.println("Final Array");
		for(int i=0;i<temp_array_length;i++)
		{
			System.out.print(" "+temp_array[i]);
		}
		
		//using hashset
		System.out.println("Using Hashset");
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i=0;i<org_Array.length;i++) {
			set.add(org_Array[i]);
		}
		
		System.out.print(" "+set);
		
		//using java8
		
		List<Integer> orgList = Arrays.asList(8,5,2,8,9,2,9,4,5,1);
		List<Integer> uniqueList = orgList.stream().distinct().toList();
		System.out.println("Using Java8 "+uniqueList);
		
	}

}
