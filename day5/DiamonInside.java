import java.util.Scanner;

public class DiamonInside {
    //Program to print the following pattern
    /*
    test
    testtest
    tes  tes
    te    te
    t      t
    te    te
    tes  tes
    testtest

    */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int len = str.length();
        for (int i = len; i>=1;i--){
            String format = "%-"+len+"."+i+"s%"+len+"."+i+"s";
            System.out.println(String.format(format, str, str));
        }
        for (int i = 2; i<=len;i++){
            String format = "%-"+len+"."+i+"s%"+len+"."+i+"s";
            System.out.println(String.format(format, str, str));
        }
        in.close();      
    }
}
