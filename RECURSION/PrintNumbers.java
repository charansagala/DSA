import java.util.Scanner;

public class PrintNumbers {

    static void printNumbers(int i, int n) {
        // Base case
        if (i > n) {
            return;
        }

        System.out.print(i + " ");

        // Recursive call
        printNumbers(i + 1, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        printNumbers(1, n);

        sc.close();
    }
}