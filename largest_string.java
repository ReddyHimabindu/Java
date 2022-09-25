//package string;

public class largest_string {
    public static void main(String args[]){
        String names[]={"bindu","pandu","manu","geethu","shruthi"};
        String largest=names[0];
        for(int i=1;i<names.length;i++){
            if(largest.compareTo(names[i])<0){
                largest=names[i];
            }
        }
        System.out.println(largest);
    }
}
