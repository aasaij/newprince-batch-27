import java.util.Scanner;

public class CountOddEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        //Getting list of <n> integers
        for (int i = 0; i<n; i++)
            arr[i] = in.nextInt();
        int evenCnt=0, oddCnt=0;
        // evenCnt = oddCnt = 0;
        //Counting even and odd numbers in list
        for (int i = 0; i<n; i++){
            //checking whether the element is even
            if (arr[i] % 2 == 0)
                evenCnt++; // if so increase the even count
            else
                oddCnt++; // otherwise increase the odd count
        }
        System.out.println("Odd count : " + oddCnt);
        System.out.println("Even count : " + evenCnt);
        in.close();
    }
}
