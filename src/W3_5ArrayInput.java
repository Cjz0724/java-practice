import java.util.Scanner;

public class W3_5ArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("要输入几个数？：");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();

        for (int k = n - 1; k >= 0; k--) {
            System.out.print(arr[k] + " ");

        }

    }
}
