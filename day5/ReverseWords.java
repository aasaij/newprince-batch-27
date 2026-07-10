import java.util.Scanner;

public class ReverseWords {
    static void reverseArray(String[] s){
        for(int left = 0, right=s.length-1; left<right; left++, right--){
            String temp = s[left];
            s[left] = s[right];
            s[right] = temp;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] words = str.split(" ");
        reverseArray(words);
        System.out.println(String.join(" ", words));
        in.close();
    }
}
