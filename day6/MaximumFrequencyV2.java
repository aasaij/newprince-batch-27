import java.util.LinkedHashMap;
import java.util.Scanner;
public class MaximumFrequencyV2 {
    public static char maxFrequencyChar(String str) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (char c : str.toCharArray())
            map.put(c, map.getOrDefault(c,0)+1);
        int max = 0;
        char ans = ' ';
        for (char c : map.keySet()) {
            if (map.get(c) > max) {
                max = map.get(c);
                ans = c;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(maxFrequencyChar(str));
        in.close();
    }
}
