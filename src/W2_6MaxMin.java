import java.util.Scanner;

public class W2_6MaxMin {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("输入a的大小：");
        int a = sc.nextInt();
        System.out.println("输入b的大小：");
        int b = sc.nextInt();
        System.out.println("输入c的大小：");
        int c = sc.nextInt();

        int max = a;
        int min = a;

        if (b > max) max = b;
        if (c > max) max = c;
        if (b < min) min = b;
        if (c < min) min = c;

        System.out.println("最大值= " + max + "，最小值= " + min);
    }
}
