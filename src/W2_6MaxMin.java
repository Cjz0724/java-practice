import java.util.Scanner;

public class W2_6MaxMin {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("输入a的大小：");
        int a = sc.nextInt();
        System.out.println("输入b的大小：");
        int b = sc.nextInt();
        System.out.println("输入c的大小：");
        int c = sc.nextInt();

       if(a>b){
           if(a>c){
               System.out.println("max " + a);
               if(b>c){
                   System.out.println("min " + c);
               }else {
                   System.out.println("min " + b);
               }
           }else{
               System.out.println("max " + c);
               System.out.println("min " + b);
           }
       }else{
           if(b>c){
               System.out.println("max " + b);
               if(a>c){
                   System.out.println("min " + c);
               }else  {
                   System.out.println("min " + a);
               }
           }else {
               System.out.println("max " + c);
               System.out.println("min " + a);
           }
       }
    }
}
