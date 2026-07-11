import java.util.Scanner;
import java.util.Arrays;

public class AnagramTestV2 {
    static boolean isAnagram(String s1, String s2){
        int len1 = s1.length();
        int len2 = s2.length();
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        if (len1!=len2)
            return false;
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);

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
