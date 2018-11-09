package E5;

/**
 * 创建一个名为Dog的类，它具有重载的bark()方法，此方法应根据不同的基本数据类型
 * 进行重载，并根据被调用的版本，打印出不同类型的狗吠（barking）、咆哮（howling）
 * 等信息。编写main()来调用不同版本的方法。
 */
public class Exercise5 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark(2);
        dog.bark("abc");
    }
}


class Dog {
    void bark(int i) {
        System.out.println("barking with Integer:" + i);
    }

    void bark(String str) {
        System.out.println("howling with String:" + str);
    }
}