import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int len = str.length();
        for (int i = len; i>=1;i--){
            String format = "%-"+len+"."+i+"s%"+len+"."+i+"s";
            System.out.println(String.format(format, str, str));
        }
        in.close();
    }
}
