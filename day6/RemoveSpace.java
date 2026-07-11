import java.util.Scanner;

public class RemoveSpace {
    //Method - 1
    public static String removeSpace(String s){
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' '){
                res += s.charAt(i);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(removeSpace(str));
        in.close();
    }
}
