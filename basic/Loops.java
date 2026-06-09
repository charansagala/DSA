import java.lang.classfile.instruction.StoreInstruction;
import java.util.Scanner;

public class Loops {
public static int fib(int n){
    if(n == 0) return 0;
        if(n == 1) return 1;
        return fib(n-1) + fib(n-2);
    }
public static void printNumb(int n){
    if(n==0) return;
    System.out.println(n);
    printNumb(n-1);
    }
    public static void main(String args[]){
    int n=5;
    printNumb(n);
    fib(n);
    Forloops f = new Forloops();
    // f.stars();
        f.stars6();
    }
    static class Forloops{
        void stars(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number:");
            int n =sc.nextInt();
            for(int i = 0; i < n; i++){
                for(int j = 0;j < n; j++){
                    System.out.print('*' +" ");
                }
                System.out.println();
            }
        }
        void stars2(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number:");
            int n =sc.nextInt();
            for(int i=0 ; i<n ; i++){
                for(int j=0 ; j<=i;j++){
                    System.out.print(i +" ");
                }
                System.out.println();
            }
        }
    void stars3(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        for(int i =1 ;  i<=n;i++){
            for(int j=0 ;j<n-i+1;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    void stars4(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        for(int i = 0 ; i<=n;i++){
            for(int j =0 ;j<=i;j++){
                System.out.print(" ");
            }
            for(int k=0 ;k<n+i+1;i++)
            System.out.print("*");
        }
    }
    void stars5(){
        for(int i=0;i<5;i++){
            for(int j=i;j<5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    void stars6(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        for(int i=0 ; i<5 ;i++){
            //spaces
            for(int j=0 ;j<n-i-1;j++){
                System.out.print(" ");
            }
            //stars
            for(int j =0 ;j<2*i+1;j++){
                System.out.print("*");
            }
            //spaces
            for(int j=0 ;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    void stars7(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        for(int i=0 ; i<5 ;i++){
            //spaces
            for(int j=0 ;j<i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j =0 ;j<2*i+1;j++){
                System.out.print("*");
            }
            //spaces
            for(int j=0 ;j<i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
