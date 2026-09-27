public class generic2 {
    public static void main(String[] args){
      box b1 = new box(10);
      box b2 = new box("hello");
      box b3 = new box(true);

      //Downcasting

      Integer x =(Integer) b1.getValue();
      String s = (String) b2.getValue();
      Boolean b =(Boolean) b3.getValue();

      System.out.println( x +  5);
       System.out.println( s +  5);
        System.out.println( b);
    }
}
class box{
    private Object value ;

    box(Object value){
        this.value = value ;
    }

    public Object getValue(){
        return this.value;
    }

    public void setValue(Object value){
        this.value = value ;

    }
}
