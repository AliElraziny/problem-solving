package com.trycoding.problemsolving;

public class Palindrom {
	public static void main(String[] args) {
		
		System.out.println(isPalindrom("A man, a plan, a canal, Panama"));
		System.out.println(palindromByStringBuilder("ab"));
		System.out.println("Test 1: " + isPalindrom("madam")); // true
	    System.out.println("Test 2: " + isPalindrom("Racecar")); // true
	    System.out.println("Test 3: " + isPalindrom("A man, a plan, a canal, Panama")); // true
	    System.out.println("Test 4: " + isPalindrom("Hello, World!")); // false
	    System.out.println("Test 5: " + isPalindrom("")); // true
	    System.out.println("Test 6: " + isPalindrom("a")); // true
	    System.out.println("Test 7: " + isPalindrom("12321")); // true
	    System.out.println("Test 8: " + isPalindrom("No 'x' in Nixon")); // true
	    System.out.println("Test 9: " + isPalindrom("!!!")); // true
	    System.out.println("Test 10: " + isPalindrom("This is not a palindrome")); 
		
	}	
	public static boolean isPalindrom( String word) {
		
		String cleanedStr = word.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
		int right =cleanedStr.length()-1;
		int left =0;
		
		while(right>left) {
			if(cleanedStr.charAt(left)==cleanedStr.charAt(right)) {
				right--;
				left++;
			}
			else
				return false;
			
		}
		return true;
		
		
	} 
	
	public static boolean palindromByStringBuilder( String word) {
		
		String cleanedStr = word.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
		if(cleanedStr!="") {
			String reversedStr = new StringBuilder(cleanedStr).reverse().toString();

			return cleanedStr.equals(reversedStr);
			
		}else 
			return false;
		
		
	} 

}
