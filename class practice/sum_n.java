import java.util.*;
public class sum_n{
    static int res(int n){
        if(n==0) return 0;
        return n+res(n-1);
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(res(n));
    }
}