import java.util.*;
public class LinearSearch{
    public static int LinearSearch(int arr[],int x){
        for(int i=0;i<arr.length;i++){
            if(x==arr[i]){
                System.out.print(i+" ");
            }
        }
        return 0;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int arr []=new int[20];
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        LinearSearch(arr,x);
    }
}