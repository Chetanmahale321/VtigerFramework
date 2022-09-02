package StringPractise;

import java.util.LinkedHashSet;

public class CountNoOfDuplicateInString {

	public static void main(String[] args) {
		String s="tester";
		LinkedHashSet<Character> obj = new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			obj.add(s.charAt(i));
		}		
		for(Character ch: obj)   // t e s r  (1 by 1) for each 
		{
			int count=0;
			for(int i=0;i<s.length();i++)  // tester
			{
				if(ch==s.charAt(i))
				{
					count++;
				}
			}
			if(count>1)     // it will count the duplicate    
			{
				System.out.println(ch+" "+count);
			}
		}
	}

}
