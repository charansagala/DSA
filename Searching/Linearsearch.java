import java.util.Scanner;
public class Linearsearch{

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Element found
            }
        }
        return -1; // Element not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n = sc.nextInt();
        System.out.println();
        int[] arr = new int[n];
        System.out.print("Enter the values of array:");
        for(int i=0 ;i<n;i++)
        arr[i]=sc.nextInt();
        System.out.println();
        System.out.print("Enter the target variable:");
        int target = sc.nextInt();
        int result = linearSearch(arr, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}