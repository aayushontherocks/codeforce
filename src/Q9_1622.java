import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Q9_1622 {
    static ArrayList<String> list = new ArrayList<String>();
 
    static void permutation(String s, String ans) {
        if (s.length() == 0) {
            list.add(ans);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            permutation(s.substring(0, i) + s.substring(i + 1), ans + s.charAt(i));
        }
    }
    static void dupes(){
 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c[] = sc.nextLine().toCharArray();
        Arrays.sort(c);
        String s = new String(c);
        permutation(s, "");
        List<String> a=list.stream().distinct().collect(Collectors.toList());
        System.out.println(a.size());
        for (String n : a) {
            System.out.println(n);
        }
    }
}
