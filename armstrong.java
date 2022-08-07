package basic_pro;

import java.util.Scanner;
public class armstrong {
	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
 System.out.print("Enter a Number :-");
 int a=sc.nextInt();
 int  num, r, sum = 0;

 num = a;
 while (num != 0)
 {
     r = num % 10;
    
     sum = sum + (r*r*r);
     num /= 10;
 }

 if(sum == a)
     System.out.println(a+ " is an Armstrong number.");
 else
     System.out.println(a + " is not an Armstrong number.");
}


}
