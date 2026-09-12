import java.util.Scanner;

public class W2_5LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("输入年份: ");
        int year = sc.nextInt();
        if((year % 4 == 0 && year % 100 != 0 ) || year % 400 == 0){
        System.out.println(year + " ture");
        }else {
        System.out.println(year + " false");
        }
    }

}
