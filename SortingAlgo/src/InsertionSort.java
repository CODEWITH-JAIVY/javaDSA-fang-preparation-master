  public class InsertionSort {

    public static int[] Insort(int[] arr) {
        // Start from the second element
        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;  // Previous index
            int temp = arr[i];  // The element to be placed at the correct position

            // Shift elements of arr[0..i-1], that are greater than temp, to one position ahead
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];  // Move element one step forward
                j--;  // Move to the previous element
            }
            arr[j + 1] = temp;  // Place the temp at the correct position
        }
        return arr;  // Return the sorted array
    }

    public static void main(String[] args) {
        int[] arr = {9, 8, 6, 3, 5, 7, 4, 12, 0};  // Example unsorted array
        int[] res = Insort(arr);  // Sort the array using Insertion Sort

        // Print the sorted array
        for (int n : res) {
            System.out.print(n + "  ");
        }
    }
}
