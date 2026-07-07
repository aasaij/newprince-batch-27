import java.util.Scanner;
//Program to find least element from list of integers
public class FindMinimumElement {
     public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();// Getting the size of list
        //Getting the first element
        int x = in.nextInt();
        int minElement = x;
        for (int i = 2;i<=n; i++){
            //Getting the next element
            x = in.nextInt();
            //checking the previous elemet is greater than the new element
            if (minElement < x)
                //if so new element becomes minElement
                minElement = x;
        }
        System.out.println(minElement);
        in.close();
    }
}
