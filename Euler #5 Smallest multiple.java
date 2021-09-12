
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
            boolean found = false;
            int num=0;
            while(found == false)
            {
                boolean flag = true;
                num++;
                for(int x=1;x<=n;x++)
                {
                    if(num % x!=0)
                    {
                        flag = false;
                        break;
                    }
                }
                if(flag == true)
                {
                    found = true;
                    System.out.println(num);
                }
            }
        }
    }
}
