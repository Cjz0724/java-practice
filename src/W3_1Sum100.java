public class W3_1Sum100 {
    public static void main(String[] args) {
        double sum = 0;

        for (int i = 1; i <= 100; i++) {
                sum += i;
        }
        System.out.println("1到100的和为：" + sum + ",平均值为：" + sum/100);
    }
}
