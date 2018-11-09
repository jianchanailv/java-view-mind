package E5;

/**
 * 通过创建对象赋值给引用数组，从而完成前一个练习
 */
public class Exercise18 {
    public static void main(String[] args) {
        System.out.println("main()");
        Test17[] test17s = new Test17[3];
        test17s[0] = new Test17("a");
        test17s[1] = new Test17("b");
        test17s[2] = new Test17("c");
    }
}
