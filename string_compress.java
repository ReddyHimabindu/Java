public class string_compress {
    public static StringBuilder comp_string(String com){
        StringBuilder sb=new StringBuilder(" ");
        
        for(int i=0;i<com.length();i++){
            Integer count=1;
            while(com.charAt(i)==com.charAt(i+1) && i<com.length()-1){
                count++;
                i++;
            }
            //System.out.println(com.charAt(i));
            sb.append(com.charAt(i));
            if(count>1){
                
                String s=count.toString();
                System.out.println(count);
                sb.append(s);
            }
        }
        return sb;
        
    }
    public static void main(String args[]){
        String com="aaaabbbc";
    comp_string(com);
    
    }
    
}
