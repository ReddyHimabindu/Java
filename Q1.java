//package DSA sheet.Arrays;
import java.util.*;
public class Q1 {
    public static void max_or_min(int arr[],int n){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(arr[i],max);
            min=Math.min(arr[i],min);
        }
        System.out.println("max= "+ max+ " min ="+ min);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        max_or_min(arr,n);

    }
    
}
