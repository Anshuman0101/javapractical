package Array_learning;

import java.util.Scanner;

public class GRT_no_array {
	public static void main(String[] args) {
				int i, n, max;
				Scanner sc = new Scanner(System.in);
				
				int a[] = new int[10];
				System.out.println("Enter the number:");
				for( i = 0; i < 10; i++)
				{
				a[i] = sc.nextInt();
				}
				max = a[0];
				for( i = 0; i < 10; i++)
				{
				if(max < a[i])
				{
				max = a[i];
				}
				}
				System.out.println("greatest number :"+max);
				}
	}
