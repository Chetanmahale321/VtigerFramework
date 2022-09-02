package StringPractise;

import java.util.LinkedHashSet;

public class CountDuplicateWordsInString {

	public static void main(String[] args) {
		String s="welcome to to pune city";
        String[] str =s.split(" ");
        LinkedHashSet<String> set = new LinkedHashSet<String>();
        for(int i=0;i<str.length;i++)
        {
        	set.add(str[i]);
        }
        for(String stri : set)
        {
        int count=0;
        for(int i=0;i<str.length;i++)
        {
        	if(stri.equals(str[i]))
        	{
        		count++;
        	}}
        if(count>1)  //Count Duplicates
        //if(count==1) remove Duplicates
        {
        	System.out.println(stri+"="+count);
        }
      }
	}

}
