public class CommandLineArgs {
    public static void main(String[] args) {
            System.out.println("Program name: " + args.length);
            for (int i = 1; i < args.length; i++) {
                System.out.println("Argument " + i + ": " + args[i]);
            }
    }
}
