package Practise;

public class PgmToFindMaxLgthOfStringArray {

	public static void main(String[] args) {
		String[] s= {"ab","abc","abcd","abcdef","abcd"};
		String maxLength=s[0];
		for(int i=1;i<s.length;i++)
		{
			if(maxLength.length()<s[i].length())
			{
				maxLength=s[i];
			}
		}
	    for(int i=1;i<s.length;i++)
	    {
	    	if(maxLength.length()==s[i].length())
	    	{
	    		System.out.println(s[i]);
	    	}
	    }
		   
	    }

}
