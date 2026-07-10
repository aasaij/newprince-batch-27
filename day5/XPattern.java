import java.util.Scanner;

public class XPattern {
    /*
    Program to print the following pattern
    test
    t
     e
      s
       t
    */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int len = str.length();
        for (int i = 1;i<=len; i++)
            System.out.println(String.format("%"+i+"c", str.charAt(i-1)));
        in.close();
    }
}
