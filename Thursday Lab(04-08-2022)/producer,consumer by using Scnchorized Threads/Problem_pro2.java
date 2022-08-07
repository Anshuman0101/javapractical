
/*Write a Java program using Synchronized Threads, which demonstrates Producer Consumer concept.
Producer Consumer problem:
The producer-consumer problem is the classical concurrency of a multi process synchronization problem. 
It is also known as bound-buffer problem.
The problem describes two processes, the producer and the consumer, who share a common, fixed-size buffer used as a queue. 
The producer generates a piece of data, put it into the buffer and starts again.
*/package Thursday_Assigment;

public class Problem_pro2 {
	 int materials;
	 // globally declared
	   boolean available = false;
	      public synchronized int get()
	      // synchronized method to get boolean value
	      {
	            while (available == false)
	            	// check the condition for false of available
	            {
	                  try
	                  {
	                        wait(); 
	                        // if condition is false than it will wait for some time
	                  }
	                  catch (InterruptedException ie)
	                  {
	                  }
	            }
	            available = false;
	            notifyAll();
	            return materials;
	            // return the value of materials
	      }
	      public synchronized void put(int value)
	      {
	            while (available == true)
	            	// check the condition for true of available
	            {
	                  try
	                  {
	                        wait();
	                        // if condition is true than it will wait for some time
	                  }
	                  catch (InterruptedException ie)
	                  {
	                        ie.printStackTrace();
	                  }
	            }
	            materials = value; 
	            // material should be equal to value
	            available = true;
	            notifyAll();
	      }
	}