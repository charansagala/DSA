import java.util.*;
class Count_digits{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        System.out.println();
        int count=0;
        int res = count(n,count);
        System.out.println("Total number of digits present in the given number is :"+res);
        sc.close();
    }
    public static int count(int n ,int count){
        while(n != 0){
            n/=10;
            count++;
        }
        return count;
    }
}