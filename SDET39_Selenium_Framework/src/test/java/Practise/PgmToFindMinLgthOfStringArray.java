package Practise;

public class PgmToFindMinLgthOfStringArray {

	public static void main(String[] args) {
		String[] s= {"ab","abc","abcd","abcdef","abcd"};
		String minLength=s[0];
		for(int i=1;i<s.length;i++)
		{
			if(minLength.length()>s[i].length())
			{
				minLength=s[i];
			}
		}
	    for(int i=0;i<s.length;i++)
	    {
	    	if(minLength.length()==s[i].length())
	    	{
	    		System.out.println(s[i]);
	    	}
	    }		   
	}
}
