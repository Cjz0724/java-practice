/**
 * 【第 4 周】W4_3IsPrime — 判断素数
 *
 * ■ 要求
 *   写 static boolean isPrime(int n)，打印 1–100 之间所有素数。
 *
 * ■ 练的是
 *   boolean 返回值、循环 + break、提前 return
 *
 * ■ 验收标准
 *   1–100 之间有 25 个素数，最小 2，最大 97
 *
 * ■ 动手前先想
 *   1. 什么叫素数？（只能被 1 和它自己整除，且大于 1）
 *      所以 1 不是素数，2 是素数。
 *   2. 判断 n 是不是素数，要从几开始试除、试到几为止？
 *   3. 一旦发现能整除，还用继续试吗？（break 还是 return false）
 *   4. 循环写到 n、n/2、还是 Math.sqrt(n)？三种都试，想想效率差在哪。
 *
 * ■ 方法骨架
 *   static boolean isPrime(int n) {
 *       // 返回 true / false
 *   }
 *
 * ■ 提醒
 *   boolean 方法必须每条路径都有 return，否则编译报 missing return statement。
 */
public class W4_3IsPrime {
    public static void main(String[] args) {

        // 遍历 1–100，是素数的就打印出来，最后统计个数

    }

    // static boolean isPrime(int n) { ... }

}
