//package Arrays;
import java.util.*;

public class binary_search {
    public static void binarysearch(int arr[],int n,int k){
        int start=0;
        int end= n-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==k){
                System.out.println("Found value "+ k +" at position "+mid);
            }
            else if (arr[mid]>k){ //check in left side of the mis
                end=mid-1;
            }
            else if(arr[mid]<k){   ///check in right side of the mid point
                start=mid+1;
            }
            else{
                System.out.println("not found");
            }
        }
    } 
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int key=sc.nextInt();
        int arr[]=new int[20];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        binarysearch(arr,n,key);


    }
    
}
