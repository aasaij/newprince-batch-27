import java.util.Scanner;
public class ArrayReverse {
    //Program to demonstrate reverse traversal of an arrray
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0;i<n; i++)
            arr[i] = in.nextInt();
        //Forward Traversal of the array
        for (int i = 0; i<n; i++)
            System.out.print(arr[i] +" ");
        System.out.println();
        //Reverse Traversal of the array
        for (int i = n-1; i>=0; i--)
            System.out.print(arr[i] +" ");
        in.close();
    }
}
