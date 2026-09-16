
public class basic {
    public static void main(String[] args){
        Student s1 = new Student();
        Student s2 = new Student();
 
    s1.name = "krish";
    s1.age = 22 ;
    s1.rollNumber=120 ;

   s2.name = "krish Rawat";
    s2.age = 22 ;
    s2.rollNumber=120 ;
    
    s1.markAttendance();
    s2.markAttendance();

    s1.print();
    s2.print();
    }
}
class Student{
    String name;
    int age;
    int rollNumber;

    void markAttendance(){
        System.out.println("Attedance marked by" + name);
    }
    void print(){
        System.out.println(name + " ," + age +"," +rollNumber);
    }
}
