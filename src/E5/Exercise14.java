package E5;

/**
 * 编写一个类，拥有两个静态字符串域，其中一个在定义处初始化，另一个在静态块
 * 中初始化。现在，加入一个静态方法用以 打印出两个字段值。请证明他们都在被使
 * 用之前完成初始化动作。
 */
public class Exercise14 {
    public static void main(String[] args) {
        Test14.show();
    }
}

class Test14 {
    private static String str1 = "str1 init at define";
    private static String str2;

    static {
        str2 = "str2 init at static";
    }

    static void show() {
        System.out.println(str1);
        System.out.println(str2);
    }
}