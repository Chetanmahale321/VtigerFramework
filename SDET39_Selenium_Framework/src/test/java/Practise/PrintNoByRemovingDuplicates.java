package Practise;
import java.util.LinkedHashSet;

public class PrintNoByRemovingDuplicates {

	public static void main(String[] args) 
	{
        int[] a={4,1,1,3,5,6,7,6};
	    int length =a.length;
        
        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
        for(int i=0;i<length;i++)
        {
        	set.add(a[i]);
        }
        System.out.println(set);   
       
	}

}
