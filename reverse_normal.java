package patterns;
import java.util.*;
public class reverse_normal {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=1;i<=n;i++) //number of line
        {
            for(int j=n;j>=i;j--) //number of stars
            {
                System.out.print("*"); //element to be printed (*)
                
            }
            System.out.println();
        }
    }
    
}
