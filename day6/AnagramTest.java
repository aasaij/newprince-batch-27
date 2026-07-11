import java.util.Scanner;

public class AnagramTest {
    static boolean isAnagram(String s1, String s2){
        int len1 = s1.length();
        int len2 = s2.length();
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        if (len1!=len2)
            return false;
        int freq[] = new int[26];

        for (int i = 0; i<len1; i++)
            freq[s1.charAt(i)-'a']++;
        for (int i = 0; i<len2; i++)
            freq[s2.charAt(i)-'a']--;
        for (int i = 0; i<26; i++)
            if (freq[i]!=0)
                return false;
        return true;        
    }
    //Program to check if two strings are anagrams
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        if (isAnagram(s1, s2))
            System.out.println("Anagrams");
        else
            System.out.println("Not Anagrams");
        in.close();
      
    }
}
