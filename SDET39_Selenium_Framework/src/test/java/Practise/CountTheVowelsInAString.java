package Practise;

public class CountTheVowelsInAString {

	public static void main(String[] args) {
		String s="india";  //o/p == Vowels are 3
		int count=0;
		
		System.out.println(s);
		//char[] s =s1.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			//System.out.println(s[i]);
			//if(s[i]=='a' || s[i]=='e' ||s[i]=='i' || s[i]=='o' || s[i]=='u')
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
			{
				count++;
			}
		}
		System.out.println("vowels are= "+count);

	}

}
