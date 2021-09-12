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
            long n = in.nextLong();
            long largprimfact = 0;
            for(int x=2; x <= Math.sqrt(n); x++)
            {
                while(n%x == 0)
                {
                    largprimfact = x;
                    n=n/x;
                }
            }
            if(n != 1)
            {
                largprimfact = n;
            }
            System.out.println(largprimfact);
        }
    }
}
