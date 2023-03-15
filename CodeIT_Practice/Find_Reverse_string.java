package CodeIT_Practice;

import java.util.Scanner;

// Main class...
public class Find_Reverse_string {

    //Main Method............
    public static void main(String[] args) {

        //Scanner for taking input...
        Scanner sc=new Scanner(System.in);


        System.out.println("Enter the String :-");
       // String initilization...
        String Name=sc.nextLine();

        //using to modify string Value..
        StringBuffer sb=new StringBuffer(Name);


        sb.reverse();
        //Printing Reverse String ...
        System.out.println(sb);

// Manual Approch......
        //making new String var to store reverse string ..
        String  temp="";

        //making loop iteration is started from n-1...
for(int i=Name.length()-1;i>=0;i--){
    temp=temp+Name.charAt(i);
}
        System.out.println("After Reverse:-"+temp);
        System.out.println("Before Reverse:-"+Name);
    }
}
