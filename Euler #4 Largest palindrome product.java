import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int x = 100; x<=999; x++)
        {
            for(int y = 100; y<=999; y++)
            {
                int product = x*y;
                int temp = product;
                int check_pal = 0;
                while(temp != 0)
                {
                    check_pal = check_pal*10;
                    check_pal += temp % 10;
                    temp = temp / 10; 
                }
                if(check_pal == product)
                {
                    list.add(product);
                }
            }
        } 
        Collections.sort(list);
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            for(int i=0; i<list.size() ; i++)
            {
                if(list.get(i) >= n)
                {
                    System.out.println(list.get(i-1));
                    break;
                }
            }
        }
    }
}
