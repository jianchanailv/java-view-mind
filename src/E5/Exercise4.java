package E5;

/**
 * 为前一个练习中的类添加一个重载构造器，令其接受一个字符串参数，并在构造器
 * 中把自己的消息和接受的参数一起打印出来。
 */
public class Exercise4 {
    public static void main(String[] args) {
        Test4 test4 = new Test4("hello world");
    }

}

class Test4 {
    String str;

    public Test4() {
        System.out.println("Test4 has been created");
    }

    public Test4(String str) {
        this.str = str;
        System.out.println("Test4 has been created with String:" + str);
    }
}
