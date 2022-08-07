package basic_pro;

import java.util.Scanner;

public class swapping_number {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
accept();
	}
public static void accept() 
{
	
	Scanner sc=new Scanner(System.in);
	System.out.print("enter two number :-");
	int x=sc.nextInt();
	int y=sc.nextInt();
	swap_without_no( x, y);
	swap_with_no( x, y);
}
public static  void swap_without_no(int x, int y)
{
	System.out.println("before swapping numbers:- "+x +"  "+ y);  
	 x = x - y;
     y = x + y;
     x = y - x;
     System.out.println("After swapping without third number use:- "+x +"   " + y);  
     System.out.println( ); 
}
public static  void swap_with_no(int x, int y)
{
	System.out.println("before swapping numbers:- "+x +"  "+ y); 
	int temp = x;
    x = y;
    y = temp;
    System.out.println("After swapping with third number use:- "+x +"   " + y);  
    System.out.println( );  
}
}
