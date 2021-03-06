package com.solve.ctci.arraysandstrings.mycode;

import java.util.Arrays;

public class StringPermutationA {
	
	static boolean isPermutation(String wordA, String wordB){
		char[] a = wordA.toCharArray();
		Arrays.sort(a);
		char[] b = wordB.toCharArray();
		Arrays.sort(b);
		
		return new String(a).equals(new String (b));
			
	
	}
	
	
public static void main(String []args){
	String word_set[][] = {{"apple", "pplea"}, {"bat", "tab"}, {"bab", "tat"}};
	for(String[] pair : word_set){
		String wordA = pair[0];
		String wordB = pair[1];
		System.out.println(wordA + " & "+ wordB +" are permutations: "+ isPermutation(wordA, wordB));
	}
}
}
