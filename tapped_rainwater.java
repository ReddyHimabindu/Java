import java.util.*;

public class tapped_rainwater {
    public static void water_volume(int arr[], int n){
        int left_max[]=new int[n];
        int right_max[]=new int[n];


        // left max 
        left_max[0]=arr[0];
        for(int i=1;i<n;i++){
            left_max[i]=Math.max(arr[i],left_max[i-1]);
        }
        right_max[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            right_max[i]=Math.max(arr[i],right_max[i+1]);
        }

        int trapped_water=0;
        int water_level=0;
        for(int i=0;i<n;i++){
            water_level= Math.min(left_max[i],right_max[i]);
            trapped_water+= (water_level-arr[i])*1;
        }
        System.out.println(trapped_water);

        /*for(int i=0;i<n;i++){
            System.out.println(right_max[i]);
        }*/
    } 
    public static void main(String args[]){
        int arr[]={4,2,0,6,3,2,5};
        int n=arr.length;
        water_volume(arr,n);
        
    }
    
}
