public class MainDemo{
    public static void main(String[] args) {
        System.out.println("This Main with String[]");
        main(10);
    }
    public static void main(String args) {
        System.out.println("This is main with String");
    }
    public static void main(int x) {
        System.out.println("Main with one integer");
    }
    public static void main(int x, int y) {
        System.out.println("Main with two integers");
    }
}