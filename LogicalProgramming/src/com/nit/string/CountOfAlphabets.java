package com.nit.string;

import java.util.HashMap;
import java.util.Iterator;

public class CountOfAlphabets {

	public static void main(String[] args) {
		
		alphabetCount("programming");
	}
public static void alphabetCount(String str) {
	char[] charArray=str.toCharArray();
	HashMap<Character,Integer> hm=new HashMap<>();
	for(char ch:charArray) {
		if(hm.get(ch)!=null)
		{
			hm.put(ch, hm.get(ch)+1);
		}
		else
		{
			hm.put(ch, 1);
		}
		
	}
	Iterator<Character> itr=hm.keySet().iterator();
	while(itr.hasNext())
	{
		char ch1=(char) itr.next();
	if(hm.get(ch1)>1) {
		System.out.println("the word "+ch1+" appeared for "+hm.get(ch1)+" times");
	}
	}
}
}
