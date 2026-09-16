import java.util.Objects;

public class ObjectClass {
    public static void main(String[] args) throws CloneNotSupportedException{
        student s1 = new student();
        s1.name = "krish";
        s1.age= 21 ;

        // System.out.println(s1);

        student s2 = new student();
        s2.name = "krish";
        s2.age = 21 ;

        // System.out.println(s1.equals(s2));
        // System.out.println(s1.hashCode() == s2.hashCode());
        // System.out.println(s1.getClass().getName()) ;
        // System.out.println(s1 instanceof Object);

        student s3 = (student) s1.clone();
        System.out.println(s3.name);
        System.out.println(s3.age);


    }
}

class student extends Object implements Cloneable{
    String name ;
    int age ;

    @override 
    public String toString(){
        return (name + age) ;
    }

    @override
     public boolean equals(Object obj) {

        if(this == obj) return true;

        if(obj == null) {
            return false;
        }

        // Check if both classes are of type Student
        // If not checked --> ClassCastExceptions
        if(obj.getClass() != this.getClass()) {
            return false;
        }
        
        student s = (student) obj;

        return (this.name == s.name && this.age == s.age);
    }

    @override 
    public int hashCode(){
        // int result = 17 ;
        // result = result * 31 + age ;
        // result = result * 31 + ((name == null) ? 0 : name.hashCode());

        return Objects.hash(name + age);
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
