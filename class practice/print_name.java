import java.util.*;
public class print_name{
    public static void print_nam(String a){
        System.out.println(a);
        return ;
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name :");
        String s=sc.nextLine();
        print_nam(s);
    }
}