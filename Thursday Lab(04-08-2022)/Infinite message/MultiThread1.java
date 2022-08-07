/*Write a program that creates 2 threads - each displaying a 
  message (Pass the message as a parameter to the constructor).
The threads should display the messages continuously till the
 user presses any key.*/
package Thursday_Assigment;

public class MultiThread1 extends Thread {
	 String msg="my class is running";
	 MultiThread1(String s){
	// Parameterized constructor of class
	msg=s;
	}
	 
public void run() {
//  create new thread class

	while(true) {
// condition is true then it display the message in two thread
 
	System.out.println(Thread.currentThread().getName() + "\t message of thread: \t"+msg);
	// display the message of threads
	
System.out.println(Thread.currentThread().getName() + "\t priority of thread: \t"+(Thread.currentThread().getPriority())); 
//display the priority of threads

try {
	Thread.sleep(300);
	// sleep thread for 5min
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	System.out.println(e.getLocalizedMessage());
}}}
}
