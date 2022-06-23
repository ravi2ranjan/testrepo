package com.ranjan.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class CollectionExample {
	
	public CollectionExample()
	{
		
	}
	
	public static void main(String args[])
	{
		Collection<String> b=new ArrayList<String>();
		Collection<String> c=new ArrayList<String>();
		c.add("ravi");
		c.add("Sonu");
		c.add("Ranjan");
		c.add("Amit");
		c.add("Raju");
		b.add("ravi");
		b.add("Sonu");
		b.add("Ranjan");
		c.retainAll(b);
		c.removeIf(n -> (n.charAt(0)=='S'));
		Iterator<String> i=c.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
			i.remove();
		}
		Iterator<String> j=c.iterator();
		while(j.hasNext()) //not display
		{
			System.out.println(j.next());
			j.remove();
		}
		
		
	}

}
