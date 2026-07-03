=import java.util.*;

class Palindrome {

    public static boolean isAlphaNum(char ch) {
        return Character.isLetterOrDigit(ch);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        int start = 0;
        int end = s.length() - 1;
        boolean isPalindrome = true;
        while (start < end) {
            if (!isAlphaNum(s.charAt(start))) {
                start++;
                continue;
            }
            if (!isAlphaNum(s.charAt(end))) {
                end--;
                continue;
            }
            char left = Character.toLowerCase(s.charAt(start));
            char right = Character.toLowerCase(s.charAt(end));
            if (left != right) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
        sc.close();
    }
}