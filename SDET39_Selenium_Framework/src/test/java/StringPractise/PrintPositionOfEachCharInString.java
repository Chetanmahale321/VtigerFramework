package StringPractise;

import java.util.LinkedHashSet;

public class PrintPositionOfEachCharInString {

	public static void main(String[] args) {
		String s="tester";
        // t=2
        // e=2
        // s=1
        // r=1 
		 LinkedHashSet<Character> set = new LinkedHashSet<Character>();
	       for(int i=0;i<s.length();i++)
	       {
	    	  // System.out.print(s.charAt(i));
	    	   set.add(s.charAt(i));	    	
	       }
	       for(Character ch : set) 
	       {  
	    	  for(int i=0;i<s.length();i++)

	    	  {
	    	      if(ch==s.charAt(i))
	    	  {
	    	    	  System.out.println(ch+"="+(i+1));
	    	    	  break;
	    	  }
	       }
	    	 
	}
  }

	}


