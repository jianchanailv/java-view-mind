package E4;

import java.util.Random;

/**
 *修改练习2，把代码用一个while无限循环包起来，然后运行它直到用键盘中断。
 */
public class Exercise3 {
    public static void main(String[] args) {
        Random random = new Random();
        int pre = random.nextInt(1000);
        while(true) {
            int next = random.nextInt(1000);

            if (pre < next) {
                System.out.println(pre + "小于" + next);
            } else if (pre == next) {
                System.out.println(pre + "等于" + next);
            } else {
                System.out.println(pre + "大于" + next);
            }
            pre = next;
        }
    }
}
