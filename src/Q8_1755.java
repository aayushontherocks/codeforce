import java.util.Scanner;

public class Q8_1755 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] count = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            count[c - 'A']++;
        }
 
        char[] palindrome = new char[str.length()];
        int palindromeIndex = 0;
        char oddCharacter = '\0';
 
        for (int i = 0; i < 26; i++) {
            if (count[i] % 2 == 1) { 
                if (oddCharacter != '\0') {
                    System.out.println("NO SOLUTION");
                    return;
                }
                oddCharacter = (char) (i + 'A');
            }
            for (int j = 0; j < count[i] / 2; j++) {
                char c = (char) (i + 'A');
                palindrome[palindromeIndex] = c;
                palindromeIndex++;
            }
        }
 
        StringBuilder result = new StringBuilder();
 
        for (int i = 0; i < palindromeIndex; i++) {
            result.append(palindrome[i]);
        }
 
        if (oddCharacter != '\0') {
            result.append(oddCharacter);
        }
 
        for (int i = palindromeIndex - 1; i >= 0; i--) {
            result.append(palindrome[i]);
        }
 
        System.out.println(result.toString());
    }
}
