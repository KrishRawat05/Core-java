public class stringbuilder {
    public static void main(String[] args){
      StringBuilder sb = new StringBuilder(100);

      sb.append("krish");
    //   sb.append("rawat");

    //   System.out.println(sb);

    //   // insert()

    //   sb.insert(2 ,'x');

    //    System.out.println(sb);

    //    // delete

    //    sb.delete(0, 2);
    //     System.out.println(sb);

    //     sb.deleteCharAt(1) ;
    //     System.out.println(sb);

        //replace

    //     sb.replace(0, 2,"kri");
    //     System.out.println(sb);

    //   // reverse
    //   sb.reverse();
    //    System.out.println(sb);
  
  
     System.out.println(sb.length());
      System.out.println(sb.capacity());
  sb.trimToSize();
   System.out.println(sb.capacity());
    
   

}
}
