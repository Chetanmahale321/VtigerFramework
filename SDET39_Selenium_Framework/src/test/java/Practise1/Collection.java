package Practise1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeSet;

public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		ArrayList<Object> list =new ArrayList<Object>();
//		list.add(10);
//		list.add("hi");
//		list.add('A');
//		list.add(10);
//		list.add(null);
//		System.out.print(list);
		
//		ArrayList<Object> list =new ArrayList<Object>();
//		list.add(10);
//		list.add("hi");
//		list.add('A');
//		list.add(10);
//		list.add(null);
//		list.add(2, "Hellow");
//		ArrayList<Object> list2 =new ArrayList<Object>();
//		list.add("bye");
//		list.add('A');
//		list.addAll(list2);
//		System.out.print(list);
//		System.out.print(list2);
		
//		ArrayList<Object> list =new ArrayList<Object>();
//		list.add(10);
//		list.add("hi");
//		list.add('A');
//		list.add(10);
//		list.add(null);
//		list.add(2, "Hellow");
//		if(list.contains('A'))
//		{
//			System.out.println("yes");
//		}
//		else 
//		{
//			System.out.println("no");
//		}
		
//		ArrayList<Integer> list =new ArrayList<Integer>();
//		list.add(10);
//		list.add(20);
//		list.add(30);
//		list.add(10);
//		list.add(5);
//		Collections.sort(list);
//		for(Integer integer : list) 
//		{
//			System.out.println(integer);	
//		}
		
//		ArrayList<Object> list =new ArrayList<Object>();
//		list.add("hi");
//		list.add('A');
//		list.add(10);
//		list.add(null);
//		list.add(20);
//		ArrayList<Object> list2 =new ArrayList<Object>();
//		list2.add(10);
//		list2.add("hi");
//		list2.add('A');
//		list.retainAll(list2);   //show the duplicate in the (w.r.t)with respect to list2
//		list.removeAll(list2);   // remove all the duplicates in the (w.r.t)with respect to list2
//		System.out.print(list);

		
//		ArrayList<Integer> list =new ArrayList<Integer>();
//		list.add(10);
//		list.add(20);
//		list.add(30);
//		list.add(10);
//		list.add(5);
//		System.out.print(list.get(3));
		
//		Stack<Object> s =new Stack<Object>();
//		s.push(10);//3
//		s.push(40);//2
//		s.push("A");//1
//		System.out.println(s.search(10));  //Search the position of 10(number)
//		System.out.println("A");             // 10 position is --3
//		System.out.println(40);	
		
//		LinkedList<Object> list =new LinkedList<Object>();
//		list.add("hi");
//		list.add("hello");
//		list.add("bye");
//		list.add("A");
//		list.add(10);
//		System.out.println(list);
		
//		LinkedList<Object> list =new LinkedList<Object>();
//		list.add("hi");
//		list.add("hello");
//		list.add("bye");
//		list.add("A");
//		list.add(10);
//		list.add(10);
//		list.add(null);
//		list.addFirst("Chetan");
//		list.addLast("Mahale");
//		//System.out.println(list);
//		System.out.println(list.getFirst());
//		System.out.println(list.getLast());
		
//		PriorityQueue<Object> queue =new PriorityQueue<Object>();
//        queue.add('a');
//        queue.add('b');
//        queue.add('c');
//        queue.add('d');
//        System.out.println(queue.peek());
//        System.out.println(queue);
//        System.out.println(queue.poll());
//        System.out.println(queue);
		
//        HashSet<Object> set =new HashSet<Object>();
//        set.add(10);
//        set.add(10);
//        set.add('A');
//        set.add(20);
//        set.add("Hi");
//        set.add(null);   //we can add only one null as a value 
//        set.add(null);    //Output--> [null, A, Hi, 20, 10]
//        set.remove('A');
//        Iterator<Object> it= set.iterator();
//        while(it.hasNext())
//        {
//        	System.out.println(it.next());	
//        }
//        //System.out.println(set);
		
//		LinkedHashSet<Object> set =new LinkedHashSet<Object>();
//        set.add(10);
//        set.add(10);
//        set.add('A');
//        set.add(20);
//        set.add("Hi");
//        set.add(null);   //we can add only one null as a value 
//        set.add(null);    
//        Iterator<Object> it= set.iterator();
//        while(it.hasNext())
//        {
//        	System.out.println(it.next());	
//        }
//        //System.out.println(set);
        
//        SortedSet<String> set =new TreeSet<String>();
//        set.add("abcdef");
//        set.add("bjnknh");
//        set.add("hbvgvv");
//        set.add("ctctvj");
//        System.out.println(set);
        
//		  TreeSet<Integer> set =new TreeSet<Integer>();
//        set.add(6);
//        set.add(3);
//        set.add(7);
//        set.add(2);
//        System.out.println(set);
		
//		 Hashtable<Integer, String> map =new Hashtable<Integer, String>();
//         map.put(104, "10");
//         map.put(102, "hello");
//         map.put(101, "bye");
//         map.put(101, "bye"); //not allowed
//         map.put(null, "hi");  //exception
//         map.put(103, null);  //exception
//         System.out.println(map);
		
//		 HashMap<Integer, String> map =new HashMap<Integer, String>();
//         map.put(104, "10");
//         map.put(102, "hello");
//         map.put(101, "bye");
//         map.put(101, "bye"); //not allowed
//        // map.put(null, "hi");  //exception
//        // map.put(103, null);  //exception
//         System.out.println(map);
		
		 HashMap<Integer, String> map =new HashMap<Integer, String>();
         map.put(104, "10");
         map.put(102, "hello");
         map.put(101, "bye");
         map.put(101, "bye"); //not allowed
         map.put(null, "hi");
         map.put(103, null);
         map.put(105, null);
         map.put(null, "hello");
         System.out.println(map);
		
		  
	}

}
