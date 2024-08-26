package com.trycoding.problemsolving;

import java.util.Arrays;

public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		System.out.println(longestConsecutive(new int[] {1,2,0,1}));
	}

	 public static int longestConsecutive(int[] nums) {
	     
		 
		 Arrays.sort(nums);
		 int max=0;
		 int count =1;
		 for (int i =1;i<nums.length;i++) {
			 
			 if((nums[i])==nums[i-1]+1)
			 {
				 count+=1;
			 }else {
				 if(count>max)
					 max=count;
				 count=1;
			 }
			 if(count>max)
				 max=count;
			 
		 }
		 if(count>max)
			 max=count;
	   
		 return max;
	 }
}
