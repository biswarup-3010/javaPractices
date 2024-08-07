import java.util.*;
import java.lang.Math;
public class Simple_calculator{
    private static void calculator(){
        Scanner sc=new Scanner(System.in);
        int choice,t=1,a,b;
        while(t==1){
            System.out.print("\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Power\n6.Exit\n\nEnter your choice : ");
            choice=sc.nextInt();

            // main logic
            switch(choice){
                case 1 : 
                    a=sc.nextInt();
                    b=sc.nextInt();
                    System.out.println(a+" + "+b+" = "+(a+b));
                    break;
                case 2 : 
                    a=sc.nextInt();
                    b=sc.nextInt();
                    System.out.println(a+" - "+b+" = "+(a-b));
                    break;
                case 3 : 
                    a=sc.nextInt();
                    b=sc.nextInt();
                    System.out.println(a+" x "+b+" = "+(a*b));
                    break;
                case 4 : 
                    a=sc.nextInt();
                    b=sc.nextInt();
                    System.out.println(a+" / "+b+" = "+(a/b));
                    break;
                case 5 : 
                    a=sc.nextInt();
                    b=sc.nextInt();
                    System.out.println(a+" ^ "+b+" = "+Math.pow(a,b));
                    break;
                case 6:
                    System.exit(0);
                default :
                    System.out.println("Wrong choice !!");
            }
        }
    }
    public static void main(String[] args){
        // call for calculator function
        calculator();
    }
}