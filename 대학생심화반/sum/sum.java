import java.util.Scanner;
import java.util.*;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] A = new int[N];

        for (int i = 0; i<N; i++) {
            A[i] = sc.nextInt();
        }


        int num = 0;
        int sum = 0;

        for (int j = 0; j<N; j++) {
            sum = 0;
            for (int i = j; i < N; i++) {
                sum += A[i];
                if (sum == M) {
                    num += 1;
                    sum = 0;
                    break;
                } else if (sum > M) {
                    sum=0;
                    break;
                }
            }
        }
        System.out.println(num);
    }
}
