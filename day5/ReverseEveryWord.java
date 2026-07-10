import java.util.Scanner;

public class ReverseEveryWord {
    static String reverseString(String s){
        char[] str = s.toCharArray();
        for (int left= 0, right=s.length()-1; left<right;left++, right--){
            char temp = str[left];
            str[left] = str[right];
            str[right] = temp;
        }
        return new String(str);
    }
    static void reverseWords(String s){
        String[] words = s.split(" ");
        for (String word : words)
            System.out.print(reverseString(word) +" ");
    }
    //Program to reverse every word of a sentence
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String sentence = in.nextLine();
        reverseWords(sentence);
        in.close();
    }
}
