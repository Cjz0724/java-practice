import java.util.Scanner;

public class W3_6SecondMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("数组里几个数？：");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("数组元素录入！");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("数组录入完成！");

        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int j : arr) {
            if (j > max) {
                second = max;
                max = j;
            } else if (j > second) {
                second = j;
            }
        }

        int maxCount = 0;
        for (int k : arr) {
            if (k == max) maxCount++;
        }

        if (maxCount == arr.length) {
            System.out.println("没有第二大");
        } else if (second == max) {
            System.out.println("第二大是：" + max);
        } else {
            System.out.println("第二大是：" + second);
        }
    }
}
