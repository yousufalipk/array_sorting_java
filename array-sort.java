public class array-sort
{

    public static void main(String[] args) {
        int min, temp;
        int[] arr = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        for (int i = 0; i < arr.length; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    min = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        System.out.println("Printing Array: ");
        for (int k = 0; k < arr.length; k++) {
            System.out.println("Element Number " + (k + 1) + " is " + arr[k]);
        }
    }
}
