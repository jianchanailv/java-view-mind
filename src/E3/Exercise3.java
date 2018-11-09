package E3;

import static net.mindview.util.Print.print;

/**
 * 创建一个包含一个float域的类，并用这个类来展示方法调用时的别名机制
 */
public class Exercise3 {
    static void f(AnotherLevel y) {
        y.a = 3f;
    }

    public static void main(String[] args) {
        AnotherLevel x = new AnotherLevel();
        x.a = 1f;
        print("x.a=" + x.a);
        f(x);
        print("x.a=" + x.a);
    }
}

class AnotherLevel {
    float a;
}
