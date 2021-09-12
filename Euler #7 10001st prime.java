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
        int t=in.nextInt();
        int primenumber[] = new int[10000];
        primenumber[0] = 2;
        int p=3 , count = 1 ;
        while(count<10000)
        {
            boolean found = true;
            for(int x=3; x <=Math.sqrt(p);x++)
            {
                if(p%x == 0)
                {
                    found = false;
                    break;
                }
            }
            if(found == true)
            {
                primenumber[count] =p;
                count++;
            }
            p=p+2;
        }
        for(int y=0;y<t;y++)
        {
            int n=in.nextInt();
            System.out.println(primenumber[n-1]);          
        }
    }
} 
