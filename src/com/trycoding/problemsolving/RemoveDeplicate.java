package com.trycoding.problemsolving;


public class RemoveDeplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] { 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4 };
		System.out.println(removeDuplicates(nums));
	}

	public static int removeDuplicates(int[] nums) {
		int left = 0;
		for (int right = 0; right < nums.length; right++) {
			if (nums[left] != nums[right]) {
				left++;
				nums[left] = nums[right];
			}
		}

		return left + 1;
	}

}
