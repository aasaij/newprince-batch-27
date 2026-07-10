import java.util.Scanner;

public class ConsonantsReverse {
    static boolean isVowel(char c){
        return "aeiouAEIOU".contains(""+c);
    }
    static boolean isConsonant(char c){
       return Character.isLetter(c) && !isVowel(c);
    }    
    static void consonantsReverse(char[] list){
        for (int left =0, right=list.length-1;left<right;left++, right--){
            if(isConsonant(list[left]) && isConsonant(list[right])){
                char temp=list[left];
                list[left] = list[right];
                list[right] = temp;
            }
            else if (isConsonant(list[left]))
                left--;
            else if (isConsonant(list[right]))
                right++;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        char[] arr = str.toCharArray();
        consonantsReverse(arr);
        System.out.println(new String(arr));
        in.close();
    }
}
