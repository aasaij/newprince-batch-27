//program to find an element in an array

import java.util.Scanner;

public class FindTarget {
    public static boolean search(int[] list, int target){
        //implementing linear search algorithm
        for (int i =0; i<list.length; i++)
            if (list[i]==target)
                return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i<n; i++)
            arr[i] = in.nextInt();
        int target = in.nextInt();
        System.out.println(search(arr, target)?"Found":"Not Found");
        in.close();
    }
}
