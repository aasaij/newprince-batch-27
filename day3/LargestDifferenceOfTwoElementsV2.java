import java.util.Scanner;

public class LargestDifferenceOfTwoElementsV2{
    static int largestDifference(int[] arr){
        //Linear time complexity
        int largest = Integer.MIN_VALUE;
        int n = arr.length;
        int minElement = arr[0];
        for (int i = 1; i<n; i++){
            largest = Math.max(largest,arr[i]-minElement);
            minElement = Math.min(minElement, arr[i]);
        }
        return largest;
    }
    //Finding the largest difference between two element in an array
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Getting size of an array
        int n = in.nextInt();
        //allocating memory to store <n> elements
        int[] list = new int[n];
        //Getting list of <n> integers
        for (int i = 0; i<n; i++)
            list[i] = in.nextInt();
        System.out.println(largestDifference(list));
        in.close();
    }
}
