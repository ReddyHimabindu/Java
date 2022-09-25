//package Arrays;
import java.util.*;
public class Larg_ang_small {
    public static void findout(int arr[],int n){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        System.out.println("largest "+largest);
        System.out.println("samllest "+smallest);

        
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[100];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        findout(arr,n);
        
    }
}
