package day02;

public class Color {
    public static void main(String[] args) {
        int color=0x7f6c8a;
        int red=color>>16;
        int green=(color-red*0x10000)>>8;
        int blue=(color-red*0x10000-green*0x100);

        System.out.println(Integer.toHexString(red));
        System.out.println(Integer.toHexString(green));
        System.out.println(Integer.toHexString(blue));
    }
}
