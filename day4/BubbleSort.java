//Program to sort an array using bubble sort algorithm

import java.util.Scanner;

public class BubbleSort {
    static void bubbleSort(int[] arr){
        //implementing bubble sorting algorithm
        for(int i = 1; i<=arr.length-1;i++){
            for (int j = 0; j<arr.length-i;j++)
                if (arr[j]>arr[j+1])
                    //swapping neibouring values
                    arr[j] = (arr[j]+arr[j+1]) - (arr[j+1]=arr[j]);
                    // {
                    //     int temp = arr[j];
                    //     arr[j]= arr[j+1];
                    //     arr[j+1] = temp;
                    // }
        }
    }
    static void printArray(int[] list){
        for (int data : list)
            System.out.print(data + " ");
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] list=new int[n];
        for (int i = 0;i<n; i++)
            list[i] = in.nextInt();
        bubbleSort(list);
        printArray(list);
        in.close();
    }
}
