import java.util.Scanner;

public class SecondMinimum {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        //Getting size of the list
        int n = in.nextInt();
        int min, smin;
        min = smin = Integer.MAX_VALUE;
        //getting list of integers
        for (int i = 1; i<=n; i++){
            int x = in.nextInt();
            if (min > x){
                smin = min;
                min =x;
            }
            else if (smin > x && x != min)
                smin = x;
        }
        System.out.println(smin);
        in.close();
    }
}
