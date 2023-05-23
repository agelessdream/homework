package day05.part1;

public class Homework8 {
    public static void main(String[] args) {
        String s="pneumonoultramicroscopicsilicovolcanoconiosis";
        char[] c=s.toCharArray();
        int[] frequency=new int[26];
        for(int i=0;i<c.length;i++){
            frequency[c[i]-97]++;
        }
        int max=frequency[0];int index=0;
        for(int i=0;i<frequency.length;i++){
            if(max<frequency[i]){
                max=frequency[i];
                index=i;
            }
            if(frequency[i]!=0){
                char letter=(char)(i+97);
                System.out.println(letter+":"+frequency[i]+"次");
            }
        }
        char letter=(char)(index+97);
        System.out.println("字母"+letter+"出现次数最多，出现了"+max+"次");
    }
}
