package com.trycoding.problemsolving;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

	public static void main(String[] args) {
		System.out.println(findSingleNumber(new int[] { 1, 2, 3, 2, 3, 4, 4 }));
	}

	public static int findSingleNumber(int arr[]) {

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue().equals(1)) {
				return entry.getKey();
			}

		}
		return 0;

	}
}
