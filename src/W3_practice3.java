import java.util.Arrays;
import java.util.Scanner;

public class W3_practice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("输入几个数？：");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("数组：" + Arrays.toString(arr) + " " + "(n=" + n + ")");

        System.out.print("读一个目标值：");
        int x = sc.nextInt();
        boolean found = false;
        int sum = 0;

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == x) {
                sum++;
                found = true;
                System.out.print(j + " ");
            }
        }
        System.out.print("出现" + sum + "次");
        if (!found) {
            System.out.println(",没找到");
        }


    }
}
