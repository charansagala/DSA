import java.util.Scanner;
class basic{
    public static void main(String args[]){
        System.out.print("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res=fact(n);
        System.out.println(res);
    }
    public static int fact(int n){
        if(n==0 || n==1) return 1;
        return n*fact(n-1);
    }
}