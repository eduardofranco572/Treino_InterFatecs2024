import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ql = sc.nextInt();
        int qc = sc.nextInt();
        int l = sc.nextInt();
        int c = sc.nextInt();

        long[][] m = new long[ql][qc];
        for (int i = 0; i < ql; i++) {
            for (int j = 0; j < qc; j++) {
                if(i == 0) {
                    m[i][j] = 0;
                } else if (j == qc-1) {
                    m[i][j] = 1;
                } else if (i == ql-1) {
                    m[i][j] = 2;
                } else if (j == 0) {
                    m[i][j] = 3;
                } else {
                    m[i][j] = m[i-1][j] + m[i][j-1] + m[i-1][j-1];
                }
            }
        }
        System.out.println(m[l-1][c-1]);
        sc.close();
    }
}