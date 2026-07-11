//Program to find maximum frequency of a character in a string

import java.util.Scanner;

public class MaximumFrequency {
    public static char maxFrequencyChar(String str) {
        int freq[] = new int[26];
        for (int i = 0; i<str.length(); i++)
            freq[str.charAt(i)-'a']++;
        int maxIndex = 0;
        for (int i = 1; i<freq.length; i++)
            if (freq[maxIndex]<freq[i])
                maxIndex = i;
        return (char)(maxIndex+'a');
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(maxFrequencyChar(str));
        in.close();
    }
}
