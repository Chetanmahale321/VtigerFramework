package Practise;

public class SumOfDigitsInString {

	public static void main(String[] args) {
		String s="12ab14"; //O/P =8
		int sum=0; //0
		int tsum=0;//0 1 12 0 1 13
		for(int i=0;i<s.length();i++)
			//i=0   0<6= 1
			//i=1   1<6= 2
		    //i=2   2<6= a
			//i=3   3<6= b
			//i=4   4<6= 1
			//i=5   5<6= 3
			//i=6   6<6 = terminate
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				int n=s.charAt(i)-48;
				sum=sum+n;
			}
		}
       
        System.out.println(sum);

	}

}
