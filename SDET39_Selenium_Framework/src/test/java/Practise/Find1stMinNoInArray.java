package Practise;

public class Find1stMinNoInArray {

	public static void main(String[] args) {
        int[] a= {20,10,5,0};
        int min=a[0];
        for(int i=1;i<a.length;i++)
        	 //for(int i=0;i<a.length;i++)
        {
        	if(min>a[i]);
        	{
        		min=a[i];
        	}        	
        }
        System.out.println("First min no in Array is="+min);
	}

}
