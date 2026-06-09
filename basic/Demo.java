import java.io.InputStreamReader;
import java.io.BufferedReader;
class Demo{
    public static void main(String args[])throws Exception{

    int nums[] = {41,65,14,80,20,10,55,58,24,56,28,86,96,10,3,84,4,41,13,32,42,43,83,78,82,70,15,-41};
        int product=1;
        for (int i=0;i<nums.length;i++){

            product = product*nums[i];
        }
        System.out.println(product);
        // int res = signFunc(product);
        // System.out.println(res);
    }
// static int signFunc(int x){
//         if(x<0) return -1;
//         if(x==0) return 0;
//         return 1;
//     }
}