import java.util.Scanner;

/**
 * 第 1 周练习：区间奇偶统计器
 *
 * 题目：
 *   让用户输入两个整数 start 和 end，程序统计 [start, end] 这个闭区间里
 *   有多少个偶数、多少个奇数，并分别算出偶数的和、奇数的和，最后打印出来。
 *
 * 要求（每条都要做到）：
 *   1. 用 Scanner 让用户输入两个数。
 *   2. 用 for 循环从 start 走到 end（包含两端）。
 *   3. 循环里用 if / else 判断当前数字是偶数还是奇数，分别累加「个数」和「和」。
 *   4. 循环结束后把 4 个结果都打印出来。
 *   5. 全部用 int，不要用 long / double。
 *
 * 预期效果（示例，不是标准答案，只要结果对就行）：
 *   请输入起始数字: 1
 *   请输入结束数字: 10
 *   ---------- 统计结果 ----------
 *   偶数个数: 5   偶数之和: 30
 *   奇数个数: 5   奇数之和: 25
 *
 * 提示（自己查、自己想，不要抄网上整段代码）：
 *   - 偶数的判断：一个数能被 2 整除，就是它除以 2 的余数为 0。
 *     在 Java 里取余数的运算符是 %。
 *   - 累加要用「先定义变量、再在循环里不断往上加」的写法，
 *     变量必须在循环外面定义，否则每轮循环都会被清零。
 *   - 打印时字符串和变量拼在一起用 + 号，例如 "总和: " + sum
 *
 */
public class CountNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入起始数字: ");
        int start = scanner.nextInt();

        System.out.print("请输入结束数字: ");
        int end = scanner.nextInt();

        int evencount = 0;
        int oddcount = 0;
        int evensum = 0;
        int oddsum = 0;

        for (int i = start; i <= end; i++) {
            if (i%2==0) {
                evencount++;
                evensum += i;
            }else{
                oddcount++;
                oddsum += i;
            }
        }

        System.out.println("---------- 统计结果 ----------");
        System.out.println("偶数个数："+evencount);
        System.out.println("奇数个数："+oddcount);
        System.out.println("偶数之和："+evensum);
        System.out.println("奇数之和："+oddsum);
        scanner.close();
    }
}
