import java.util.Scanner;

public class SecondMaximum {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        //Getting size of the list
        int n = in.nextInt();
        int max, smax;
        max = smax = Integer.MIN_VALUE;
        //getting list of integers
        for (int i = 1; i<=n; i++){
            int x = in.nextInt();
            if (max < x){
                smax = max;
                max =x;
            }
            else if (smax < x && x != max)
                smax = x;
        }
        System.out.println(smax);
        in.close();
    }
}
