//package Assignments.2D array;

public class second_row_sum {
    public static void rowsum(int arr[][]){
        int sum=0;
       for(int j=0;j<arr[0].length;j++){
                sum+=arr[1][j];
                //System.out.println(sum);
        }
        System.out.println(sum);

    }
    public static void main(String arg[]){
        int arr[][]= {{1,4,9},{11,4,3},{2,2,3} };
        rowsum(arr);
    }
    
}
