import java.util.Scanner;

public class stack {
    public static void main(String[] args ) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long [] stack = new long[n];
        int si = 0;


        void push(int i) {
            stack[si++] = i;
        }

        void pop() {
            if (si == 0) {
                System.out.println(-1);
            }
            else {
                long m = stack[--si];
                stack[si] = 0;
                System.out.println(m);
            }
        }

        void size() {
            System.out.println(si);
        }
    }
}
