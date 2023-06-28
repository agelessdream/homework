package javase.day05.part1;

import java.util.Scanner;

//案例需求：先从键盘输入本组学员的人数，再从键盘输入本组学员的姓名和成绩，最后统计：
//- 本组学员的平均分，
//- 低于平均分的学员人数，
//- 哪些学员低于平均分，
//- 最高分和最低分分别是谁。
public class Homework9 {
    String name;
    int score;

    public Homework9(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入学生人数");
        int num=scanner.nextInt();
        Homework9[] students=new Homework9[num];
        for(int i=0;i<num;i++){
            System.out.println("请输入第"+(i+1)+"个学生的姓名");
            String s=scanner.next();
            System.out.println("请输入第"+(i+1)+"个学生的分数");
            int a=scanner.nextInt();
            students[i]=new Homework9(s,a);
        }
        scanner.close();
        int minScore=students[0].score,maxScore=students[0].score,minIndex=0,maxIndex=0,totalScore=0;
        for(int i=0;i<num;i++){
            totalScore+=students[i].score;
            if(minScore>students[i].score){
                minScore=students[i].score;
                minIndex=i;
            }
            if(maxScore<students[i].score){
                maxScore=students[i].score;
                maxIndex=i;
            }
        }
        double averageScore=totalScore/num;
        System.out.println("最高分为"+students[maxIndex].name+":"+maxScore+"分");
        System.out.println("最低分为"+students[minIndex].name+":"+minScore+"分");
        System.out.println("平均分为"+averageScore);

        System.out.println("以下学生低于平均分");
        int count=0;
        for(int i=0;i<num;i++){
            if(students[i].score<averageScore){
                count++;
                System.out.println(students[i].name+":"+students[i].score+"分");
            }
        }
        System.out.println("共有"+count+"人低于平均分");
    }
}
