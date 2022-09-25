//package DSA sheet.Arrays;
import java.util.*;

public class Q3 {
    public static void Max_subarray(int arr[],int n){
        int max=Integer.MIN_VALUE;
        int count=1;
        //  brute force
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                count*=arr[j];
                max=Math.max(max,count);
            }
            count=0;
        }
        System.out.println(max);

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Max_subarray(arr,n);


    }
    
}
