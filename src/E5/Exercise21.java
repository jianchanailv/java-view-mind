package E5;

/**
 * 创建一个enum，它包含纸币中最小面值的6种类型。通过values()循环打印
 * 每一个值及其ordinal()
 */
public class Exercise21 {
    public static void main(String[] args) {
        for (Rmb rmb : Rmb.values()) {
            System.out.println(rmb + ", ordinal " + rmb.ordinal());
        }
    }
}

enum Rmb {
    HUNDRED, FIFTY, TWENTY, TEN, FIVE, ONE
}
