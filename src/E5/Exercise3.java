package E5;

/**
 * 创建一个带默认构造器的类，在构造器中打印一条消息。为这个类创建一个
 * 对象
 */
public class Exercise3 {

    public static void main(String[] args) {
        Test3 test3 = new Test3();
    }
}

class Test3 {
    public Test3() {
        System.out.println("Test3 has been created");
    }
}