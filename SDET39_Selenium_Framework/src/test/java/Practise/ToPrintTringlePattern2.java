package Practise;

public class ToPrintTringlePattern2 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) ////Increasing Pattern
		{
			for(int j=i;j<=n;j++) //Decreasing Pattern
			{
		     System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			 System.out.println();
		  }  
	    }
      }
	


