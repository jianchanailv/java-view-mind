package E5;

/**
 * 创建一个类，它包含一个在定义时就被初始化了的String域，以及一个另一个
 * 通过构造器初始化的String域。这两种方式有何差异？
 */
public class Exercise2 {
    public static void main(String[] args) {
        Test2 test2 = new Test2();
    }
}

class Test2 {
    String str = "123";

    Test2() {
        String str2 = "456";
        System.out.println("str=" + str + " str2=" + str2);
    }
}
