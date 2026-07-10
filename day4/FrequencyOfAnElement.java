import java.util.Scanner;

public class FrequencyOfAnElement {
    static int countFrequency(int[] arr, int target) {
        int cnt = 0;
        for (int element : arr)
            if (element == target)
                cnt++;
        return cnt;
    }
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int[] list = new int[n];
            for (int i = 0; i<n; i++)
                list[i] = in.nextInt();
            System.out.println(countFrequency(list, in.nextInt()));
            in.close();
            }
}