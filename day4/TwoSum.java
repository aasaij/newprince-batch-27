//Program to find pair values to get target

import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        //Method - 1
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i<n; i++){
            arr[i] = in.nextInt();
        }
        int target = in.nextInt();
        for (int i = 0; i<n; i++){
            for (int j = i+1; j<n; j++){
                if (arr[i]+arr[j]==target){
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
        in.close();
    }
}
