//package Assignments.2D array;

public class no_of_7 {
    public static void count_of_7(int arr[][]){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==7){
                    count++;
                }
            }       
         }
         System.out.println(count);
    }
    public static void main(String arg[]){
        int arr[][]={ {4,7,8},{8,8,7} };
        count_of_7(arr);

    }
    
}
