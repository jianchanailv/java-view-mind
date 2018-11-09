package E5;

/**
 * 修改前一个练习程序，让两个重载方法各自接受两个类型不同的参数，但二者顺序
 * 相反，验证是否工作
 */
public class Exercise6 {
    public static void main(String[] args) {
        Dog2 dog2 = new Dog2();
        dog2.bark('c',1);
        dog2.bark(1,'c');
    }
}

class Dog2 {
    void bark(int i, char c) {
        System.out.println("baring with int:" + i + " and char:" + c);
    }

    void bark(char c, int i) {
        System.out.println("howling with char:" + c + " and int:" + i);
    }

}
