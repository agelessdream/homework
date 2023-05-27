package day08.homework4;

public class Test {
    public static void meeting(Person...ps){
        for(int i=0;i<ps.length;i++){
            ps[i].eat();
            ps[i].toilet();
            if(ps[i] instanceof Man)((Man) ps[i]).smoke();
            if(ps[i]instanceof Women)((Women) ps[i]).makeup();
        }
    }

    public static void main(String[] args) {
        meeting(new Man(),new Women(),new Man());
    }
}
