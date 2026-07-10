import java.util.Scanner;

public class StringReverseV1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = "";
        //Method 1
        //Traversing the string 1 from right to left and storing into another string
        for (int i = s1.length()-1; i>=0; i--)
            s2+=s1.charAt(i);
        System.out.println(s2);
        in.close();
    }
}
