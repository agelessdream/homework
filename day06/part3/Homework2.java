package day06.part3;
//猴子吃桃子问题，猴子第一天摘下若干个桃子，当即吃了快一半，还不过瘾，又多吃了一个
//第二天又将仅剩下的桃子吃掉了一半，又多吃了一个。以后每天都吃了前一天剩下的一半多一个
//到第十天，只剩下一个桃子。试求第一天共摘了多少桃子？
public class Homework2 {
    static int peach(int last,int day){
        if(day==1) return last;
        return 2*(peach(last,day-1)+1);//感觉不太对劲
    }

    public static void main(String[] args) {
        System.out.println(peach(1,10));
    }
}
