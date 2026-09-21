public class string {
    public static void main(String[] args){
        String s1 = "krish" ;
        String s2 = "krish" ;
        System.out.println(s1 == s2);  // string pool mai jatii h values
        String s3 = new String("Krish") ; 
        System.out.println(s1 == s3);

        char[] arr = {'k','r','i','s','h'} ;
        String s4 = new String(arr);
        System.out.println(s4);
        String s5 = new String(arr , 0 ,2);
        System.out.println(s5);

        // byte
        byte[] arr2 = {97 , 98 ,99} ;
        String s6 = new String(arr2) ;
        System.out.println(s6);

        // StringBuilder / StringBuffer

        StringBuilder sb = new StringBuilder("monti") ;
        String s7 = new String(sb) ;
        System.out.println(s7);

        StringBuffer sbr = new StringBuffer("montyy");
          String s8 = new String(sbr) ;
        System.out.println(s8);

    }
    
}
