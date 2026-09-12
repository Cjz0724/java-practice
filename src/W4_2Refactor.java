/**
 * 【第 4 周】W4_2Refactor — 把已有代码改造成方法（重构）
 *
 * ■ 要求
 *   把 W3_4ArrayBasic 里的「求最大值」抽成 static int max(int[] arr)，在 main 里调用。
 *
 * ■ 练的是
 *   数组当参数、static 方法、重构的思路
 *
 * ■ 验收标准
 *   功能完全不变：长度 5 ｜ 最大 9 ｜ 最小 1 ｜ 总和 25 ｜ 平均 5.0
 *
 * ■ 这题的意义
 *   这叫「重构」——**功能不变，结构变好**。你已经会写它，只是换个组织形式。
 *
 * ■ 动手前先想
 *   1. 参数写成 int[] arr 时，方法里怎么知道数组有多长？（arr.length）
 *   2. 求最大值的循环，从下标几开始？（提示：初始值取了 arr[0] 之后）
 *   3. 除了 max，min 和 sum 也能抽成方法吗？抽出来之后 main 会变成什么样？
 *
 * ■ 前提
 *   先把 W3_4ArrayBasic 写通，再回来做这题。
 */
public class W4_2Refactor {
    public static void main(String[] args) {

        int[] arr = {5, 3, 9, 1, 7};

        // 调用你自己写的 max(arr) 等方法，打印全部结果

    }

    // static int max(int[] arr) { ... }

}
