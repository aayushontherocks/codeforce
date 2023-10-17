import java.util.*;
class Q2_1803{
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean given = false;
        int[] arr = new int[n];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == n)
                given = true;
        }
        if (!given)
            arr[n - 1] = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for (int i = 0; i < n - 1; i++) {
            if ((arr[i + 1] - arr[i]) > 1) {
                System.out.print(arr[i] + 1);
                break;
            }
        }
    }
}