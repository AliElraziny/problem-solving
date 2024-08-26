package com.trycoding.problemsolving;


public class RotateArray {
	public static void main(String[] args) {
		rotate(new int [] {1,2,3,4,5,6,7},3);
	}
	
    public static void rotate(int[] nums, int k) {
    	int [] arr1=new int[nums.length];
    	for(int i =0;i<k;i++) {
    		arr1[i]=nums[nums.length-k+i];
    		
    	}
    	for(int i =0;i<nums.length-k;i++) {
    		arr1[i+k]=nums[i];
    		
    	}
    	
    	nums=arr1;
        
    }
}
