 public class SelectionSort {

    public  static void SortSelection ( int [] arr ) {
        for (int i = 0; i < arr.length ; i++) {
            int min  = i  ;
            for (int j = i; j < arr.length  ; j++) {
                if( arr[j] < arr[min]) {
                    min = j  ;
                }
            }
            if( min != i  ) {
                int temp  = arr[i] ;
                arr[i] = arr[min] ;
                arr[min] = temp  ;
            }
        }
    }
    public static void main(String[] args) {
        int arr []   =  { 1,2,3,9,6,5,4,0} ;
         SortSelection  ( arr )  ;
        for( int n  : arr ) {
            System.out.print(n + " ");
        }

    }
}
