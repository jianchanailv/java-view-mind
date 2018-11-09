package E4;

/**
 * 重复第三章中的练习10，不要用Integer.toBinaryString()方法，
 * 而是用三元操作符和按位操作符来显示二进制的1和0
 */
public class Exercise5 {
    public static void main(String[] args) {
        int i1 = 0Xaaaaaaaa;
        int i2 = 0x55555555;
        System.out.print("i1 = ");
        toBinaryString(i1);
        System.out.print("i2 = ");
        toBinaryString(i2);
        System.out.print("~i1 =  ");
        toBinaryString(~i1);
        System.out.print("~i2 = ");
        toBinaryString(~i2);
        System.out.print("i1&i1 = ");
        toBinaryString(i1 & i1);
        System.out.print("i1|i1 =  ");
        toBinaryString(i1 | i1);
        System.out.print("i1^i1 =  ");
        toBinaryString(i1 ^ i1);
        System.out.print("i1&i2 =  ");
        toBinaryString(i1 & i2);
        System.out.print("i1|i2 =  ");
        toBinaryString(i1 | i2);
        System.out.print("i1^i2 =  ");
        toBinaryString(i1 ^ i2);
    }

    private static void toBinaryString(int i) {
        int[] buffer = new int[32];
        int bufferPosition = 32;
        do {
            buffer[--bufferPosition] = ((i & 1) == 0) ? 0 : 1;
            i >>>= 1;
        } while (i != 0);
        for (int aBuffer : buffer) {
            System.out.print(aBuffer);
        }
        System.out.println();
    }
}
