import java.util.Scanner;

/**
 * 【第 3 周】W3_1Sum100 — 累加与平均值
 *
 * ■ 要求
 *   算 1 到 100 的和，并打印平均值（保留 1 位小数）。
 *
 * ■ 练的是
 *   for 循环、累加、double 类型转换
 *
 * ■ 验收标准
 *   和 = 5050
 *   平均值 = 50.5
 *
 * ■ 注意（坑）
 *   如果平均值算出 50.0，回去看 W2_4Type —— 又是整数除法。
 *   sum 是 int，100 是 int，int / int 的结果还是 int，小数会被砍掉。
 *
 * ■ 动手前先想
 *   1. 累加变量要在循环外面定义，为什么？
 *   2. 怎么让「两个 int 相除」得到小数？（提示：和 W2_4Type 第 2 个打印项同一个办法）
 *   3. 保留 1 位小数，是用格式化还是用 Math.round？两种都可以，各有什么麻烦？
 */
public class W3_1Sum100 {
    public static void main(String[] args) {
        double sum = 0;

        for (int i = 1; i <= 100; i++) {
                sum += i;
        }
        System.out.println("1到100的和为：" + sum + ",平均值为：" + sum/100);
    }
}
