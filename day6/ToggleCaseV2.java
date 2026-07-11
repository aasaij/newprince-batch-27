import java.util.Scanner;

public class ToggleCaseV2 {
     public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        //Method =2
        char[] arr = str.toCharArray();
        for (int i = 0; i<arr.length; i++){
            if (Character.isUpperCase(arr[i]))
                arr[i] = Character.toLowerCase(arr[i]);
            else if (Character.isLowerCase(arr[i]))
                arr[i] = Character.toUpperCase(arr[i]);
        }
        System.out.println(new String(arr));
        in.close();        
    }
}
