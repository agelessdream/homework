package javase.day06.part1;
//需求：保存全班的每个组的成绩，并对成绩做统计
//1. 从键盘输入一共有几组
//2. 从键盘输入每一组分别有多少人
//3. 从键盘输入每一个同学的成绩
//4. 统计每一组的最高分、最低分
//5. 统计每一组的平均分
//6. 统计全班的最高分、最低分
//7. 统计全班的平均分
//8. 统计全班的总人数
import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入组数");
        int[][] score=new int[scanner.nextInt()][];
        int amountOfStudents=0;
        int totalClassScore=0;
        int classMin=0,classMax=0;
        for(int i=0;i<score.length;i++){
            System.out.println("请输入第"+(i+1)+"组的人数");
            score[i]=new int[scanner.nextInt()];
            amountOfStudents+=score[i].length;
        }
        int[] max=new int[score.length];
        int[] min=new int[score.length];
        double[] avg=new double[score.length];
        for(int i=0;i<score.length;i++){
            int totalTeamScore=0;
            for(int j=0;j<score[i].length;j++){
                System.out.println("请输入第"+(i+1)+"组的第"+(j+1)+"人的分数");
                score[i][j]=scanner.nextInt();
                totalTeamScore+=score[i][j];
                if(j==0){max[i]=min[i]=score[i][0];}
                else {
                    max[i] = Math.max(max[i], score[i][j]);
                    min[i] = Math.min(min[i], score[i][j]);
                }
            }
            avg[i]=totalTeamScore/(double)score[i].length;
            totalClassScore+=totalTeamScore;
            System.out.println("第"+(i+1)+"组的最高分为"+max[i]+",最低分为"+min[i]+",平均分为"+avg[i]+",人数为"+score[i].length);
            if(i==0) {
                classMin = min[i];
                classMax=max[i];
            }else{
                classMin=Math.min(classMin,min[i]);
                classMax=Math.max(classMax,max[i]);
            }
        }
        scanner.close();
        double classAvg=totalClassScore/(double)amountOfStudents;
        System.out.println("全班的最高分为"+classMax+"，最低分为"+classMin+"，平均分为"+classAvg+",人数为"+amountOfStudents);
    }
}
