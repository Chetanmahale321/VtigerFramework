package StringPractise;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicateInString {

	public static void main(String[] args) {
		
       String s="tester";
       //HashSet<Character> set = new HashSet<Character>(); //not maintain order of execution
       LinkedHashSet<Character> set = new LinkedHashSet<Character>();
       for(int i=0;i<s.length();i++)
       {
    	  // System.out.print(s.charAt(i));
    	   set.add(s.charAt(i));
    	   //System.out.println(set);
       }
       System.out.println(set);
	}

}
