package com.nit.string;

public class ReverseOfString {

	public static void main(String[] args) {
		//StringBuffer s=new StringBuffer("Hello My Dear");
		//s.reverse();
		String s="Hello My Dear";
		/*
		 * char[] charArray=s.toCharArray(); System.out.println(s); for(int
		 * i=charArray.length-1;i>=0;i--) { System.out.print (charArray[i]); }
		 */
		String[] stringArray=s.split(" ");
		for(int i=0;i<3;i++)
		{
			char[] charArray=stringArray[i].toCharArray();
			for(int j=charArray.length-1;j>=0;j--)
			{
				System.out.print(charArray[j]);
				
			}
		System.out.print(" ");
		}
	}

}
