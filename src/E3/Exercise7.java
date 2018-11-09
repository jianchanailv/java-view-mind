package E3;

import java.util.Random;

/**
 * 编写一个程序模拟扔硬币的结果
 */
public class Exercise7 {
    public static void main(String[] args) {
        Random random = new Random();
        int face = 0;
        int back = 0;
        for (int i = 0;i<10000;i++){
            int a = random.nextInt(2);
            if(a==0) {
                System.out.println("正面");
                face++;
            }else {
                System.out.println("反面");
                back++;
            }
        }
        System.out.println("正面" + face + "次,反面" + back + "次");
    }
}
