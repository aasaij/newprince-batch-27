import java.util.Scanner;

public class XPattern{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int len = str.length();
        for (int i = 1; i<len; i++){
            String format = "%"+i+"c%"+(len*2 - i*2)+"c";
            System.out.println(String.format(format, str.charAt(i-1), str.charAt(i-1)));
        }
        System.out.println(String.format("%"+len+"c", str.charAt(len-1)));
        for (int i = len-1; i>=1; i--){
            String format = "%"+i+"c%"+(len*2 - i*2)+"c";
            System.out.println(String.format(format, str.charAt(i-1), str.charAt(i-1)));
        }

        in.close();
    }
}