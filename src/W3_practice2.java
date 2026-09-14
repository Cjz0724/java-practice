import java.util.Scanner;

public class W3_practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("选票票数：");
        int a = sc.nextInt();
        int[] ticket = new int[a];
        int fake = 0;
        int[] count = new int[3];

        for (int i = 0; i < ticket.length; i++) {
            ticket[i] = sc.nextInt();
        }
        for (int i : ticket) {
            if (i > 3 || i < 1) fake++;
            switch (i) {
                case 1:
                    count[0]++;
                    break;
                case 2:
                    count[1]++;
                    break;
                case 3:
                    count[2]++;
                    break;
            }
        }
        int max = 0;
        int winner = 0;
        for (int k = 1; k <= 3; k++) {
            if (count[k - 1] > max) {
                max = count[k - 1];
                winner = k;
            }
        }

        int tie = 0;
        for (int k = 1; k <= 3; k++) {
            if (count[k - 1] == max) tie++;
        }

        System.out.println("1号" + count[0] + "|2号" + count[1] + "|3号" + count[2] + "|废票" + fake + "|");
        if (tie > 1) {
            System.out.println("平局");
        } else {
            System.out.println("赢家" + winner + "号");
        }
    }
}
