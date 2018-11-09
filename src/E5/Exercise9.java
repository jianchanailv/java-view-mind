package E5;

/**
 * 编写具有两个构造器的类，并在第一个构造器中通过this调用第二个构造器
 */
public class Exercise9 {
    public static void main(String[] args) {
        Test9 test9 = new Test9(1);
    }
}

class Test9 {
    private String str;
    private int i;

    Test9(String str, int i) {
        this.str = str;
        this.i = i;
        System.out.println("str:" + str + " int:" + i);
    }

    Test9(int i) {
        this("hello", i);
        this.i = i;
    }
}
