import java.util.Scanner;

/**
 * 【第 3 周】W3_5ArrayInput — 让用户输入数组
 *
 * ■ 要求
 *   先问「要输入几个数」，再依次读入存进数组，最后「倒序」打印。
 *
 * ■ 练的是
 *   new int[n]、循环读入、i--
 *
 * ■ 验收标准
 *   个数 3、输入 10 20 30 → 打印 30 20 10
 *
 * ■ 踩坑点
 *   new int[n] 里的 n 必须已经读到了 —— 顺序不能反（先读 n，再创建数组）。
 *
 * ■ 动手前先想
 *   1. 读入用哪个循环？
 *   2. 倒序打印，循环从哪里开始、到哪里结束、每次怎么变？
 *   3. 如果倒序时写成 for (int i = 0; i < n; i++)，打印顺序会是什么？
 */
public class W3_5ArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("要输入几个数？：");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
             arr[i] = sc.nextInt();
        }
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
        System.out.println();

        for(int k = n-1; k >= 0; k--){
            System.out.print(arr[k]+" ");

        }

    }
}
