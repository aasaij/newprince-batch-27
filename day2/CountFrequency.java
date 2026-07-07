import java.util.Scanner;

public class CountFrequency {
    public static int count(int[] list, int target){
        //implementing linear search algorithm
        int cnt=0;
        for (int i =0; i<list.length; i++)
            if (list[i]==target)
                cnt++;
        return cnt;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i<n; i++)
            arr[i] = in.nextInt();
        int target = in.nextInt();
        System.out.println(count(arr, target));
        in.close();
    }
}
