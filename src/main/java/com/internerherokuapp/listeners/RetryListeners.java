package com.internerherokuapp.listeners;

import java.time.LocalTime;

public class RetryListeners {

	//write logic to retry failed test cases
	//IRetryAnalyzer--->(IAnnotationTransformer)
/*	public static void main(String[] args) {
		LocalTime obj=LocalTime.now();
		System.out.println(obj);
		
		//18:11:42.512182700//here i need to remove :
		//replace---string
	/*	String str=obj.toString();//here tostringmethod it will return any object to string
		String str2=str.replace(":", " ");
		String str3=str2.replace(".", " ");
		//System.out.println(str2.replace(".", " "));
		System.out.println(str3);
		*/
		//System.out.println(obj.toString().replace(":", "").replace(".", ""));
		
/*		//advanced concept
		String s="abcABC345def67ghij89klmn9";
		//Q)remove all letters 
		//regular expression
		System.out.println(s.replaceAll("[^a-zA-Z]", ""));
		
	}
*/
}
