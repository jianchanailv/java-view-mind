package E3;

/**
 * 以一个最高有效位为1的二进制数字开始，用符号右移操作对齐进行右移
 * 直至所有二进制位都被移出为止，每移一位都要使用Integer.toBinaryString()
 * 显示结果
 */
public class Exercise11 {
    public static void main(String[] args) {
        int i = 0x1ffafbf;
        while (true) {
            i = i >>> 1;
            System.out.println(Integer.toBinaryString(i));
            if (i == 0) {
                break;
            }
        }
    }
}
