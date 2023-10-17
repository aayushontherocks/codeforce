import java.util.Scanner;

public class Q4_1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        long count = 0;
        for (int i = 0; i < n - 1; ++i) {
            if (arr[i] > arr[i + 1]) {
                count += arr[i] - arr[i + 1];
                arr[i + 1] = arr[i];
            }
        }
        System.out.println(count);
    }
}
