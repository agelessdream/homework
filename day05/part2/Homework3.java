package day05.part2;
//案例需求：先从键盘输入本组学员的人数，再从键盘输入本组学员的姓名和成绩，显示学员姓名和成绩。
// 最后查找是否有满分(100)学员，如果有显示姓名，否则显示没有满分学员。
import java.util.Scanner;
public class Homework3 {
    String name;
    int score;
    public Homework3(String name, int score) {
        this.name = name;
        this.score = score;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生人数");
        int num = scanner.nextInt();
        Homework3[] students = new Homework3[num];
        for (int i = 0; i < num; i++) {
            System.out.println("请输入第" + (i + 1) + "个学生的姓名");
            String s = scanner.next();
            System.out.println("请输入第" + (i + 1) + "个学生的分数");
            int a = scanner.nextInt();
            students[i] = new Homework3(s, a);
        }
        scanner.close();
        System.out.println("全体成绩如下");
        for(int i = 0; i < num; i++){
            System.out.println(students[i].name+"\t"+students[i].score);
        }
        System.out.println();
        int count=0;//满分人数
        int[] index=new int[num];//用来存放满分学生的下标
        for(int i = 0; i < num; i++){
            if(students[i].score==100){
                index[count]=i;
                count++;
            }
        }
        if(count==0){
            System.out.println("无人满分");
        }else {
            System.out.println("以下学生满分");
            for (int i = 0; i < count; i++){
                System.out.print(students[index[i]].name+"\t");
            }
        }
    }
}
