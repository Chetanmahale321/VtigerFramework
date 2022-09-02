package Practise;

import java.util.Arrays;

import org.testng.reporters.jq.Main;

public class First3And2nd3MinInArray 
{
	 public static void main(String[] args) { 
	     int[] a= {1,0,1,0,0,1,4,7,6};
	     int length = a.length;
	    
		    for (int i=0; i<length-1; i++) 
		    
		      for (int j=0; j<length-i-1; j++) 

		        if (a[j]>a[j+1])   
		        {
		          int temp=a[j];        
		          a[j]=a[j+1];   
		          a[j+1]=temp;
		        }
		      System.out.println("Sorted Array:");
              System.out.println(Arrays.toString(a));
//		    System.out.println(array[0]);
//		    System.out.println(array[1]);
//		    System.out.println(array[2]);
//		    System.out.println(array[3]);
//		    System.out.println(array[4]);
//		    System.out.println(array[5]);
	   
		  }
	    
      }
    