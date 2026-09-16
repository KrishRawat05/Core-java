
public class constructor {
    public static void main(String[] args) {
    Student s1 = new Student("krish", 21 , 18099);
    System.out.println(s1.name);
    System.out.println(s1.age);
    System.out.println(s1.rollNumber);
    }
   
    
}

class Student{
    String name;
    int age;
    int rollNumber;

     // constructor 
    // Student(){
    //     name = "krish";
    //     age = 21;
    //     rollNumber = 18099 ;
    // }
    // deafault constructor
    // Student(){

    // }

    Student(String a , int b , int c){
        name = a ;
        age = b ;
        rollNumber = c;
    }
}

