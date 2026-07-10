//Program to print first non-repeating value

import java.util.Scanner;

public class FirstNonRepeatingValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] list = new int[n];
        for (int i = 0;i<n; i++)
            list[i] = in.nextInt();
        for (int i = 0; i<n; i++){
            boolean found = false;
            //checking whether the ith value is there in  the reaminder list
            for (int j = i+1; j<n; j++)
                if (list[i]==list[j]){
                    found = true;
                    break;
                }
            //if not found
            if (!found){
                //ith value is non-repeating value
                System.out.println(list[i]);
                break;
            }
        }
        in.close();
    }
}
