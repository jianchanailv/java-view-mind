package E3;

/**
 * 展示用十六进制和八进制计数法来操作long值，用Long.toBinaryString()
 * 来显示结果。
 */
public class Exercise8 {
    public static void main(String[] args) {
        Long l = 0xff2L;
        System.out.println(Long.toBinaryString(l));
        Long m = 077L;
        System.out.println(Long.toBinaryString(m));
    }
}
