import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++)
        {
            long n = in.nextInt();
            long s1=0;
            long s2=0;
            if((n-1)>=3)
            {
                long a=(n-1)/3;
                s1=(a*(6+((a-1)*3)))/2;
            }
            if((n-1)>=5)
            {
                long b=(n-1)/5;
                s2=(b*(10+((b-1)*5)))/2;
            }
            long s3=0;
            if((n-1)>=15){
                long c=(n-1)/15;
                s3=(c*(30+((c-1)*15)))/2;
            }
            long s=s1+s2-s3;
            System.out.println(s);
        }
    }
}   
