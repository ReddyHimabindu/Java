//package Arrays;
import java.util.*;

public class subarray {
    public static void subarr(int arr[], int n){
        int tsub=0;
        for(int start=0;start<n;start++){           /// to find the staring element
            for(int end=start;end<n;end++){         // to find the ending element
                for(int k=start;k<=end;k++){        // to print all the elements between start and end [subarray]
                    System.out.print(arr[k]+" ");
                }
                tsub++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println(tsub);


    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int arr[]=new int[100];
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        subarr(arr,n);

    }
    
}
