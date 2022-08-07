package Array_learning;

import java.util.Scanner;

public class function_array1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
accept();

	}
	public static void accept()
	{
		int i=0,j=0,temp, n, min = 0;
		Scanner sc = new Scanner(System.in);
		
		int a[] = new int[10];
		System.out.println("Enter the array number:");
		for( i = 0; i < 10; i++)
		{
		a[i] = sc.nextInt();
		}
		smallest( a , min, i);
		{
		  sc.close();
	        for ( i = 0; i < 10; i++) 
	        {
	            for ( j = i + 1; j < 10; j++) { 
	                if (a[i] > a[j]) 
	                {
	                    temp = a[i];
	                    a[i] = a[j];
	                    a[j] = temp;
	                }
	            }
	        }}
		accending( a);
	        { 
		        for ( i = 0; i < 10; i++) 
		        {
		            for ( j = i + 1; j < 10; j++) { 
		                if (a[i] < a[j]) 
		                {
		                    temp = a[i];
		                    a[i] = a[j];
		                    a[j] = temp;
		                }
		            }
		        }}
	        decending(a);
	}
	public static void smallest( int a[] , int min,int i)
	{
		min = a[0];
		for( i = 0; i < 10; i++)
		{
		if(min > a[i])
		{
			min = a[i];
		}
		}
		System.out.println("\n smallest number in array:"+min);
		}
	public static void accending(int a[])
	{
		 
		System.out.print("\n Array number in Ascending Order: ");
        for (int i = 0; i < 9; i++) 
        {
            System.out.print(a[i] + ", ");
        }
        System.out.print(a[9]);
	}
	public static void decending(int a[])
	{
		System.out.print("\n Array Elements in decending Order: ");
        for (int i = 0; i < 9; i++) 
        {
            System.out.print(a[i] + ", ");
        }
        System.out.print(a[9]);
	}	
	}

