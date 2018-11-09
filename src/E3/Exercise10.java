package E3;

/**
 * 编写一个具有两个常量值的程序，一个具有交替的二进制位1和0，其中最低的有效位为0，
 * 另一个也具有交替的二进制位1和0，但是其最低有效位为1，取这两个值，用按位操作符
 * 以所有可能的方式结合运算他们，然后用Integer.toBinaryString()显示。
 */
public class Exercise10 {
    public static void main(String[] args) {
        int m = 0xaaaaaaaa;
        int n = 0x55555555;
        System.out.println("m&n:"+Integer.toBinaryString(m & n));
        System.out.println("m&m:"+Integer.toBinaryString(m & m));
        System.out.println("m|n:"+Integer.toBinaryString(m | n));
        System.out.println("m|m:"+Integer.toBinaryString(m | m));
        System.out.println("m^n:"+Integer.toBinaryString(m ^ n));
        System.out.println("m^m:"+Integer.toBinaryString(m ^ m));
        System.out.println("~n:"+Integer.toBinaryString(~n));
        System.out.println("~m"+Integer.toBinaryString(~m));
    }

}
