import java.util.Scanner;

public class DateValid {
    static boolean isValid(int d, int m, int y){
        if (d>31 || d < 1 || m > 12 || m < 1 || y < 1)
            return false;
        switch(m){
            case 4,6,9,11:
                if (d>30) return false;
                break;
            case 2:
                if(y % 400 == 0 || (y%4==0 && y%100!=0)){
                    if (d>29) return false;
                }
                else if (d>28) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int day = in.nextInt();
        int month = in.nextInt();
        int year = in.nextInt();
        if(isValid(day, month, year))
            System.out.println("Valid");
        else
            System.out.println("Invalid");
        in.close();
    }
}
