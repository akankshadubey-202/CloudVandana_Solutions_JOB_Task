import java.util.HashMap;
import java.util.Scanner;
//Approach Is to use the HashMap to store the value of Roman Number corresponding integer number 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String roman = scanner.nextLine();
        scanner.close();
        int result = rtoi(roman);
        System.out.println(result);
    }

    public static int rtoi(String s) {
        HashMap<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);
        int result = 0;
        int prev = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int cur = roman.get(s.charAt(i));
            if (cur < prev) {
                result -= cur;
            } else {
                result += cur;
            }
            prev = cur;
        }

        return result;
    }
}
