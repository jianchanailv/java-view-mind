package E4;
/**
 * 写一个程序，产生25个int类型的随机数。对于每一个随机值，使用if-else语句来将其
 * 分类为大于小于或等于紧随他随机生成的值。
 */

import java.util.Random;

public class Exercise2 {

    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        int[] num = numbers.numbers();
        for (int i = 0; i < num.length - 1; i++) {
            if (num[i] < num[i + 1]) {
                System.out.println(num[i] + "小于" + num[i + 1]);
            } else if (num[i] == num[i + 1]) {
                System.out.println(num[i] + "等于" + num[i + 1]);
            } else {
                System.out.println(num[i] + "大于" + num[i + 1]);
            }
        }

    }
}

class Numbers {
    int[] numbers() {
        Random random = new Random();
        int[] num = new int[25];
        for (int i = 0; i < num.length; i++) {
            num[i] = random.nextInt(100);
        }
        return num;

    }
}
