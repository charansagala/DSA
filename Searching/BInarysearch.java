import java.util.Scanner;
import java.util.Arrays;
class Binarysearch{
    

    public static int binarySearch(int[] arr, int target) {

        int left = 0;

        int right = arr.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2; // Avoids overflow

            if (arr[mid] == target) {

                return mid; // Target found

            } else if (arr[mid] < target) {

                left = mid + 1; // Search right half

            } else {

                right = mid - 1; // Search left half

            }
        }
        return -1; // Target not found
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array:");
        int n = sc.nextInt();
        System.out.println();
        int arr[] = new int[n];
        System.out.print("Enter the values in array:");
        for (int i = 0 ;i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println();
        System.out.print("Enter the target value:");
        int tar = sc.nextInt();
        int res = binarySearch(arr,tar);
        if(res == -1)
        System.out.println("Element is not found");
        else
        System.out.println("Element found at the index"+res);
    }
}