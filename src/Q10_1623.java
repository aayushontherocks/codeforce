import java.util.Scanner;

public class Q10_1623 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long sum = 0, ans = Long.MAX_VALUE;
        long[] arr = new long[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLong();
            sum += arr[i];
        }
        for (int i = 0; i < 1 << arr.length; i++) {
            long s = 0;
 
            for (int j = 0; j < arr.length; j++) {
                if ((i & 1 << j) >= 1)
                    s += arr[j];
            }
            long curr = Math.abs(sum - (s << 1));
            ans = Math.min(ans, curr);
        }
        System.out.println(ans);
    }
}
