//package DSA sheet.Arrays;
import java.util.*;

public class Q2 
{
    public static void reverse_arr(int arr[],int n)
    {
        int start=0;
        int end=n-1;
        while(start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }

    }
    public static void print_array(int arr[])
    {

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        reverse_arr(arr,n);
        print_array(arr);

    }
}
    

