package Practise;

public class SumOfFirst3MinNoInArray {

	public static void main(String[] args) {
		int[] a= {4,1,2,3,0};
		for(int i=0;i<a.length;i++){//Fetching elements from array one by one
			//i=0 0<5t
			//i=1 1<5t
			for(int j=0;j<a.length;j++)
			{
		        if(a[i]<a[j])      // (<)-->ascending, (>)-->Descending
		        {				  
		    	    int temp=a[i]; //4=4 1=1
		    	    a[i]=a[j];     //1=1 0=0
		    	    a[j]=temp;     //4=4 1=1   	   
		        }
			  }
		    }
	     	int sum=0;
		for(int i=0;i<3;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
	   }
	}


