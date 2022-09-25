import java.util.Collection;
import java.util.Collections;
import java.util.Arrays;

public class basic_sorting {
    public static void bubble_sort(int arr[]){
        for(int i=0; i<arr.length-1;i++){         ///find the number of terms 
            for(int j=0;j<arr.length-1-i;j++){      // do the number of comparisons
                if(arr[j]>arr[j+1]){
                    int temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void print_array(int arr[]){      
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void selection_sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minpos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minpos]>arr[j]){
                    minpos=j;
                }
            }
            int temp= arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;

        }


    }
    public static void insertion_sort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            while(prev >=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
        
    }
    public static void counting_sort(int arr[]){
        int largest=Integer.MIN_VALUE;
        int n=arr.length;
        // this loop is used to find out the largest number in the arr so that we can form a count array of that length
        for(int i=0;i<n;i++){
            largest=Math.max(arr[i],largest);
        }
        // after fnding the largest element
        // now we will create an array called count in which the index numbers will be same as the numbers in the array
        // and in each index we will count the freaquency of the current index number  
        int count[]=new int[largest+1];
        for(int i=0;i<n;i++){
            count[arr[i]]++;
        }
        // this function is used to sort the numbers/ frequency present in the count array
        
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }

    }
    
    public static void main(String args[]){
        int arr[]={4,2,5,1,3};
        //bubble_sort(arr);
        //selection_sort(arr);
        //insertion_sort(arr);
        counting_sort(arr);
       
        //Arrays.sort(arr);
       // Arrays.sort(arr, Collections.reverseOrder());
    print_array(arr);
       // for(int i=0;i<arr.length;i++){
            //System.out.print(arr[i]+" ");
        //}
        
    }    
}
