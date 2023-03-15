package CodeIT_Practice;

import java.util.Scanner;
//main Class...
public class Print_fizzBuzz {

    //main Method...
    public static void main(String[] args) {

        //It is used for User Input ...
        Scanner sc=new Scanner(System.in);


        System.out.println("ENter the Size :-");
        //storing size to print operation...
        int n=sc.nextInt();

        //loop  started from 1 to n.........
        for (int i=1;i<=n;i++){

            //if n%3 and n%5 is equal to zero...
            if(  i%3==0&&i%5==0){
                System.out.println("FIZZBUZZ");

            }

            //if n%3  is equal to zero...
            else if (i%3==0) {
                System.out.println("FIZZ");

            }
            //if  n%5 is equal to zero...
            else if (i%5==0) {
                System.out.println("BUZZ");

            }
            //last condition in which not any option is correct then print Number....
            else {
                System.out.println(i);
            }

        }

    }
}
