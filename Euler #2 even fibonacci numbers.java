//time complexity O(n) for each individual number
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
        for(int a0 = 0; a0 < t; a0++)
        {
            long n =in.nextLong();
            long sum=0;
            long n1=0;
            long n2=1;
            long h=n;
            while(n2<=n)
            {
                long exc = n1;
                n1 = n2;
                n2 = n2 + exc;
                if(n2 % 2 == 0 && n2<=n)
                {
                   sum = sum + n2;
                }
            }
            System.out.println(sum);
        }
    }
}
