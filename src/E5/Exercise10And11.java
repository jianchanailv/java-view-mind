package E5;

/**
 * 编写具有finalize()方法的类，并在方法中打印消息，在main()中为该
 * 类创建一个对象。试解释这个程序的行为
 */
public class Exercise10And11 {
    public static void main(String[] args) {
        Test10 test10 = new Test10();

        // finalize()被调用的条件:
        // (1)类未被调用(置null)
        // (2)调用System.gc().
        test10 = null;
        System.gc();
    }
}

class Test10 {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Test10 was finalized");
//        super.finalize();
    }
}
