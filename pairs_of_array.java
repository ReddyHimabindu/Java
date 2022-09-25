//package Arrays;
import java.util.*;

public class pairs_of_array {
    public static void Pair(int arr[],int n){
        int tp=0;
        for(int i=0;i<n;i++){
            int curr=arr[i];
            for(int j=i+1;j<n;j++){
                System.out.print("("+curr+","+arr[j]+")");
                if((arr[i]+arr[j])%60==0){
                    
                }
                tp++;               ///// tp=(n*(n-1))/2
            }
            System.out.println();
        }
        System.out.println(tp);
    }
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[100];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Pair(arr,n);
    }
    
}
