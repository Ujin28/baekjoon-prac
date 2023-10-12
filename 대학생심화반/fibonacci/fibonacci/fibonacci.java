import java.util.*;
import java.util.Scanner;
import java.io.*;


public class fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = in.nextInt();
        //int n = Integer.parseInt(br.readLine());
        long[] fi = new long[n+1];
        fi[0] = 0;
        fi[1] = 1;

        for (int i = 2; i < n + 1; i++) {
            fi[i] = fi[i - 2] + fi[i - 1];
        }

        System.out.print(fi[n]);

    }
}
