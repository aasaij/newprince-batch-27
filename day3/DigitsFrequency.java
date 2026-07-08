public class DigitsFrequency {
    public static void main(String[] args) {
        long num = new java.util.Scanner(System.in).nextLong();
        int freq[] = new int[10];
        while (num != 0){
            int digit =(int) (num % 10);
            freq[digit]++;
            num = num / 10;
        }
        for (int i = 0; i<10; i++)
            if (freq[i] != 0)
                System.out.println(i + " -> " + freq[i]);
    }
}
// 9943115155

// 9 -> 2
// 4 -> 1
// 3 -> 1
// 1 -> 3
// 5 -> 3

// Shall we Start?