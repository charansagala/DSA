import java.util.*;
class Palindrome{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        System.out.println();
        int rev = 0;
        boolean res = palindrome( n, rev);
        if(res == true)
        System.out.println("The given number is palindrome");
        else
        System.out.println("The given number is not a palindrome");
    }
    public static boolean palindrome(int n ,int rev){
        int original = n;
        while(n != 0){
            int d = n%10;
            rev = (rev*10)+d;
            n/=10;
        }
        if(original == rev) return true;
        return false;
    }
}