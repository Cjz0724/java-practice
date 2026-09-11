import java.util.Scanner;

public class W2_2Calc {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("输入第一个数字:");
        double a = sc.nextDouble();
        System.out.print("输入第二个数字:");
        double b = sc.nextDouble();

        System.out.print("输入运算符：");
        String operation = sc.next();
        char c = operation.charAt(0);

      switch (c) {
            case '+':
              System.out.println("计算结果为：" + (a + b));
                break;
            case '-':
                System.out.println("计算结果为：" + (a - b));
                break;
            case '*':
                System.out.println("计算结果为：" + a * b);
                break;
            case '/':
                if (b == 0){
                    System.out.println("除数不能为零！");
                }else {
                System.out.println("计算结果为：" + a / b);
                }
                break;
            default:
             System.out.println("不认识运算符："+ c );
        }

    }
}

