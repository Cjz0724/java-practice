/**
 * 【第 3 周】W3_4ArrayBasic — 数组基本操作
 * <p>
 * ■ 要求
 * int[] arr = {5, 3, 9, 1, 7};
 * 依次打印：每个元素、长度、最大值、最小值、总和、平均值。
 * <p>
 * ■ 练的是
 * 数组声明、.length、arr[i]、遍历
 * <p>
 * ■ 验收标准
 * 长度 5 ｜ 最大 9 ｜ 最小 1 ｜ 总和 25 ｜ 平均 5.0
 * <p>
 * ■ 踩坑点
 * arr.length 是「属性」，不带括号；
 * String 的 .length() 是「方法」，带括号。别混。
 * <p>
 * ■ 动手前先想
 * 1. 求最大值时，初始值该取什么？（回想 W2_6MaxMin：不能凭空写 0）
 * 2. 遍历数组的 for 循环，条件写 i < arr.length 还是 i <= arr.length？为什么？
 * 3. 平均值要得到 5.0 而不是 5，注意什么？
 */
public class W3_4ArrayBasic {
    public static void main(String[] args) {

        int[] arr = {5, 3, 9, 1, 7};
        int sum = 0;

        int max = arr[0];
        int min = arr[0];

        if (arr[1] > max) max = arr[1];
        if (arr[2] > max) max = arr[2];
        if (arr[3] > max) max = arr[3];
        if (arr[4] > max) max = arr[4];

        if (arr[1] < min) min = arr[1];
        if (arr[2] < min) min = arr[2];
        if (arr[3] < min) min = arr[3];
        if (arr[4] < min) min = arr[4];

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            System.out.print(arr[i] + " ");
        }
        double avg = (double) sum / arr.length;
        System.out.println("长度" + arr.length + " / " + "最大" + max + " / " + "最小" + min + " / " + "总和" + sum + " / " + "平均" + avg);
    }
}
