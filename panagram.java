import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
   public static boolean check(String s) {
        Set<Character> lset = new HashSet<>();//set to store the unique lower case

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                lset.add(ch);
            }
        }
        return lset.size() == 26;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        boolean Pangram = check(s.toLowerCase());

        if (Pangram) {
            System.out.println("The String is a pangram.");
        } else {
            System.out.println("The String is not a pangram.");
        }
    }

   
}
