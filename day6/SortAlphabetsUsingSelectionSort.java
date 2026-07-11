import java.util.Scanner;
//Program to sort alphabets using selection sort algorithm
public class SortAlphabetsUsingSelectionSort {
    static String selectionSort(String str) {
        char arr[] = str.toCharArray();
        for (int i =0; i<str.length()-1;i++){
            //assuming the ith character is the least characters
            int minIndex = i;
            //finding least character from the remaining characters
            for (int j = i+1; j<str.length(); j++){
                //checking whether the assumption is correct or not
                if (arr[minIndex]>arr[j])
                    //if not correct
                    minIndex = j;
            }
            if (minIndex != i){
                //swapping the characters
                char temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
        return String.valueOf(arr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(selectionSort(str));
        sc.close();        
    }
}
