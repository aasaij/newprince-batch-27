import java.util.Scanner;

public class StringReverseV2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        //Method 2
        StringBuffer sb = new StringBuffer(s1);
        sb.reverse();
        // s1 = new String(sb);
        System.out.println(sb.toString());        
        in.close();
    }
}
