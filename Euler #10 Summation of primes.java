import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution 
{

    public static void main(String[] args)
     {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        boolean isPrime[] = new boolean[1000001];
        Arrays.fill(isPrime , true);
        isPrime[0] = false;
        isPrime[1] = false;
        long sum_index[] = new long[1000001]; 
        for(int x=2;x<=Math.sqrt(1000000);x++)
        {
            for(int y=2*x;y<=1000000;y=y+x)
            {
                isPrime[y] = false;
            }
        }
        long sum = 0;
        for(int y=0;y<=1000000;y++)
        {
            if(isPrime[y] == true)
            {
                sum = sum + y;
            }
            sum_index[y] = sum;
        }
        for(int a0 = 0; a0 < t; a0++)
        {
            int n = in.nextInt();
            System.out.println(sum_index[n]);
        }
    }
}
