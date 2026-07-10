import java.util.Scanner;

public class RightRotation {
    static void rotateRight(int[] arr, int rotations){
        //Calculating number of rotations
        rotations %= arr.length;
        //rotating the array <rotations> times
        for(int i = 1; i<=rotations; i++){
            //storing last element from the array
            int last = arr[arr.length-1];
            //moving the array right side one by one
            for (int j = arr.length-2; j>=0; j--)
                arr[j+1]= arr[j];
            //assigning the first element as last element
            arr[0] = last;
        }
    }
    static void printArray(int[] arr){
        for (int element : arr)
            System.out.print(element +" ");
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] list = new int[n];
        for (int i = 0; i<n; i++)
            list[i] = in.nextInt();
        int k = in.nextInt();
        rotateRight(list, k);
        printArray(list);
        in.close();
    }
}
