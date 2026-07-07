import java.util.Scanner;
public class FindMaximumElement{
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();// Getting the size of list
        //Getting the first element
        int x = in.nextInt();
        int maxElement = x;
        for (int i = 2;i<=n; i++){
            //Getting the next element
            x = in.nextInt();
            //checking the previous elemet is lesser than the new element
            if (maxElement < x)
                //if so new element becomes maxElement
                maxElement = x;
        }
        System.out.println(maxElement);
    }
}