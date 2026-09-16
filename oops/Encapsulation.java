public class Encapsulation{
    public static void main(String[] args){
    bankAcount ba = new bankAcount();
    ba.deposit(400);
    ba.withdrawl(200);

    System.out.println(ba.getBalance());
    }
}
class bankAcount{
private double balance;

public void deposit(int amount)
{
    balance += amount ;
}
public void withdrawl(int amount){
    balance -= amount ;
}
public double getBalance(){
    return balance ;
}
}

class Student{
    private String name; 
    private int rollNumber ;
    private int age ;
    private String college;

 Student(String name , int rollNumber , int age , String college){
    this.name = name ;
    this.rollNumber = rollNumber;
    this.age = age ;
    this.college = college ;
}
public String getName(){
    return name;
}
public void setName(String name){
    this.name = name ;
}
public String getcollege(){
    return college;
}
public void setcollege(String college){
    this.college = college ;
}
}

