package com.nit.demo1;

import java.util.Date;

public class DisplayDate {
	public Date date() {
		return new Date();
	}
	public static void main(String[] args) {
		DisplayDate d=new DisplayDate();
		System.out.println(d.date());

	}

}
