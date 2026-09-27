public class generic3 {
    public static void main(String[] args){
        box<Integer> b1 = new box<Integer>(10);

        System.out.println(b1.getValue() + 5);

        box<String> b2 = new box<> ("hello");
        System.out.println(b2.getValue() + 5);
    }
}
class box<T>{
    private T value ;

    box(T value){
        this.value = value ;
    }

    public T getValue(){
        return this.value;
    }

    public void setValue(T value){
        this.value = value ;

    }
}