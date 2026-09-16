public class staticKeyword {
    public static void main(String[] args){

        Student s1 = new Student("krish" , 21);
        Student s2 = new Student("anish", 19);
        
        System.out.println(s1.name + s1.age + Student.college);
        System.out.println(s2.name + s2.age + Student.college);
    }
}
class Student{
    String name ;
    int age;
    static String college ;

    Student(String name , int age ){
        this.name = name ;
        this.age = age ;

    }

    // static block
    static{
        college="DGI" ;
    }
}