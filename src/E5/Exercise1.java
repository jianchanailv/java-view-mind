package E5;

/**
 * 创建一个类，它包含一个未初始化的String引用，验证该引用被java初始化
 * 成了null
 */
public class Exercise1 {
    public static void main(String[] args) {
        Test test = new Test();
    }
}

class Test {
    private String str;

    public Test() {
        System.out.println(str);
    }
}

