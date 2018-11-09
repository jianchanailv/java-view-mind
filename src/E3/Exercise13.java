package E3;

/**
 * 编写一个方法，他以二进制形式显示char类型的值，使用多个不同的字符来展示他
 */
public class Exercise13 {
    public static void main(String[] args) {
        show('c');
        show('b');
        show('x');
        show('2');
        show('@');
    }

    static void show(char c) {
        String result = Integer.toBinaryString(c);
        System.out.println(c + ":" + result);
    }
}
