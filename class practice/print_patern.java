import java.util.*;
public class print_patern{
    public static void pattern1(int n){
        for( int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j==1||j==n||i==j||j==n-i+1||i==n/2+1){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=11;
        pattern1(n); 
    }
}