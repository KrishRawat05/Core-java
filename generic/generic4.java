public class generic4 {
    public static void main(String[] args){
     pair<String> p1 = new pair<>("krish", "rawat");
      pair<Integer> p2 = new pair<>(10 , 4);
     System.out.println(p2.first + " " + p2.second);
    }
}

class pair <T>{
T first ;
T second ;

    pair(T first , T second){
        this.first = first ;
        this.second = second ;
    }
}