import java.util.Arrays;
import java.util.Scanner;

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
