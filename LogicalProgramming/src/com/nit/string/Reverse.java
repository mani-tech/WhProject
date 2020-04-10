package com.nit.string;

public class Reverse {

	public static void main(String[] args) {
		String input="Hello Hero";
		String[] stringArray=input.split(" ");
		for(String arr:stringArray) {
			char[] charArray=arr.toCharArray();
			for(int i=charArray.length-1;i>=0;i--)
				System.out.print(charArray[i]);
			System.out.print(" ");
		}
		
	}

}
