import java.util.Scanner;
/*
 **要求**：读一个 0–100 的整数成绩，按规则打印等级 + 一行评语。
        `90–100 → A`｜`80–89 → B`｜`70–79 → C`｜`60–69 → D`｜`0–59 → E`｜其他 → `成绩不合法`
        - **练的是**：`if / else if / else`、`&&`、`||`、比较运算符
- **验收**：
        - `95`→A　`60`→D　`59`→E
  - `90`→**A**（边界！90 是 A 不是 B）
        - `101`→成绩不合法　`-5`→成绩不合法
- **想一想**：`>= 90` 和 `> 90` 差在哪？拿 90 测一次就懂了。
*/

/**
 * 我的思路是先定义A、B、C、D、E，用if else语句判定分数符合哪个区间，再判定成绩合不合法，输出成绩等级
 **/
public class W2_1Score {
    public static void main(String[] args) {
        char level;

        Scanner sc = new Scanner(System.in);
        System.out.print("输入成绩: ");
        int score = sc.nextInt();
        if (100 >= score && score >= 90) {
            level = 'A';
            System.out.println(score + "→" + level + "→" + "你太强了");
        } else if (90 > score && score >= 80) {
            level = 'B';
            System.out.println(score + "→" + level + "→" + "再接再厉！");
        } else if (80 > score && score >= 70) {
            level = 'C';
            System.out.println(score + "→" + level + "→" + "进步空间大！");
        } else if (70 > score && score >= 60) {
            level = 'D';
            System.out.println(score + "→" + level + "→" + "要巩固基础！");
        } else if (60 > score && score >= 0) {
            level = 'E';
            System.out.println(score + "→" + level + "→" + "还得练！");
        } else
            System.out.println(score + "→" + "成绩不合法！");
    }
}