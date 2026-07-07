import java.util.Scanner;
public class LargestElement {
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
        //assuming the first element is the largest
        int max = list[0];
        //checking whether the assumption is true or not and then checking the rest of the elements
        for (int i = 1;i<n; i++){
            if (max < list[i])
                max = list[i];
        }
        System.out.println(max);
    }
}
