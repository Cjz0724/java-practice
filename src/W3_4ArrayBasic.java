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
