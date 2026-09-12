import javax.security.auth.Subject;
import java.util.Scanner;

public  class Review2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入用户名和密码(用空格隔开)");
        String users = sc.nextLine();

        int p = users.indexOf(' ');


        Boolean hasLetter;
        Boolean hasDigit;
        hasLetter = false;
        hasDigit = false;

        if (p == -1) {
            System.out.println("用户名和密码不能为空！");
        } else {
            String name = users.substring(0, p);
            String password = users.substring(p + 1);

            for (int i = 0; i < password.length(); i++) {
                char ch = password.charAt(i);
                if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                    hasLetter = true;
                } else if (ch >= '0' && ch <= '9') {
                    hasDigit = true;
                }
            }
            if (name.isEmpty() || password.isEmpty()) {
                System.out.println("用户名和密码不能为空！");
            } else if (password.length() < 8) {
                System.out.println("密码太短！");
            } else if (password.contains(name)) {
                System.out.println("密码不能包含用户名");
            } else if (hasLetter && hasDigit) {
                System.out.println("强密码！");
            } else {
                System.out.println("弱密码！");
            }
        }
    }
}