// Sum calculation for individual number is in O(1) time complexity
import java.util.*;
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++)
        {
            long n=in.nextLong();
            long num_3=(n % 3 == 0)?(n-(n%3))/3 -1 : (n-(n%3))/3;
            long num_5=(n % 5==0) ? (n-(n%5))/5 -1: (n-(n%5))/5;
            long num_15=(n % 15==0) ? (n-(n%15))/15 -1 : (n-(n%15))/15;
            long sum=0l;
                sum=3*(num_3*(num_3+1)/2) +5*(num_5*(num_5+1)/2) - 15*(num_15*(num_15+1)/2);
            System.out.println(sum);
        }
    }
}
