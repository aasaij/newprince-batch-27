//Program to print 

import java.util.Scanner;

public class FirstRepeatingValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] list = new int[n];
        for (int i = 0; i<n; i++)
            list[i] = in.nextInt();
        //finding first repeating element
        for (int i = 0; i<n; i++)
            for (int j = i+1; j<n; j++)
                if (list[i]==list[j]){
                    System.out.println(list[i]);
                    return;
                }
        in.close();
    }
}
