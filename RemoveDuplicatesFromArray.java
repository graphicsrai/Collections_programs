package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromArray {
	public static void main(String[] args) {
		//using TreeSet
		List<Integer> l1=new ArrayList<>(Arrays.asList(1,2,3,1,4,5,5,6,7,1,8,9));
		Set t1=new TreeSet<>(l1);

		System.out.println(t1);
		
		//using stream
		List<Integer> nums=new ArrayList<>(Arrays.asList(1,2,3,1,4,5,5,6,7,1,8,9));
		List<Integer>uniqueNums = nums.stream().distinct().collect(Collectors.toList());
									
		System.out.println(uniqueNums);
	}
	
	
}
