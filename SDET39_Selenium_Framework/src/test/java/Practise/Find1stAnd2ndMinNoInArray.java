package Practise;

public class Find1stAnd2ndMinNoInArray {

	public static void main(String[] args) {
		int[] a= {7,2,8,0,4,5,1};
		int min=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}
		System.out.println("first minimum number is="  +min);
	
		int min2=a[1];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min2 && a[i] >min)
			{
				min2=a[i];
			}
	  	}
		System.out.println("second minimum number is=" +min2);
//		int min3=a[1];
//		for(int i=1;i<a.length;i++)
//		{
//			if(a[i]<min3 && a[i] >min2)
//			{
//				min3=a[i];
//			}
//	  	}
//		System.out.println("Third minimum " +min3);
	}
}



