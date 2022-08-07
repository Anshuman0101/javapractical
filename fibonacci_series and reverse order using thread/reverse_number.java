package Thursday_Assigment;

public class reverse_number extends  Fabona_series {

	public void run() {
	//run method 
	
	try 
	{
		
	sleep(11000);
	//sleep run method for 5 sec...
	}
	catch(Exception e)
	{
	System.out.println(e);
	}
	System.out.println("Enter the 10 Value here :=");
	//taking a 10 value from user..
	
	for(i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
		//taking value for loop..
	}
	for(i=0;i<arr.length;i++) {
	//chacking the value of i..
	
	for(j=i+1;j<arr.length;j++) {
		//which value is greater
	
		if(arr[i]<arr[j]) {
		//checking GRT value...
	
	 temp=arr[i];
	 //inter-change the value...
	arr[i]=arr[j];
	arr[j]=temp;
		}
	}
}
	//breaking the line...
	for(int i=0;i<arr.length;i++) {
	//print the value in desending order..

	System.out.println(arr[i]+" ");
	}
}}