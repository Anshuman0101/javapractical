//WAP by using thread ,fibonacci series to display1 to 10 in reverse order..
package Thursday_Assigment;

import java.util.Scanner;

public class Fabona_series extends Thread {
	
int num1,num2,num3,i,j,temp=0;
//Declare variable as Global ...

Scanner sc=new Scanner(System.in);
//it is used for taking input from user...

int arr[]=new int[10];
//taking a array int  as size=10 ...

public void run() {
	// method name run ...
	
	//Taking two int value from user...
	System.out.println("Enter two value for fibonacci Series :-");
	num1=sc.nextInt();
	num2=sc.nextInt();
	System.out.println("Starting value for user input for fibonacci "+num1+"\n End Value is :-"+num2);

	for(int i=2;i<10;i++) {
	//loop run in 10 time ..as per given..
   
		num3=num1+num2;
   //add start and last value in num3....

		try {
	    sleep(1100);
	    //sleep the thread for 1 sec...
		}
		catch(Exception e) {
	System.out.println(e);
}
System.out.println(" "+num3);
//interchange value..
num1=num2;
num2=num3;
}
}}
