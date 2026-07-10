import java.util.Scanner;

public class Diamond {
    /*
    Program to print the following pattern
    test
       tt
      tete
     testes
    testtest
     testes
      tete
       tt    
    */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int len = str.length();
        for (int i = 1; i<=len;i++){
            String format = "%"+len+"."+i+"s%-"+len+"."+i+"s";
            System.out.println(String.format(format, str, str));
        }
        for (int i = len-1; i>=1;i--){
            String format = "%"+len+"."+i+"s%-"+len+"."+i+"s";
            System.out.println(String.format(format, str, str));
        }
      
        in.close();            
    }
}
