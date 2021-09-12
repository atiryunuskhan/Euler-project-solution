import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            String num = in.next();
            int number[]=new int[n];
            for(int x=0; x<n; x++)
            {
                number[x] = num.charAt(x) -48;
            }
            int product = 0;
            int n2=0;
            for(int y=1;y<=n+1-k;y++)
            {
                int temp = 1;
                for(int z=n2;z<n2+k;z++)
                {
                    temp = temp * number[z];
                }
                if(temp > product)
                {
                    product = temp;
                }
                n2++;
            }
            System.out.println(product);
        }
    }
}
