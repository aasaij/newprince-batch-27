import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        //getting the size of the array
        n = in.nextInt();
        //declaring the array
        int list[] = new int[n];
        //getting the list of integers
        for (int i = 0; i<n; i++){
            list[i] = in.nextInt();
        }
        int max, smax;
        //assuming the integer minimum as first and second largest   element is the largest
        max = smax = Integer.MIN_VALUE;
        for (int i = 0; i<n; i++){
            if (list[i] >max){
                smax = max;
                max = list[i];
            }
            else if (list[i]>smax && list[i] != max){
                smax = list[i];
            }
        }
        if (smax != Integer.MIN_VALUE)
            System.out.println(smax);
        else
            System.out.println("No second largest element");
    }
}
