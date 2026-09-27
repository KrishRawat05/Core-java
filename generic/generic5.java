

public class generic5 {
    public static void main(String[] args){
    Box<Integer> b1 = new Box<>();
    b1.value = 5 ;
    b1.printDouble();
    }
}

class Box< T extends Number> {
    T value ;

    public void printDouble(){
        System.out.println(value.doubleValue());
    }
}
