package StringPractise;

import java.util.LinkedHashSet;

public class ToPrintOrderOfOccuranceOfEachWord {

	public static void main(String[] args) {
		String s="welcome to to pune city";
//		welcome=1
//	    to=2
//	    pune=4
//	    city=5
        String[] str =s.split(" ");
        LinkedHashSet<String> set = new LinkedHashSet<String>();
        for(int i=0;i<str.length;i++)
        {
        	set.add(str[i]);
        }
        for(String stri : set)
        {
        //int count=0;
        for(int i=0;i<str.length;i++)
        {
        	if(stri.equals(str[i]))
        	{
        		System.out.println(stri+"="+(i+1));
        		break;
        	}
        }       
      }
	}
}
