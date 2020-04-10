package com.nit.string;

import java.util.HashMap;

public class DuplicateLetter {

	public static void main(String[] args) {
		
		countNumbers("java j2ee jsp java jsp spring spring spring");
	} 
public static void countNumbers(String str) {
	String[] stringArray=str.split(" ");
	HashMap<String,Integer> hm=new HashMap<>();
	for(String arr:stringArray) {
		if(hm.get(arr)!=null)
		{
			hm.put(arr, hm.get(arr)+1);
		}
		else {
			hm.put(arr, 1);
		}
	}
	System.out.println(hm);
	
}
}
