import java.util.*;
public class multiply{
    public static int multiply_two_numbers(int a, int b){
        return a*b;
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st number :");
        int a=sc.nextInt();
        System.out.print("Enter the 2nd number :");
        int b=sc.nextInt();
        System.out.println("Multiplication of the two numbers ="+multiply_two_numbers(a,b));
    }
}