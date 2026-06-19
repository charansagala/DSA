import java.util.*;
class Reverse{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        System.out.println();
        int rev = 0;
        int res = reverse(n,rev);
        System.out.println("The reverse of a given number is :"+res);
        sc.close();
    }
    public static int reverse(int n,int rev){
        while(n != 0 ){
            int d = n%10;
            rev = (rev*10) + d;
            n=n/10;
        }
        return rev;
    }
}