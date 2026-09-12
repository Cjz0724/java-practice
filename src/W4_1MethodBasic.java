/**
 * 【第 4 周】W4_1MethodBasic — 把计算抽成方法
 *
 * ■ 要求
 *   写 int add(int a, int b) 和 sub / mul / double div，在 main 里各调用一次。
 *
 * ■ 练的是
 *   方法定义、参数、return、方法调用
 *
 * ■ 验收标准
 *   add(3, 4)  → 7
 *   div(10, 4) → 2.5
 *
 * ■ 动手前先想
 *   1. 方法的四个部分分别是什么？（返回类型、方法名、参数列表、方法体）
 *   2. static 是什么意思？（现在先照写，第 5 周会讲清楚）
 *   3. **坑**：double div(int a, int b) 里如果写 return a / b; 会返回什么？
 *      这和 W2_4Type 的整数除法是同一个坑。怎么修？
 *
 * ■ 方法骨架（形状给你，逻辑自己填）
 *   static int add(int a, int b) {
 *       // 返回 a + b
 *   }
 *   static double div(int a, int b) {
 *       // 注意：两个 int 相除会丢小数，想办法让它变成小数除法
 *   }
 */
public class W4_1MethodBasic {
    public static void main(String[] args) {

        // 在 main 里各调用一次，打印结果

    }

    // 在这里写 add / sub / mul / div 四个方法

}
