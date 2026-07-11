//Leetcode Problem no - 3014

import java.util.Scanner;

public class MinimumNumberOfPushes {
    public static int minimumPushes(String word) {
        int len = word.length();
        if (len<=8)
            return len;
        else if (len<=16)
            return 8 + (len-8)*2;
        else if (len <=24)
            return 24 + (len-16)*3;
        else
            return 48 + (len-24)*4;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(minimumPushes(str));
        in.close();
    }
}
