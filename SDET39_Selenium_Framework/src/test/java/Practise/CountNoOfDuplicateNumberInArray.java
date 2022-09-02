package Practise;

import java.util.LinkedHashSet;

public class CountNoOfDuplicateNumberInArray {

	public static void main(String[] args) {
		int[] a={4,1,1,3,5,6,7,6};
	    int length =a.length;
        
        LinkedHashSet<Integer> set= new LinkedHashSet<Integer>();
        for(int i=0;i<length;i++)
        {
        	set.add(a[i]);
        }
        for(Integer inti : set)
        {
        int count=0;
        for(int i=0;i<length;i++)
        {
        	if(inti.equals(a[i]))
        	{
        		count++;
        	}
        }
        if(count>1)
        {
        	System.out.println(inti+"="+count);
        }
      }
        
	}

}
