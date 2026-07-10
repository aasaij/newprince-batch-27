import java.util.Scanner;

public class StringReverseV3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        char[] arr = str.toCharArray();
        //method - 3
        //Reversing array using two pointer approach
        for (int left=0, right=arr.length-1;left<right;left++, right--)
        {
            char temp = arr[left];
            arr[left]= arr[right];
            arr[right]=temp;
            // arr[left] = (char)(((int)arr[left]+(int)arr[right]) - (arr[right]=(char) (int)arr[left]));
        }
        System.out.println(new String(arr));
        in.close();
    }
}
