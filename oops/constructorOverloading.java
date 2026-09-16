public class constructorOverloading {
    public static void main(String[] args){
      
       Student s1 = new Student();
       Student s2 = new Student("krish");
       Student s3 = new Student("krish", 21);
       Student s4 = new Student("krish" , 21,18099);
       Student s5 = new Student("krish" ,21,18099,"IIT");
     System.out.println(s4.rollNumber);
    }
   

}
 // Constructor chaining
class Student{
    String name ;
    int age ;
    int rollNumber ;
    String college ;


    Student(){
      this("unknown" ,0 , 0 ,"unkknown");
    }

    Student(String name){
        this(name , 0 ,0 ,"unkknown") ;
    }

    Student(String name , int age){
       this(name , age , 0 , "unkknown") ;
    }

    Student(String name , int age , int rollNumber){
       this(name , age , rollNumber , "unkknown") ;
    }
    
    Student(String name , int age , int rollNumber , String college){
        this.name = name ;
        this.age = age ;
        this.rollNumber = rollNumber;
        this.college = college ;
    }

    
}
