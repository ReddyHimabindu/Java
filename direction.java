//package string;
import java.util.*;

public class direction {

    public static int dir(String str)
    {
        int n=str.length();
        int x=0;int y=0;
        for(int i=0;i<n;i++)
        {
            int dir = str.charAt(i);
            if(dir=='S'){
                y--;
            }
            else if(dir=='N'){
                y++;
            }else if (dir=='E'){
                x++;
            }
            else{
                x--;
            }
        }
        float x2 = x*x;
        float y2 = y*y;
        return (int)Math.sqrt(x2 + y2);
    }
    public static void main(String args[]){
        String str="SSESWNN";
        System.out.println(dir(str));

    }
    
}
