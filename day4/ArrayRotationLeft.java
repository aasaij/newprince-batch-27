import java.util.Scanner;

public class ArrayRotationLeft {
    static void rotateLeft(int[] arr, int rotations){
        //Calculating number of rotations
        rotations %= arr.length;
        //rotating the array <rotations> times
        for(int i = 1; i<=rotations; i++){
            //storing first element from the array
            int first = arr[0];
            //moving the array left one by one
            for (int j = 1; j<arr.length; j++)
                arr[j-1]= arr[j];
            //assigning the last element as first element
            arr[arr.length-1] = first;
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
        rotateLeft(list, k);
        printArray(list);
        in.close();
    }
}
