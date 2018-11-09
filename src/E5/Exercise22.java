package E5;

/**
 * 在前面的例子中，为enum写一个switch语句，对于每一个case，输出特定货币
 * 的描述。
 */
public class Exercise22 {

    public static void main(String[] args) {
        Rmb2 rmb2 = new Rmb2(Rmb.HUNDRED);
        rmb2.value();
    }
}
class Rmb2 {
    Rmb rmb;
    public Rmb2(Rmb rmb) {
        this.rmb = rmb;
    }
    void value() {
        System.out.print("这张是：");
        switch (rmb) {
            case ONE:
                System.out.println("一元");
                break;
            case FIVE:
                System.out.println("五元");
                break;
            case TEN:
                System.out.println("十元");
                break;
            case TWENTY:
                System.out.println("二十元");
                break;
            case FIFTY:
                System.out.println("五十元");
                break;
            case HUNDRED:
                System.out.println("一百元");
                break;
        }
    }

}
