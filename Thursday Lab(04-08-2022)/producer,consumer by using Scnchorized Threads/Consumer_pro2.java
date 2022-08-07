/*Write a Java program using Synchronized Threads, which demonstrates Producer Consumer concept.
Producer Consumer problem:
The producer-consumer problem is the classical concurrency of a multi process synchronization problem. 
It is also known as bound-buffer problem.
The problem describes two processes, the producer and the consumer, who share a common, fixed-size buffer used as a queue. 
The producer generates a piece of data, put it into the buffer and starts again.
*/
package Thursday_Assigment;

import java.util.Scanner;
//consumer class extend by thread
public class Consumer_pro2 extends Thread
{
	Problem_pro2 Shop;
     int number, value=0,i,n=10;
     // globally declared the value
     Consumer_pro2(Problem_pro2 c, int number)  
     // parametrized constructor of consumer class
     {
           Shop = c;
           this.number = number;
     } 
    public void run()
    // creating run method
    {
          for (i = 0; i < n; i++) 
        	  //for loop execute for printing the value
          {
                value = Shop.get();
                // the value get 
                System.out.println("Consumed got value: " + value); // printing the value of consumer
          try 
          // try catch method for using sleep thread
          {
          	 Thread.sleep(1000);
          	 // sleep thread for 1sec
          }
          catch (InterruptedException ie)
          {
                ie.printStackTrace();
          }}
    }
}
