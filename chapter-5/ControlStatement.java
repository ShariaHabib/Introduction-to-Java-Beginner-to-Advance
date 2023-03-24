import java.util.Scanner;

public class control_statement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if (x % 2 == 0 && x % 5 == 0) {
            System.out.println("Divided by 2 and 5");
        } else {
            System.out.println("Wiered");
        }

    }
}
