package E3;

/**
 * 在练习5的基础上，创建一个新的Dog索引，并对其赋值为spot对象，测试用==和
 * equals()方法来比较所有引用的结果。
 */
public class Exercise6 {

    public static void main(String[] args) {
        Dog dog1 = new Dog("spot", "Ruff");
        Dog dog2;
        dog2 = dog1;
        System.out.println(dog1.equals(dog2));
        System.out.println(dog1 == dog2);


    }
}
