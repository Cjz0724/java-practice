import java.util.Arrays;
import java.util.Scanner;

/**
 * 【第 3 周】W3_7Reverse — 数组原地反转
 * <p>
 * ■ 要求
 * {1,2,3,4,5} → {5,4,3,2,1}
 * **不许用第二个数组**，只能交换。
 * <p>
 * ■ 练的是
 * 双指针（一个从头、一个从尾）、交换变量
 * <p>
 * ■ 验收标准
 * {1,2,3,4,5} → {5,4,3,2,1}
 * {1,2,3,4}   → {4,3,2,1}
 * <p>
 * ■ 动手前先想
 * 1. 交换 arr[i] 和 arr[j] 要用到第 2 周学的什么？（临时变量）
 * 2. i 和 j 分别从哪里开始？每次怎么移动？
 * 3. 循环条件写 i < arr.length 还是 i < arr.length / 2？
 * —— 清单提示：先写错的那版跑一次，看是不是又变回原样了。
 * 4. 为什么奇数个元素时（{1,2,3}）中间那个不用动？
 */
public class W3_7Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("数组有几个元素？");

        int n = sc.nextInt();
        int[] arr = new int[n];
        int i = 0;
        int j = n - 1;

        System.out.println("录入数组元素！");

        for (int k = 0; k < n; k++) {
            arr[k] = sc.nextInt();
        }

        System.out.print("原数组:");
        System.out.println(Arrays.toString(arr));

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        System.out.print("新数组:");
        System.out.println(Arrays.toString(arr));

    }
}
