import java.util.Scanner;

public class Main {

    static void PrintNUmbersRevers(int n) {
        // Base case
        if (n == 0) {
            return;
        }

        System.out.print(n + " ");

        // Recursive call
        printNumbers(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        printNumbers(n);

        sc.close();
    }
}