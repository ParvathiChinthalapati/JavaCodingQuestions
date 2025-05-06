package Coding_Qus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
//print output in this format 1->2->4->6->8->8->10
public class CombineTwoLists {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Integer[] array1 = {1,2, 4, 6, 8, 61, 7};
        Integer[] array2 = {1,9,10, 6, 8, 82, 1};
        // Combine arrays into a list
        List<Integer> combinedList = new ArrayList<>();
        for (int num : array1) {
            combinedList.add(num);
        }
        for (int num : array2) {
            combinedList.add(num);
        }
        Collections.sort(combinedList);
        //list3.addAll(list2);
        String result = combinedList.stream().map(String::valueOf).collect(Collectors.joining("->"));
       System.out.println("Result "+result);
    }
}
