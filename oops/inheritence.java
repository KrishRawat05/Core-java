public class inheritence {
    public static void main(String[] args){
     Engineerstudent es = new Engineerstudent();
     es.markAttendance();
     es.attendLab();

     Student s1 = new Student();
     s1.markAttendance();
    //  s1.attendLab();   (Wrong)
    }
}
class Student{
    String name;
    int age ;

   public void markAttendance(){
        System.out.println("Attendance marked");
    }
}

class Engineerstudent extends Student{
    void attendLab(){
        System.out.println("lab attend");
    }
}