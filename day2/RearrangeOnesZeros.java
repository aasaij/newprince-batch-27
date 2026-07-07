import java.util.Scanner;

public class RearrangeOnesZeros {
    public static void rearrange(int[] list){
        //method 1
        int cnt=0;
        //counting number of 1's
        for (int i =0; i<list.length; i++)
            if (list[i]==1)
                cnt++;
        //filling first <cnt> values as 1
        for (int i = 0; i<cnt; i++)
            list[i] =1;
        //filling remaining all values as 0
        for (int i = cnt; i<list.length; i++)
            list[i] = 0;    
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i<n; i++)
            arr[i] = in.nextInt();
        rearrange(arr);
        for(int element : arr)
            System.err.print(element + " ");
        in.close();
    }
}
