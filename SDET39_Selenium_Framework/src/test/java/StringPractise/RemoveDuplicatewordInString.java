package StringPractise;

import java.util.LinkedHashSet;

public class RemoveDuplicatewordInString {

	public static void main(String[] args) 
	{
		String s="welcome to to pune city";
        String[] str =s.split(" ");
        LinkedHashSet<String> set = new LinkedHashSet<String>();
        for(int i=0;i<str.length;i++)
        {
        	set.add(str[i]);
        }
        System.out.println(set);
	}

}
