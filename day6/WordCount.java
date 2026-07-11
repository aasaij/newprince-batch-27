import java.util.Scanner;
public class WordCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(str.split(" ").length);
        in.close();
    }
}
