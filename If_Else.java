Q1.Write a program to accept a no from user if no is even than find out the cubs..                                                          DATE-10|6|2022

import java.util.*;
public class If_else
{
	public static void main(String[] args) {
	    int num,cube;// Taking Variable
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Number:-");
		num=sc.nextInt();
		//APPLYING IF-ELSE 
    if(num%2==0){
		   cube=num*num*num;
		    System.out.println(cube);
		}
    else{
		    System.out.println("Your Number is Odd\nThank You.....");
		}
		
	}
}