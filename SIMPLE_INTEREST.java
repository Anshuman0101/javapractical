//Q. Write a program to accept principal amount,  rat of interest,  no of years from user and calculat rat of interest...

import java.util.*;
public class Simple_Inter
{
	public static void main(String[] args) {
	    float Prin_amount,Rate_ofInter,Time_Durati, SI;// Taking Variable
	
	    Scanner sc=new Scanner(System.in);
	    
		System.out.println("Enter Your Principal Amount:-");
		Prin_amount=sc.nextFloat();
		System.out.println("Enter Your Rate of Interest:-");
		Rate_ofInter=sc.nextFloat();
		System.out.println("Enter Your Time Duration:-");
		Time_Durati=sc.nextFloat();
    SI=Prin_amount*Rate_ofInter*Time_Durati/100;
    	System.out.println("Your SI:-"+SI);
    
		
	}
}