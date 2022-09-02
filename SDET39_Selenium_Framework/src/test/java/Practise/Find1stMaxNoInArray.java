package Practise;

public class Find1stMaxNoInArray {

	public static void main(String[] args) {
		    int[] a= {20,10,5,0};
	        int max=a[0]; //20
	        for(int i=1;i<a.length;i++)
	        	// for(int i=0;i<a.length;i++)
	        	//i<1 1<4t
	        {
	        	if(max>a[i])
	        	{
	        		max=a[i];
	        	}        	
	        }
	        System.out.println("First max no in Array is="+max);
	}

}
