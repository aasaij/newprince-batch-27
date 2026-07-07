import java.util.Scanner;
// Program to check whether the given number is prime or not
public class Prime2{
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 2; i<=n/2;i++){
            if ( n % i == 0){
                System.out.println("Not prime!");
                return;
            }
        }
        System.out.println("Prime");
    }
}