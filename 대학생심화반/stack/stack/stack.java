import java.util.Scanner;

public class stack {

    private static int[] stack;
    private static int size;
    public static void main(String[] args ) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();
        stack = new int[n];
        size = 0;

        for (int i = 0; i < n; i++) {
            String str = sc.next();
            switch (str) {

                case "push":
                    stack[size++] = sc.nextInt();
                    break;

                case "pop":
                    if (size > 0) {
                        sb.append(stack[size - 1]).append('\n');
                        size--;
                    } else {
                        sb.append(-1).append('\n');
                    }
                    break;

                case "size":
                    sb.append(size).append('\n');
                    break;

                case "empty":
                    if (size > 0) {
                        sb.append(0).append('\n');
                    } else {
                        sb.append(1).append('\n');
                    }
                    break;

                case "top":
                    if (size > 0) {
                        sb.append(stack[size-1]).append('\n');
                    } else {
                        sb.append(-1).append('\n');
                    }
                    break;
            }
        }
        System.out.println(sb);
    }


   /** public static void push(int k) {
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
        }**/
}
