// Program to print prime number between x and y
import java.util.Scanner;

public class PrimeNumber{
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        for(int n = x; n<=y; n++){
            if (isPrime(n))
                System.out.print(n + " ");
        }
    }
    private static boolean isPrime(int x){
        if (x==1)
            return false;
        if (x>3 && (x% 2 == 0 || x % 3 == 0))
            return false;
        for(int i = 5; i*i<=x; i+=6){
            if ( x % i == 0 || x % (i+2)==0)
                return false;
        }
        return true;
    }
}