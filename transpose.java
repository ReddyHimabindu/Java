//package Assignments.2D array;

public class transpose {
    public static void arr_transpose(int arr[][]){
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[0].length;j++){
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        // System.out.println();
        int row= arr.length;int col=arr[0].length;
        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int arr[][]={{1,2,3},{4,5,6} };                                          \
        arr_transpose(arr);

    }
}

    

