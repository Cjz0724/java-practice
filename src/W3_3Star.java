import java.util.Scanner;

/**
 * 【第 3 周】W3_3Star — 三角形星星 ★本阶段第一次「自己推规律」
 * <p>
 * ■ 要求
 * 读 n，打印 n 行金字塔。再打印一个倒三角，再打印一个空心菱形。
 * <p>
 * ■ 练的是
 * 嵌套循环、找数学规律
 * <p>
 * ■ 验收标准
 * n = 4 时输出 4 行，第 1 行 1 颗星、第 4 行 7 颗星，整体居中：
 * *
 * ***
 * *****
 * *******
 * <p>
 * ■ 动手前先想（这题的价值全在这里）
 * 1. 第 i 行，前面要打几个空格？（提示：和 n、i 有关）
 * 2. 第 i 行，要打几颗星？（提示：1、3、5、7 —— 这是什么数列？用 i 怎么表示？）
 * 3. 空格那一层和星星那一层，是两个并列的循环，还是一个套一个？
 * 4. 倒三角和空心菱形，能不能复用你推出的规律？
 * <p>
 * ■ 提醒
 * 这题需要自己推出「第 i 行前面有几个空格」。推出来比抄十遍答案有用。
 * 推不出来就先在纸上画 n=4 和 n=5，把每行的空格数、星星数写成表格。
 */
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
        System.out.println();11111111111111
    }
}

