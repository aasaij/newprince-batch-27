public class ConsonantsCount {
    static boolean isVowel(char c){
        // if ("aeuoiAEIOU".contains(""+c))
        //     return true;
        // return false;
        return "aeuoiAEIOU".contains(""+c);
    }
    public static void main(String[] args) {
        String s1 = new java.util.Scanner(System.in).nextLine();
        int consonantsCnt= 0;
        for (int i = 0;i<s1.length();i++){
            char c = s1.charAt(i);
            //checking whether the character is consonant or not
            // i.e it should be an alphabet and should not be a vowel
            if (Character.isLetter(c) && !isVowel(c))
                consonantsCnt++;
        }
        System.out.println(consonantsCnt);
    }
}
