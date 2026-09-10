import java.util.Scanner;

public class Loop1 {
    public static void main(String[] args) {

        int sum = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("请输入起始数字：");
        int n = sc.nextInt();

        System.out.print("请输出最终数字：");
        int m = sc.nextInt();

        for (int i = n; i <= m; i++) {

            System.out.println(i);

            sum += i;
        }
        System.out.println("和 = " + sum);
    }
}
