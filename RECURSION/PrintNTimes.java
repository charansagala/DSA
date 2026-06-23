public class PrintNTimes {

    static void printMessage(int n) {
        // Base case
        if (n == 0) {
            return;
        }

        System.out.println("Hello World");

        // Recursive call
        printMessage(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        printMessage(n);
    }
}