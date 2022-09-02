package StringPractise;

public class SpliteStrings {

	public static void main(String[] args) {
		String str=" welcome to pune city";
        String[] s =str.split(" ");
        for(int i=0;i<s.length;i++)
        {
        	String strn= s[i];
        	for(int j=strn.length()-1;j>=0;j--)
        	{
        		System.out.print(strn.charAt(j));
        	}
        	System.out.print(" ");
        }
	
//        String str=" welcome to pune city";
//        String[] s =str.split(" ");
//        for(int i=s.length-1;i>=0;i--)
//        {
//        	System.out.print(s[i]+" ");
//        }
	}

}
