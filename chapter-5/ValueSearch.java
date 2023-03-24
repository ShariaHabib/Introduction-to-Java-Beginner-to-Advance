public class ValueSearch {

    public static void main(String[] args) {
        int nums[] = { 10, 11, 12, 14, 1, 2, 4, 6, 8, 4, 55, 48, 5, 6, 9, 11 };
        int val = 9;
        boolean found = false;

        for (int x : nums) {
            if (x == val) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Value found!");
        }
    }
}