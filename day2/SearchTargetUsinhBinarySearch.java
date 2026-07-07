import java.util.Arrays;
import java.util.Scanner;

public class SearchTargetUsinhBinarySearch {
    public static int search(int[] list, int target){
        Arrays.sort(list);
        //implementing binary search algorithm
        int low, high;
        low = 0;
        high = list.length -1;
        while (low<=high) {
            int mid = (low+high)/2;
            if (list[mid] == target)
                return mid;
            else if (list[mid]>target)
                high = mid-1;
            else
                low  = mid+1;            
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i<n; i++)
            arr[i] = in.nextInt();
        int target = in.nextInt();
        System.out.println(search(arr, target));
        in.close();
    }
}
