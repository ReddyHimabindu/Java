//package OOPs;

public class constructors {
    static class student {
        String name;
        int rollno;
        // student(){
        //     System.out.println("hey, i am default constructor (non parametrized)");
        // }
        student (String name){
            this.name = name;
            System.out.println("hey "+name+", I'm parametrized constructor");
        }
    }
    public static void main(String args[]){
        //constructors c=new constructors();
        //student s1 = new student();
        student s2= new student("hima");
    }   
}
