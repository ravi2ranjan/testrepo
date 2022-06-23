package com.ranjan.util;

import java.util.ArrayList;

public class ArrayListExample {
	
	public  ArrayListExample()
	{
		
	}
	
	public static void main(String args[])
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add(null);
		al.add("Ravi");
		al.add("vini");
		al.add("Sonu");
		al.forEach(n->System.out.println(n));
	}

}
