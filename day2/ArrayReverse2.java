import java.util.Scanner;

public class ArrayReverse2 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        //Getting size of the array
        int[] arr = new int[n];
        //Getting list of <n> elements
        for(int i = 0; i<n; i++)
            arr[i] = in.nextInt();
        int brr[] = new int[n];
        //Copying the array arr into brr in  reverse order
        for (int j=0,i=n-1; i>=0; i--,j++)
            brr[j] = arr[i];
        //Printing the reversed array
        for (int i =0; i<n; i++)
            System.err.print(brr[i] +" ");
        in.close();
    }
}
