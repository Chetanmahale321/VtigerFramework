package Practise;

import java.util.LinkedHashSet;

public class HowManyTimesNosRepeatingInArray {

	public static void main(String[] args) {
		int[] a={4,1,1,3,5,6,7,6};
	    //int length =a.length;
	    
	  LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
	       for(int i=0;i<a.length;i++)
	       {    	   
	    	   set.add(a[i]);
	       }
	       for(Integer ch : set)
	       {  
	    	  int count=0;
	    	  for(int i=0;i<a.length;i++)
	    	  {
	    	      if(ch==a[i])
	    	  {
	    		  count++;
//	    		  System.out.println(ch+"="+(i+1)); //Print Number Position
//    	    	  break;
	    	  }
	       }
	    	 System.out.println(ch+"="+count);
	    }
	}

}
