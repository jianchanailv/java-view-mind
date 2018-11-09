package E3;

/**
 * 创建一个名为Dog的类，它包含两个String域：name和says。在main()方法中，
 * 创建两个Dog对象，一个名为spot（他的叫声为“ruff”），另一个名为scruffy（
 * 他的叫声为“wurf”）。然后显示它们的名字和叫声
 */
public class Exercise5 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("spot", "Ruff");
        Dog dog2 = new Dog("scruffy", "Wurf");
        dog1.says();
        dog2.says();
    }
}

class Dog {
    private String name;
    private String says;

    public Dog() {
    }

    Dog(String name, String says) {
        this.name = name;
        this.says = says;
    }

    public void says() {
        System.out.println("name:" + name + ", says:" + says);
    }

}
