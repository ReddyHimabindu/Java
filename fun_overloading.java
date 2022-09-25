package basic;
public class fun_overloading {
    public static int fun(int a,int b){
        return a+b;
    }
    public static int fun(int a,int b ,int c){
        return a+b+c;
    }
    /*public static void fun(int a,int b){
        int c= a+b;
    }*/
    public static void main(String args[]){
        int a=9;
        int b=9;
        int c=1;
        System.out.println(fun(a,b));
        System.out.println(fun(a,b,c));
        
        
    }
    
}
