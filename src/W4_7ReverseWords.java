/**
 * 【第 4 周】W4_7ReverseWords — 单词反转
 *
 * ■ 要求
 *   "hello java world" → "olleh avaj dlrow"
 *   （每个单词自己倒过来，单词之间的顺序不变）
 *
 * ■ 练的是
 *   split(" ")、字符串拼接、嵌套循环
 *
 * ■ 验收标准
 *   上面那组输入输出完全一致。
 *
 * ■ 动手前先想
 *   1. split(" ") 返回什么类型？（清单提示：第 3 周学的数组，这里就用上了）
 *   2. 外层要遍历什么？内层要遍历什么？
 *   3. 怎么把倒过来的单词再拼回一句话？（注意单词之间要有空格）
 *   4. 拼接字符串在循环里做，会不会每次都新建字符串？（第 6 周会讲 StringBuilder）
 *
 * ■ 需要查的东西
 *   String 的 split 方法：用法是 String[] parts = str.split(" ");
 */
public class W4_7ReverseWords {
    public static void main(String[] args) {

        String sentence = "hello java world";

        // 拆 → 逐个反转 → 拼回 → 打印

    }
}
