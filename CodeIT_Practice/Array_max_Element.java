package CodeIT_Practice;
import java.util.Scanner;


//Making Class..
public class Array_max_Element {

    //Main Method of a class...
    public static void main(String[] args) {

        //Scanner for taking Input from User.....
        Scanner sc=new Scanner(System.in);

        //Print String ...
        System.out.println("Enter the Size of Array:-");
        //initialize interger variable and Store in memeory..
        int n=sc.nextInt();

        //initialize int array and size n...
        int arr[]=new int[n];

        //loop for taking array elements as user..
        for (int i=0;i<arr.length;i++){
            //i is array index position  and loop started from 0 to n in ASC Order...
            arr[i]=sc.nextInt();
        }


       //Initialize max variable to compare arr[i] and then if arr[i] is GRT than max =arr[i]
        int max=0;
        for (int i=0;i<arr.length;i++){
           if(arr[i]>max){
               max=arr[i];

           }

        }

        //print max value........
        System.out.print("Max ELements Of an Arrays:-"+max);

    }
}
