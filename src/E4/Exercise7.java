package E4;

/**
 * 修改本章练习1，通过break关键字，使得程序在打印到99时退出。然后尝试
 * return来达到相同的目的。
 */
public class Exercise7 {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
            if (i == 99) {
//                break;
                return;
            }

        }
    }
}
