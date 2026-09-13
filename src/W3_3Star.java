import java.util.Scanner;

public class W3_3Star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("打印多少行金字塔和多少行倒三角?：");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * (n - (i - 1)) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
}

