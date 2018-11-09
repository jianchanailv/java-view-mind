package E5;

/**
 * 编写具有两个方法的类，在第一个方法内调用第二个方法两次：第一次调用时
 * 不使用this，第二次调用时使用this
 */
public class Exercise8 {
    public static void main(String[] args) {
        Test8 test8 = new Test8();
        test8.tset2();
    }
}

class Test8 {
    private void test(String str) {
        System.out.println("test with"+ str);
    }

    void tset2() {
        test("out this");
        this.test(" this");
    }
}
