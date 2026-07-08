import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] list = new int[n];
        for (int i =0; i<n; i++)
            list[i] = in.nextInt();
        //Printing unique elements
        for (int i = 0; i<n; i++){
            boolean found = false;
            for (int j = i-1; j>=0; j--)
                if (list[j]==list[i]){
                    found = true;
                    break;
                }
            System.out.print( found?"":list[i]+" ");
        }
        in.close();
    }
}
