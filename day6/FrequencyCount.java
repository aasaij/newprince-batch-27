import java.util.LinkedHashMap;
import java.util.Scanner;

public class FrequencyCount {
    public static void frequencyCount(String str) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (char c : str.toCharArray())
            map.put(c, map.getOrDefault(c,0)+1);
        for (char c : map.keySet()) 
            System.out.println(c+" --> "+map.get(c));        
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        frequencyCount(str);
        in.close();
    }
}
