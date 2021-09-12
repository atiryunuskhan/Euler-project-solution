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
            int a , b , c ;
            int product = -1;
            for( a=1 ; a<n/2 ; a++)
            {
                b = (n*n - 2*a*n)/(2*n - 2*a);
                c = n-a-b;
                if(c*c == (a*a + b*b) && n == a+b+c)
                {
                    int temp = a*b*c;
                    if(temp > product)
                    {
                        product = temp;
                    }
                }
                
            }
            System.out.println(product);
        }
    }
} 
