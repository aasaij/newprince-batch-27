import java.util.Scanner;
// Program to check whether the given number is prime or not
public class Prime4{
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n > 3 && (n % 2 == 0 || n % 3 == 0))
            System.out.println("Not prime");
        else{
            for (int i = 5; i<=Math.sqrt(n);i+=6){
                if ( n % i == 0){
                    System.out.println("Not prime!");
                    return;
                }
            }
            System.out.println("Prime");
        }
    }
}