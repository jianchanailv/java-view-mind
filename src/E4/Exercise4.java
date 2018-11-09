package E4;

/**
 * 写一个程序，使两个嵌套的for循环和取余操作符来探测和打印素数。
 */
public class Exercise4 {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                System.out.println(i);
            }
        }
    }

}
