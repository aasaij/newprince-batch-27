import java.util.Scanner;

public class RearrangeArray{
    public static void rearrange(int[] arr){
        for (int left = 0, right = arr.length-1; left<right;){
            //moving left pointer if left value is 1
            while(arr[left]==1 && left < right)
                left++;
            //moving right pointer if right value is 0
            while(arr[right]==0 && left < right)
                right--;
            //swaping left and right values if left < right
            if (left<right){
                // int temp = arr[left];
                // arr[left] = arr[right];
                // arr[right] = temp;
                arr[left] = arr[left]+arr[right] - (arr[right]=arr[left]);
                left++;
                right--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int list[] = new int[n];
        for (int i =0; i<n; i++)
            list[i] = in.nextInt();
        rearrange(list);
        for (int element : list)
            System.out.print(element +" ");
        in.close();
    }
}