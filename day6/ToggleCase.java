import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        //Method =1
        char[] arr = str.toCharArray();
        for (int i = 0; i<arr.length; i++){
            if (arr[i]>='a' && arr[i]<='z'){
                arr[i] = (char)(arr[i]-32);
            }
            else if (arr[i]>='A' && arr[i]<='Z'){
                arr[i] = (char)(arr[i]+32);
            }
        }
        System.out.println(String.valueOf(arr));
        in.close();        
    }
}
