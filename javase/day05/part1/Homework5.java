package javase.day05.part1;

//数组是否对称
public class Homework5 {
    static boolean isSymmetrical(int[] arr) {
        boolean b = true;
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                b = false;
                break;
            }
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println(isSymmetrical(new int[]{1, 2, 1}));
        System.out.println(isSymmetrical(new int[]{0, 2, 1}));
        System.out.println(isSymmetrical(new int[]{3, 2, 1, 2, 3}));
        System.out.println(isSymmetrical(new int[]{3, 2, 1, 1, 2, 3}));
        System.out.println(isSymmetrical(new int[]{-100, 70, 70, 100}));

    }
}
