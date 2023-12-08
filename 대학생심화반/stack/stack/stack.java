import java.util.Scanner;

public class stack {

    private static int[] stack;
    private static int size;
    public static void main(String[] args ) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        stack = new int[n];
        size = 0;

        for (int i = 0; i < n; i++) {
            String str = sc.next();
            switch (str) {

                case "push":
                    push(sc.nextInt());
                    break;

                case "pop":
                    pop();
                    break;

                case "size":
                    System.out.println(size);
                    break;

                case "empty":
                    empty();
                    break;

                case "top":
                    top();
                    break;
            }
        }
    }


    public static void push(int k) {
        stack[size++] = k;
    }
        public static void pop() {
            if (size > 0) {
                System.out.println(stack[size - 1]);
                size--;
            } else {
                System.out.println("-1");
            }
        }

        public static void empty() {
            if (size > 0) {
                System.out.println("0");
            } else {
                System.out.println("1");
            }
        }

        public static void top() {
            if (size > 0) {
                System.out.println(stack[size - 1]);
            } else {
                System.out.println("-1");
            }
        }
}
