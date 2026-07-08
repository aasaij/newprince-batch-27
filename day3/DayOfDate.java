import java.util.Scanner;

public class DayOfDate {
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
        if (isValid(day, month, year)){
            //Applying Zeller's Rule to find day of date
            int f, D, C;
            if (month == 1 || month == 2){
                month+=10;
                year--;
            }
            else
                month = month - 2;
            D = year % 100;
            C = year / 100;
            f = (day + (13*month-1)/5 + D + D/4 + C/4 - 2*C)%7;
            if (f<0)
                f+=7;
            switch(f){
                case 0: System.out.println("Sunday"); break;
                case 1: System.out.println("Monday"); break;
                case 2: System.out.println("Tuesday"); break;
                case 3: System.out.println("Wednesday"); break;
                case 4: System.out.println("Thursday"); break;
                case 5: System.out.println("Friday"); break;
                case 6: System.out.println("Saturday"); break;
            }
        }
       in.close();     
    }
}
