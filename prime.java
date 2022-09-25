package basic;
import java.util.*;

public class prime {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int div=2;
        while(div<a)
        {
            if(a%div==0)
            {
                System.out.print("not a prine\n");
                break;
            }
            else{
                div++;
            }
            //System.out.println("prime");

        }
        if(div==a)
        {System.out.println("prime\n");}
        
        
    }
    
}
