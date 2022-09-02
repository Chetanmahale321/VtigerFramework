package StringPractise;

import java.util.LinkedHashSet;

public class HowManyTimesCharsIsRepeating {

	public static void main(String[] args) {  // t=2
	   String s="tester";                     // e=2
                                              // s=1
                                              // r=1
		 LinkedHashSet<Character> set = new LinkedHashSet<Character>();
	       for(int i=0;i<s.length();i++)
	       {
	    	  // System.out.println(s.charAt(i)+"="+(i+1));
	    	   set.add(s.charAt(i));
	    	  // System.out.println(set);
	       }
	       for(Character ch : set)
	       {  
	    	  int count=0;
	    	  for(int i=0;i<s.length();i++)
	    	  {
	    	      if(ch==s.charAt(i))
	    	  {
	    		  count++;
	    	  }
	       } System.out.println(ch+"="+count);
	}
  }
}
