import java.util.Arrays;
import java.util.Scanner;

public class W3_practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入几个成绩？：");
        int n = sc.nextInt();
        int[] arr = new int[n];


        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("n=" + n + Arrays.toString(arr));

        int fake = 0;
        int max = 0;
        int min = 0;
        double avg;
        double sum = 0;
        double passnum = 0;
        double sumnum = 0;
        double pass;
        int[] level = new int[5];
        int idx;

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] >= 0 && arr[j] <= 100) {
                if (arr[j] >= 90) {
                    idx = 0;
                    level[idx]++;
                }//A
                else if (arr[j] >= 80) {
                    idx = 1;
                    level[idx]++;
                }//B
                else if (arr[j] >= 70) {
                    idx = 2;
                    level[idx]++;
                }//C
                else if (arr[j] >= 60) {
                    idx = 3;
                    level[idx]++;
                }//D
                else {
                    idx = 4;
                    level[idx]++;
                }//E
                if (arr[j] > max) {
                    max = arr[j];
                }
                if (arr[j] < min) {
                    min = arr[j];
                }
                sum += arr[j];
                sumnum++;

                if (arr[j] >= 60) {
                    passnum++;
                }
            } else {
                fake++;
            }
        }
        pass = (passnum / sumnum) * 100;
        avg = sum / sumnum;
        if (sumnum!=0)System.out.println("无效个数："+fake+",最高分："+max+",最低分："+min+",平均分："+avg+",及格率："+pass +"%"+",A档人数："+level[0]);
        else System.out.println("没有有效成绩！");
    }
}


