import java.util.Scanner;
public class FindMissingNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] list = new int[n-1];
        for (int i =0; i<n-1; i++)
            list[i] = in.nextInt();
        int sum = n * (n+1)/2;
        int givenSum = 0;
        for (int i = 0; i<n-1; i++)
            givenSum+= list[i];
        System.out.println(sum - givenSum);
        in.close();
    }
    
}
