package Practise;

public class BubbleSortAscAndDescOrder {

	public static void main(String[] args) {
		int[] a= {3,4,2,0,1};
		for(int i=0;i<a.length;i++){//Fetching elements from array one by one
			//i=0 0<5t
			//i=1 1<5t
			for(int j=i+1; j<a.length;j++)
			{
		        if(a[i]>a[j])//4>1t 1>2t 1>3t 1>0t,  (<)-->ascending, (>)-->Descending
		        {				  
		    	    int temp=a[i];//4=4 1=1
		    	    a[i]=a[j];//1=1 0=0
		    	    a[j]=temp;//4=4 1=1   	   
		        }}}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);  //Ascending Order
		}
		System.out.println();
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);  //Descending Order
		}
	}

}
	
