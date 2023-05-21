package temp;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        String username, password;
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        for (; ; ) {
            System.out.println("请输入用户名");
            username = scanner.next();
            System.out.println("请输入密码");
            password = scanner.next();
            if (username.equals("张三") && "123".equals(password)) {
                break;
            }
        }
        scanner.close();
    }
}
