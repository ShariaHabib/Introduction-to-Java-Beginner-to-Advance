public class Array {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = i + 1;// assigning the value to each index.
        }
        System.out.println("Printing the array: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");

        char[] arr = { 'S', 'H', 'A', 'R', 'I', 'A' };
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println("");

    }
}
