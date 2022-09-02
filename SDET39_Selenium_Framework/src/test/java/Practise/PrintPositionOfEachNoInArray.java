package Practise;

import java.util.LinkedHashSet;

public class PrintPositionOfEachNoInArray {

	public static void main(String[] args) 
	{  
		int[] a={4,1,1,3,5,6,7,6};
        int length =a.length;
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
	       for(int i=0;i<length;i++)
	       {
	    	  // System.out.print(s.charAt(i));
	    	   set.add(a[i]);
	    	
	       }
	       for(Integer ch : set) 
	       {  
	    	 // int count=0;
	    	  for(int i=0;i<length;i++)	    		 
	    	  {
	    	      if(ch==a[i])
	    	  {
	    	    	  System.out.println(ch+"="+(i+1));
	    	    	  break;
	    	  }
	       }
	     }	 
	   }
	}


