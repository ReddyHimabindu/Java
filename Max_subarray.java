//*******************************************good time complexcity******************************/

//package subarray sum;
import java.util.*;

public class Max_subarray {

                // Brute force approch  O(n^3)

    public static void subarr(int arr[], int n){        
        int tsub=0;
        int sum=0;
        int MAX=Integer.MIN_VALUE;
        int MIN=Integer.MAX_VALUE;
        for(int start=0;start<n;start++){           /// to find the staring element
            for(int end=start;end<n;end++){         // to find the ending element
                for(int k=start;k<=end;k++){        // to print all the elements between start and end [subarray]
                    sum+=arr[k]; 
                }
                if(sum>MAX){
                    MAX=sum;
                }
                if(sum<MIN){
                    MIN=sum;
                }
                sum=0;
                tsub++;
            }
            
        }
        System.out.println("Total number of subarray "+tsub);
        System.out.println("largest sum of the subarray "+MAX);
        System.out.println("Smallest sum of the subarray "+MIN);
    }


                    // prefix array approch  O(n^2)


    public static void prefix_sum(int arr[],int n){     
        int prefix[]=new int[100];
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int sum=0;

        for(int i=0;i<n;i++){
            if (i==0){
                prefix[i]=arr[i];
            }
            else{
                prefix[i]=prefix[i-1]+arr[i];
            }
        }
        System.out.print("prefix array: ");
        for(int i=0;i<n;i++){
            System.out.print(prefix[i]+" ");
        }
        System.out.println();
        
        for(int i=0;i<n;i++){
            int start=i;
            for(int j=i;j<n;j++){
                int end=j;
                sum = start==0? prefix[start] : prefix[end]-prefix[start-1];
            if(sum > max){
                max = sum;
            }
            if(sum < min){
                min= sum;
            }
        }
    }
        System.out.println("max sum is : "+ max);
        System.out.println("min sum is : "+ min);
    }

    

            // kadane's approch O(n)

    public static void kadane(int arr[],int n){
        int ms=Integer.MIN_VALUE;
        int mins=Integer.MAX_VALUE;
        int cs=0;
        for(int i=0;i<n;i++){
            cs+=arr[i];
            
            if(cs<mins){
                mins=cs;
            }
            if(cs<0){
                cs=0;
            }
            System.out.println(mins);
            ms=Math.max(cs, ms);
            
        }
        if(ms==0){
            System.out.println("the max sum is "+ mins);

        }
        else{
            System.out.println("the max sum of subarray is: "+ ms);
        }
        

    }


    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[300];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //subarr(arr,n);
        prefix_sum(arr,n);
        //kadane(arr, n);
    }
    
}
