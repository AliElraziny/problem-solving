package com.trycoding.problemsolving;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordPattern {

	public static void main(String[] args) {

		System.out.println(wordPattern("e","eukera"));
		System.out.println(wordPatternAnotherWay("e","eukera"));
		
	}

	public static boolean wordPattern(String pattern, String s) {
		String [] strs= s.split(" ");
		String res ="";
		int indx=0;	
		List<Character> chrsList =new ArrayList<>();
		Map<String, Character> map = new HashMap<>();
		
		for(int i = 0 ; i<pattern.length();i++)
		{
			if(!chrsList.contains(pattern.charAt(i)))
				chrsList.add(pattern.charAt(i));
		}
		for(int i = 0 ; i<strs.length && indx<chrsList.size();i++)
		{
			if(!map.containsKey(strs[i]))
				map.put(strs[i], chrsList.get(indx++));
		}
		if(map.size()!=chrsList.size())
			return false;
 		for(int i = 0 ; i<strs.length;i++) {
 			res+=map.get(strs[i]);
 		}
		return res.equals(pattern);
	}
	
	
	
	public static boolean wordPatternAnotherWay(String pattern, String s) {
		String [] strs= s.split(" ");
		if (pattern.length()!=strs.length)
			return false ;
		Map<Character, String> map = new HashMap<>();
		
		for(int i = 0 ; i<pattern.length();i++)
		{
			if (map.containsKey(pattern.charAt(i))) {
				if(!map.get(pattern.charAt(i)).equals(strs[i]))
					return false;
			}else {
				if(map.containsValue(strs[i]))
					return false ;
				
				map.put(pattern.charAt(i), strs[i]);
				
			}
			
		}

		return true;
	}

}
