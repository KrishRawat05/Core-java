public class anonymousClass {
    public static void main(String[] args) {

        Person p1 = new Person() {

            String name = "krish";

            @Override
            void introduce() {
                greet();
                System.out.println("i am guest");
            }
            void greet(){
                System.out.println(name);
            }
        };

        p1.introduce();
    }
}

class Person {
    void introduce() {
        System.out.println("i am not guest");
    }
}