import java.util.Scanner;
public class Addition{
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();
        double sum = x + y;
        if (sum == (long)sum)
            System.out.println((long)sum);
        else
            System.out.println(sum);
    }
}