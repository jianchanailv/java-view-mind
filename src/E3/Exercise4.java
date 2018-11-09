package E3;

import java.util.Random;

/**
 * 编写一个计算速度的程序，它所使用的距离和时间都是常量
 */
public class Exercise4 {
    public static void main(String[] args) {
        Random random = new Random();
        float s = random.nextInt(100);
        float t = random.nextInt(100) + 1;
        float v = s / t;
        System.out.println("s=" + s + ", t=" + t + "," + "s / t = " + v);
    }
}
