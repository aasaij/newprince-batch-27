import java.util.Scanner;

public class MergeOfTwoSortedArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1, n2;
        n1 = in.nextInt();
        n2 = in.nextInt();
        int[] a = new int[n1];
        int[] b = new int[n2];
        int[] merge = new int[n1 + n2];
        for (int i = 0; i<n1; i++)
            a[i] = in.nextInt();
        for (int i = 0; i<n2; i++)
            b[i] = in.nextInt();
        int i , j, k;
        i = j = k = 0;
        //implementing merging of two sorted array
        while (i <n1 && j < n2){
            if (a[i] < b[j])
                merge[k++] = a[i++];
            else
                merge[k++] = b[j++];
        }
        //checking for remaining elements in array a
        while (i<n1)
            merge[k++] = a[i++];
        //checking for remaining elements in array b
        while (j<n2)
            merge[k++] = b[j++];
        //Printing merged array
        for (int element : merge)
            System.out.print(element + " ");
        in.close();
    }
}
