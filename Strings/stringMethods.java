public class stringMethods {
    public static void main(String[] args){
        // length
        String s1 = new String("krish   ") ;
         String s2 = new String("abd") ;
        // System.out.println(s1.length());
        // System.out.println(s1.isEmpty());
        // System.out.println(s1.isBlank());

        // character access

        // System.out.println(s1.charAt(2));
        // System.out.println(s1.length());
        // char[] arr = s1.toCharArray();
        

        // comparison 
        // System.out.println(s1.equals(s2));
        // System.out.println(s1.equalsIgnoreCase(s2));
        // System.out.println(s1.compareTo(s2));


        // Searching

       
         System.out.println(s1.contains("is"));
         System.out.println(s1.indexOf("is"));
         System.out.println(s1.lastIndexOf("is"));
         System.out.println(s1.startsWith("kr"));

         // extraction / transformation 

         System.out.println(s1.substring(0 ,2));  
          System.out.println(s1.trim());  
           System.out.println(s1.replace("i" ,"s"));

            System.out.println(String.join("-","a","b","c"));

            // conversion

            String s4 = new String(String.valueOf(10));
            byte[] arr = s1.getBytes();
            for(byte i : arr){
                System.out.print(i + " , ") ;
            }

            // advance 
            String s5 = new String("hello") ;
            String s6 = s5.intern();
            System.out.println(s5 == s6); // false  

            String name = "krish";
            int age = 35 ;
            System.out.println(String.format("hello %s , your age is %s" , name ,age));
    }

}
