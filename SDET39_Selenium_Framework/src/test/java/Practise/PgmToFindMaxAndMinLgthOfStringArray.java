package Practise;

public class PgmToFindMaxAndMinLgthOfStringArray {

	public static void main(String[] args) {
		String[] s= {"chetan","ram","shyam","avinash","ajay"};
		String maxLength=s[0];
		String minLength=s[0];
		for(int i=1;i<s.length;i++)
		{
			if(maxLength.length()<s[i].length())
			{
				maxLength=s[i];
			}
		}
		for(int i=1;i<s.length;i++)
		{
			if(minLength.length()>s[i].length())
			{
				minLength=s[i];
			}
		}
		for(int i=1;i<s.length;i++)
	    {
	    	if(maxLength.length()==s[i].length())
	    	{
	    		System.out.println("Max length Of string is="+s[i]);
	    	}
	    } for(int i=0;i<s.length;i++)
	    {
	    	if(minLength.length()==s[i].length())
	    	{
	    		System.out.println("Min length Of string is="+s[i]);
	    	}
	      }		   
	    }
      }
