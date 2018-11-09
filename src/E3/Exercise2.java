package E3;

import static net.mindview.util.Print.print;

/**
 * 创建一个包含一个float域的类，并用这个类展示别名机制
 */
public class Exercise2 {
    public static void main(String[] args) {
        Level l1 = new Level();
        Level l2 = new Level();

        l1.a = 1f;
        l2.a = 2f;
        print("l1.a="+l1.a+", l2.a="+l2.a);

        l1 = l2;
        print("l1.a="+l1.a+", l2.a="+l2.a);

        l1.a = 3f;
        print("l1.a="+l1.a+", l2.a="+l2.a);
    }

}

class Level{
    float a;
}
