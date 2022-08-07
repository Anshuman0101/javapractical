/*Write a Java program using Synchronized Threads, which demonstrates Producer Consumer concept.
Producer Consumer problem:
The producer-consumer problem is the classical concurrency of a multi process synchronization problem. 
It is also known as bound-buffer problem.
The problem describes two processes, the producer and the consumer, who share a common, fixed-size buffer used as a queue. 
The producer generates a piece of data, put it into the buffer and starts again.
*/package Thursday_Assigment;

import java.util.Scanner;
//producer class extend by thread
public class Producer_pro2 extends Thread
{
	Problem_pro2 Shop;
     int number, i, n=10;
     // globally declared the value
    public Producer_pro2(Problem_pro2 c, int number)
    // parametrized constructor of consumer class
    {
          Shop = c;
          this.number = number;
    }
    public void run()
    // creating run method
    {
    	 for ( i = 0; i < n; i++)
    		 //for loop execute for printing the value of i
          {
                Shop.put(i);
                // put the value of i 
                System.out.println("Produced value  put: " + i);// printing the value of i for producer
                try
                // try catch method for using sleep thread
                {
                	 Thread.sleep(1000);
                	 // sleep thread for 1milisec
                }
                catch (InterruptedException ie)
                {
                      ie.printStackTrace();
                }
          }
    }
}
