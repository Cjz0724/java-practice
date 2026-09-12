/**
 * 【第 4 周】W4_4StringBasic — 字符串基础
 *
 * ■ 要求
 *   读一个字符串，打印：长度、第一个字符、最后一个字符、全大写、全小写、是否以 "ing" 结尾。
 *
 * ■ 练的是
 *   length()、charAt()、toUpperCase()、toLowerCase()、endsWith()
 *
 * ■ 验收标准
 *   输入 Testing → 长度 7 ｜ 首 T ｜ 尾 g ｜ TESTING ｜ testing ｜ true
 *
 * ■ 踩坑点
 *   String 是**不可变**的（immutable）：
 *   str.toUpperCase() 不会改变 str 本身，它返回一个**新的字符串**。
 *   所以要么打印返回值，要么用变量接住：String upper = str.toUpperCase();
 *
 * ■ 动手前先想
 *   1. 最后一个字符的下标是几？（提示：和 length() 的关系）
 *   2. 如果字符串是空的（""），charAt(0) 会发生什么？（自己试一次）
 */
public class W4_4StringBasic {
    public static void main(String[] args) {

        // 先读一个字符串，再逐项打印

    }
}
