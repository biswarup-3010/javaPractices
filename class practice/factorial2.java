import java.util.*;
public class factorial2{
    // private static int fact(int n){
    //     if(n<=1) return 1;
    //     return n*fact(n-1);
    // }
    private static void take_in_output_array(int n){
       int [] arr=new int[10];
        Scanner sc= new Scanner(System.in);
        for( int i=0;i<n;i++) arr[i]=sc.nextInt();
        for(int i=0;i<n;i++) System.out.print(arr[i]+" ");
    }
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int n=sc.nextInt();
        take_in_output_array(n);
    }
}