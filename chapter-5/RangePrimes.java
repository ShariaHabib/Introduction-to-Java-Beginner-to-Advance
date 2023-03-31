import java.util.Scanner;

public class Range_Primes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a range to see primes upto it : ");
        int range = sc.nextInt();
        int x = 1;
        System.out.print("Primes in Range: ");
        while (x <= range) {
            // System.out.println(x);30
            if (x != 1) {
                boolean f = true;
                for (int i = 2; i * i <= x; i++) {
                    if (x % i == 0) {
                        f = false;
                        break;
                    }
                    if (!f)
                        break;
                }
                if (f)
                    System.out.print(x + " ");
            }
            x++;
        }
    }
}
