package E5;

/**
 * 创建一个类，他有一个接受一个String参数的构造器。在构造阶段，打印该
 * 参数。创建一个该类的对象引用数组，但是不实际取创建对象赋值给该数组，
 * 当程序运行时，请注意来自对该狗傲气的调用中的初始化消息是否打印出来。
 */
public class Exercise17 {
    public static void main(String[] args) {
        System.out.println("main()");
        Test17[] test17s = new Test17[5];
    }
}

class Test17 {
    public Test17(String str) {
        System.out.println("Test17() with str:" + str);
    }
}
