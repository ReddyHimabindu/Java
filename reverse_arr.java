//package Arrays;
import java.util.*;

public class reverse_arr {
    public static void reverseString(int arr[],int n){
        int start=0;int last=n-1;
        while(start<last){
            int temp=arr[start];
            arr[start]=arr[last];
            arr[last]=temp;

            start++;
            last--;
        }

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[100];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        reverseString(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
