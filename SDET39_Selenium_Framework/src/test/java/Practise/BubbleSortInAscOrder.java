package Practise;

public class BubbleSortInAscOrder {

	public static void main(String[] args) {
		int[] a= {4,1,2,3,0};
		for(int i=0;i<a.length;i++)
		{
			System.out.println("a[i] ="+a[i]);
			for(int j=0; j<a.length;j++)
			{
				System.out.println("a[j] ="+a[j]);
		        if(a[i]<a[j])
		        {
				    System.out.println("a[i] ="+a[i]);
					System.out.println("a[j] ="+a[j]);
		    	    int temp=a[i];
		    	    System.out.println("temp ="+temp);
		    	    a[i]=a[j];
		    	    System.out.println("a[i] ="+a[i]);
					System.out.println("a[j] ="+a[j]);
		    	    a[j]=temp;
		    	    System.out.println("a[j] ="+a[j]);  
		        }}}
		    for(int k=0;k<a.length;k++)
		    {
		    	System.out.println(a[k]);
		    }

	}

}
