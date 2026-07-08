import java.util.Scanner;

public class LargestDifferenceOfTwoElements {
    static int largestDifference(int[] arr){
        //Broute force method 
        int largest = Integer.MIN_VALUE;
        int n = arr.length;
        for (int i =0; i<n-1; i++){
            for (int j = i+1; j<n; j++)
                largest = Math.max(largest, arr[j]-arr[i]);
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
