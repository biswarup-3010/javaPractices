import  java.util.*;
public class QuickSort{
    private static int partition(int arr[],int start, int end){
        int i=start-1;
        int pivot=arr[end];
        for(int j=start;j<end;j++){
            if(arr[j]<pivot){
                i++;
                int t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;
            }
        }
       int t=arr[i+1];
       arr[i+1]=arr[end];
       arr[end]=t;
        return i+1;
    }
    private static void Qsort(int arr[],int start,int end){
        if(start<end){
            int p=partition(arr,start,end);
            Qsort(arr,start,p-1);
            Qsort(arr,p+1,end);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of elements : ");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.print("\nEnter the elements : ");
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        System.out.print("\nBefore sort : ");
        for(int i=0;i<n;i++) System.out.print(arr[i]+" ");
        Qsort(arr,0,n-1);
        System.out.print("\nAfter sort : ");
        for(int i=0;i<n;i++) System.out.print(arr[i]+" ");
    }
}