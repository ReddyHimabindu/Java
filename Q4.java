package Assignments.arrays;

public class Q4 {
    public static void trappedwater(int height[]){
        int n=height.length;
        int left[]=new int[n];
        int right[]=new int[n];

        for(int i=0;i<n;i++){
            if(i==0){
                left[i]=height[i];
            }
            else{
                left[i]=Math.max(height[i],left[i-1]);
            }
        }
        right[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            right[i]=Math.max(height[i],right[i+1]);
        }
        int trapped_water=0;
        for(int i=0;i<n;i++){
            int waterlevel=Math.min(left[i], right[i]);
            trapped_water+=waterlevel-height[i];
        }
        System.out.println(trapped_water);

    }
    public static void main(String arg[]){
        int height[]={4, 2, 0, 3, 2, 5};
        trappedwater(height);
    }
    
}
