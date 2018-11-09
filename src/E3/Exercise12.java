package E3;

/**
 * 以一个所有位都为1的二进制数字开始，先左移他，然后用无符号右移操作符
 * 对其进行右移，直至所有二进制位都被移出为止，每移一位都要用Integer.toBinaryString()
 * 显示结果。
 */
public class Exercise12 {
    public static void main(String[] args) {
        int a = 0xfffffff;
        a = a << 1;
        System.out.println(Integer.toBinaryString(a));
        while (true) {
            a = a >>> 1;
            System.out.println(Integer.toBinaryString(a));
            if(a == 0) {
                break;
            }
        }
    }
}
