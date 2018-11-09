package E4;

/**
 * 写一个switch开关语句，为每个case打印一个消息，然后把这个switch放进
 * for循环来测试每个case。先让每个case后面都有break，测试一下；然后把
 * break删了，看看会怎样。
 */
public class Exercise8 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            switch (i) {
                case 0:
                    System.out.println(0);
//                    break;
                case 1:
                    System.out.println(1);
//                    break;
                case 2:
                    System.out.println(2);
//                    break;
                case 3:
                    System.out.println(3);
//                    break;
                case 4:
                    System.out.println(4);
//                    break;
            }
        }
    }
}
