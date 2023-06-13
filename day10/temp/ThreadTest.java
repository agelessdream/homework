package day10.temp;

public class ThreadTest {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(111);
            }
        }).start();

        new Thread(){
            @Override
            public void run() {
                System.out.println(222);
            }
        }.start();

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println(333);
//            }
//        }){
//            @Override
//            public void run() {
//                System.out.println(444);
//            }
//        }.start();
    }
}
