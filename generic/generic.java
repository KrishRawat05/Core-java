

public class generic {
    public static void main(String[] args){

        // upcasting 

        String s = "hello";
        Object obj = s;
        System.out.println(obj);  // hello

        //downcasting

        Object ob = "hello";
        String s1 = (String)ob;
        System.out.println(s1);
    }
}
