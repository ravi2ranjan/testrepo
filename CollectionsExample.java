package com.ranjan.util;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Queue;

public class CollectionsExample {
	
	public CollectionsExample()
	{
		
	}
	
	public static void main(String argsp[])
	{
		Deque<String> pq=new ArrayDeque<String>();
		pq.add("Ravi");
		pq.add("Sonu");
		pq.add("Priya");
		pq.add("Ravi Ranjan");
		Queue<String> l=Collections.asLifoQueue(pq);
		l.forEach(n->System.out.println(n));
	}

}
