public class InsertionSort {

    public static void sort(int arr[]) {

        int len = arr.length; // Define the Length of the Array

        for (int i = 1; i < len; i++) {

            int key = arr[i]; // assign to a variable of the current position of the arr[i]
            int j = i - 1; // assign to a variable of the current position of variable i - 1

            while (j >= 0 && arr[j] > key) {

                /*
                 * using loop check if the variable j is greater than or equal to 0 and
                 * check if the arr[j] is greater than your key
                 * 
                 * Example:
                 * 
                 * { 3, 1, 4, 6, 2, 5 }
                 * arr[j] = 3
                 * key = 1
                 * 
                 * so on and so forth, the variables j & i increment as the for loop iterates
                 * 
                 */

                arr[j + 1] = arr[j]; // assign the value of the larger element at position j to the element at
                                     // position j + 1

                j--; // decrement the j to ensure that we can continue comparing the key with
                     // previous elements
            }
            arr[j + 1] = key; /*
                               * assigns the key (the current element being considered for insertion) to the
                               * position immediately after shifting larger elements to the right, effectively
                               * inserting the key into its correct position in the sorted subarray.
                               */

        }
    }

    public static void printArray(int arr[]) {

        int len = arr.length;

        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String... args) {

        int arr[] = { 3, 1, 4, 6, 2, 5 };

        System.out.print("Unsorted: ");
        printArray(arr);
        System.out.println();

        sort(arr);

        System.out.print("Sorted: ");
        printArray(arr);
    }

}