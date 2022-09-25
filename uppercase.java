public class uppercase {
    public static void capitalize(String str){
        StringBuilder sb=new StringBuilder("");
        char ch=Character.toUpperCase(str.charAt(0)) ;
        sb.append(ch);
        for(int i=1;i<str.length();i++){
            if( str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                char ch2=Character.toUpperCase(str.charAt(i));
                sb.append(ch2);
                     
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb);
    }
     public static void main(String[] args) {
        String str="hey i am bindu";
        capitalize(str);
        
    }
    
}
