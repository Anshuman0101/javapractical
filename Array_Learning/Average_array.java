package Array_learning;

import java.util.Scanner;

public class Average_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Average_array obj=new Average_array();
		obj.average();
	}

	int i,j,size,sum=0;
	 float average;
public int[] accept_array()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size :-");
	size=sc.nextInt();
	int[] a=new int[size];
	System.out.println("Enter "+size+" numbers");
	
	for(i=0;i<size;i++)
	{
		a[i]=sc.nextInt();
	}
	System.out.println("\n The numbers are :-");
	for(i=0;i<size;i++)
	{
		System.out.print(a[i]+"\t");
	}
	return a;		
}
public void average()
{
	int a[]=accept_array();
	 int i=0;
     while(i < a.length) {
         sum += a[i];
         i++;
     }
      average = (sum / a.length); 
     System.out.println("\n Average : "+average);
 }
}
