import java.util.Scanner;
import java.util.*;


public class tree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        long[] height = new long[N];
        long result=0;

        for (int i = 0; i<N;i++) {
            height[i] = scanner.nextInt();
        }
        Arrays.sort(height);

        scanner.close();

        long min = 0;
        long max = height[N - 1];

        while (min < max) {
            long sum = 0;
            long mid = (min + max) / 2;

            for (long tree : height) {
                if (tree >mid) {
                    sum += tree - mid;
                }
            }
            //if (sum == M) {
              //  result = mid;
            //}
            if (sum >= M) {
                min = mid + 1;
                if (mid >= result)
                    result = mid;
            } else {
                max = mid;
            }
        }

        System.out.println(result);
    }

}
