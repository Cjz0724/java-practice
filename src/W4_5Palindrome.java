/**
 * 【第 4 周】W4_5Palindrome — 回文判断
 *
 * ■ 要求
 *   判断字符串是否回文。用「双指针」（一个从头、一个从尾，向中间走），
 *   **不许反转再比较**。
 *
 * ■ 练的是
 *   charAt()、双指针、while 循环、字符比较
 *
 * ■ 验收标准
 *   level  → true
 *   hello  → false
 *   abccba → true
 *   a      → true
 *   空串   → true
 *
 * ■ 提示
 *   char 比较直接用 == 就行，不用 equals（equals 是给 String 用的）。
 *
 * ■ 动手前先想
 *   1. 两个指针 i 和 j 分别从哪开始？
 *   2. 循环什么时候停？（i < j 还是 i <= j？两者差在哪）
 *   3. 什么时候能立刻判定「不是回文」？
 *   4. 长度为奇数的字符串（level），中间的字符需要比较吗？
 *
 * ■ 和第 3 周的联系
 *   这题的指针思路和 W3_7Reverse 一模一样，只是比较字符而不是交换。
 */
public class W4_5Palindrome {
    public static void main(String[] args) {

        // 读一个字符串，判断并打印 true / false

    }
}
