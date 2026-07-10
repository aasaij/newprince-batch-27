import java.util.Arrays;
import java.util.Scanner;

public class TwoSumV2 {
    public static void main(String[] args) {
        //Method - 2
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i<n; i++){
            arr[i] = in.nextInt();
        }
        int target = in.nextInt();
        Arrays.sort(arr);
        int left = 0, right = n-1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                System.out.println(arr[left] + " " + arr[right]);
                break;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
       
        in.close();
    }
}
