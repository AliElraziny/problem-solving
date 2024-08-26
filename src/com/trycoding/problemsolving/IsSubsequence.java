package com.trycoding.problemsolving;

public class IsSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isSubsequence("axc","ahbgdc"));
	}

	public static boolean isSubsequence(String s, String t) {

		if (s.length() > t.length())
			return false;
		int left = 0;
		for (int i = 0; i < t.length()&&left<s.length(); i++) {
			char a =s.charAt(left) ;
			char b =t.charAt(i) ;
			if (a== b)
				left++;

		}
		if (left == s.length())
			return true;
		else
			return false;
	}
}
