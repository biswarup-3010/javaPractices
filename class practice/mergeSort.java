import java.util.*;
public class mergeSort{
    private static void Merge(int arr[],int start,int mid,int end){
        int n1=start+mid+1;
        int n2=end-mid;
        int arr1[]=new int[n1];
        int arr2[]=new int[n2];
        for(int i=0;i<n1;i++) arr1[i]=arr[i];
        for(int i=0;i<n2;i++) arr1[i]=arr[i+n1];
        int i=start,j=mid,k=start;
        while(i<n1&&j<n2){ if(arr1[i]<arr2[j]) arr[k++]=arr[i++]; else arr[k++]=arr[j++]; }
        while(i<n1)arr[k++]=arr[i++];
        while(j<n2)arr[k++]=arr[j++];
    }
    private static void Msort(int arr[],int start,int end){
        if(start<=end){
            int mid=(start+end)/2;
            Msort(arr,start,mid-1);
            Msort(arr,mid+1,end);
            Merge(arr,start,mid,end);
        }
    }
    public static void main(String [] args){
        // Scanner sc=new Scanner(System.in);
        // System.out.print("Enter no of elements : ");
        // int n=sc.nextInt();
        // int []arr=new int[n];
        // System.out.print("\nEnter the elements : ");
        // for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int arr[]={1,5,3,4,23};
        int n=5;
        System.out.print("\nBefore sort : ");
        for(int i=0;i<n;i++) System.out.print(arr[i]+" ");
        Msort(arr,0,n-1);
        System.out.print("\nAfter sort : ");
        for(int i=0;i<n;i++) System.out.print(arr[i]+" ");
    }
}