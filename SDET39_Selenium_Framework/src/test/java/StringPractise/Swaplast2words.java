package StringPractise;

public class Swaplast2words {

	public static void main(String[] args) {
		
        String str="Welcome to pune city"; //city to pune Welcome 
                   //0       1  2
        String[] s= str.split(" ");
        //s[0] s[1] s[2] s[s.length]
        String temp=s[0]; //temp=welcome
        s[0]=s[s.length-1];//s[0]=city
        s[s.length-1]=temp;//s[s.length-1]=welcome
        for(int i=0;i<s.length;i++)
        {
        	System.out.print(s[i]+" ");
        }
	}

}
