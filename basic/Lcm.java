import java.util.Scanner;

public class Lcm {

    // Function to find HCF (GCD)
    static int hcf(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to find LCM
    static long lcm(int a, int b) {
        return (long) a * b / hcf(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int hcfValue = hcf(a, b);
        long lcmValue = lcm(a, b);

        System.out.println("HCF = " + hcfValue);
        System.out.println("LCM = " + lcmValue);

        sc.close();
    }
}