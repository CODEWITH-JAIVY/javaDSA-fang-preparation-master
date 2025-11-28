public class BubbleSort {
public  static  void Sort (int [] arr ) {

    for (int i = 0; i < arr.length -1; i++) {
        for (int j = 0; j <arr.length -1; j++) {
            if(arr[j] > arr[j+1]) {
                int tem  = arr[j] ;
                arr[j] = arr[j+1] ;
                arr[j+1] = tem ;
            }
        }
    }
}

    public static void main(String[] args) {
        int [] arr  = { 3,2,4,1,9,8,7,5,6,3,2,1 } ;
       Sort( arr ) ;
         for (int e  :  arr  ){
             System.out.print(e + " ");
         }

    }
}
