package com.String;

public class reverseString {
public static void main (String []s){
	
String str = "This is java";
	
System.out.println(str);




String reverseStr = new StringBuffer(str).reverse().toString();
System.out.println(reverseStr);
reverseIteratively(str);
reverseStr = reverseRecursively(str);
System.out.println("Reverse String in Java using Recursion: " + reverseStr);



}


	public static void reverseIteratively( String str){
	StringBuilder reverseStr = new StringBuilder();
	char []ch = str.toCharArray();
	for (int i =str.length()-1; i >= 0; i--){
	reverseStr.append(ch[i]);
	}
	System.out.println(reverseStr);
	}
	
	
	public static String reverseRecursively( String str){
		//base case to handle one char string and empty string
        if (str.length() < 2) {
            return str;
        }

        return reverseRecursively(str.substring(1)) + str.charAt(0);

    }


	
	}



	
