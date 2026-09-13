/**
 * 【第 3 周】W3_2Multi — 九九乘法表
 * <p>
 * ■ 要求
 * 打印 9×9 乘法表，三角形（第 1 行 1 列，第 9 行 9 列）。
 * <p>
 * ■ 练的是
 * 嵌套循环、print 不换行
 * <p>
 * ■ 验收标准（形状）
 * 1*1=1
 * 1*2=2  2*2=4
 * 1*3=3  2*3=6  3*3=9
 * ...
 * <p>
 * ■ 动手前先想（关键）
 * 1. 一共几行？外层循环管什么？内层循环管什么？
 * 2. 第 i 行要打印几列？（清单提示：内层写 j <= 9 还是 j <= i，两个都试一次）
 * 3. print 和 println 的区别是什么？哪一层用 print、哪一层用 println？
 * 4. 每个算式之间要留空隙，用什么方式加？
 */
public class W3_2Multi {
    public static void main(String[] args) {
        for (int i=1 ; i <= 9;i++){
            for(int j=1 ; j<=i; j++){
                System.out.print(j+"*"+i+ "=" + i*j + " ");
            }
            System.out.println();
        }

    }
}
