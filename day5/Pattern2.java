import java.util.Scanner;

public class Pattern2 {
    /*
    Program to print the following pattern
    test
       t
      te
     tes
    test 
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int len = str.length();
        for (int i = 1; i<=len; i++){
            String format = "%"+len+"."+i+"s";
            System.out.println(String.format(format, str));
        }
        in.close();
    }
}
