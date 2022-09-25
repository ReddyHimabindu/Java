//package Arrays;
import java.util.*;

//import javax.sql.rowset.spi.SyncResolver;
public class linear_search {
    public static int lSearch(int arr[],int key, int n){
        for(int i=0;i<n;i++){
            if(key==arr[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int key=sc.nextInt();
        int arr[]=new int[100];
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int index=lSearch(arr,key,n);
        if(index ==-1)
        {
            System.out.println("not found");
        }
        else
        {
            System.out.println("found  "+(index+1));
        }


    }
    
}
