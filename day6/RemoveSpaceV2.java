import java.util.Scanner;
public class RemoveSpaceV2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        // System.out.println(str.replaceAll(" ", ""));
        System.out.println(String.join("", str.split(" "))); //str.split(" ")
        in.close();
    }
}
