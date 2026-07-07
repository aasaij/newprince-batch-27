import java.util.Scanner;

public cl+ass ArrayReverse3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i =0;i<n; i++)
            arr[i] = in.nextInt();
        //reversing the array using two pointer approach
        for (int left=0,right=n-1;left<right;left++, right--)
        {
            //swapping left and right elements
            // int temp = arr[left];
            // arr[left] = arr[right];
            // arr[right] = temp;
            // x = (x+y)-(y=x);
            arr[left] = (arr[left]+arr[right]) - (arr[right]=arr[left]);
        }
        //printing reversed array
        for (int element : arr){
            System.out.print( element + " ");
        }
    }
}
