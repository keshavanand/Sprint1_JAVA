package com.fdmgroup.problemSolvingExercises.Basic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicatesInArray {
	
	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5,1,2,4,7,8,9,2,4};
		
		System.out.println(findDuplicates(numbers));
		
		System.out.println(findDuplicatesTwo(numbers));
	}
	
	public static List<Integer> findDuplicates(int[] array){
		Set<Integer> set = new HashSet<>();
		List<Integer> list = new ArrayList<>();
		
		for(int number: array) {
			if(!set.add(number)) {
				if(!list.contains(number)) {
					list.add(number);
				}
			}
		}
		
		return list;
	}
	
	public static List<Integer> findDuplicatesTwo(int[] nums){
		List<Integer> duplicates=  new ArrayList<>();
		int size = nums.length;
		
		for(int i = 0;i<size;i++) {
			int newIndex = Math.abs(nums[i]) - 1;
			int currentValue = nums[i];
			
			if(nums[newIndex]<0 && !duplicates.contains(currentValue)) {
				duplicates.add(currentValue);
			}else {
				nums[newIndex] = -nums[newIndex];
			}
			
		}
		return duplicates;
	}
}
