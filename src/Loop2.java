import java.util.Scanner;

public class Loop2 {
    public static void main(String[] args) {
        int evencount = 0;
        int oddcount = 0;
        int evensum = 0;
        int oddsum = 0;
        int sum = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("请输入初始数字：");
        int n = sc.nextInt();

        System.out.print("请输入最终数字：");
        int m = sc.nextInt();

        for (int i = n; i <= m; i++) {



            if(i%2==0){
                evencount++;
                evensum += i;
            }
            else if(i%2==1){
                oddcount++;
                oddsum += i;
            }
            sum += i;
        }
        System.out.println("偶数个数："+evencount);
        System.out.println("奇数个数："+oddcount);
        System.out.println("偶数之和："+evensum);
        System.out.println("奇数之和："+oddsum);
        System.out.println("总和："+sum);
    }
}
