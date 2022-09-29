package Practise;

public class FirstMaxNoInArrayUsingBubbleSort {

	public static void main(String[] args) {
		int[] a= {0,1,2,3,4};
		for(int i=0;i<a.length;i++)//Fetching elements from array one by one
			//i=0 0<5t
			//i=1 1<5t
		{
			for(int j=0;j<a.length;j++)
			{
		        if(a[i]>a[j])//4>1t 1>2t 1>3t 1>0t,  (<)-->ascending, (>)-->Descending
		        {				  
		    	    int temp=a[i];//4=4 1=1
		    	    a[i]=a[j];//1=1 0=0
		    	    a[j]=temp;//4=4 1=1   	   
		        }
			  }
		    }
		   //System.out.println(a[0]); //first minimum we do program in ascending order and then give only a[0]
		    System.out.println(a.length-1); // maximum number
		    System.out.println(a[1]);   
		    System.out.println(a[2]); // 3nd maximum number
		
		    }

	}


