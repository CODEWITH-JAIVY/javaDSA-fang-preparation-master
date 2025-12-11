public class LaxicalString {
   public static int compare(String a , String b ) {
       return a.CompareTo(b) ;
   }
    public static void main(String[] args) {
        String a  = "Car" ;
        String b  = "car" ;
        int res  = compare( a ,  b  ) ;
        if(res !=0 ) {
            System.out.println("Not same ");
        }else  {
            System.out.println("Same ");
        }
    }
}