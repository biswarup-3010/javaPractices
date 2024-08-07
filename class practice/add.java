import java.util.*;
public class add{
    public static int Add(int a, int b){
        return a+b;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=Add(a,b);
        System.out.println(c);
    }
}