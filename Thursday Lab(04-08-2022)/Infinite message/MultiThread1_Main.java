/*Write a program that creates 2 threads - each displaying a message 
 * (Pass the message as a parameter to the constructor).
 *The threads should display the messages continuously till the user presses any key.
*/
package Thursday_Assigment;

public class MultiThread1_Main {

	public static void main(String args[])  
	{
		MultiThread1 t1=new MultiThread1("thread1 is running........"); 
		// object of thread 1
		 MultiThread1 t2=new MultiThread1("thread2 is running........"); 
		 // object of thread 2
		System.out.println("thread details");
		t1.start(); 
		//  call run method of thread1  
		t2.start(); 
		// call run method of thread2
	}

}
