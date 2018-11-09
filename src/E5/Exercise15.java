package E5;

/**
 * 编写一个含有字符串域的类，并采用实例初始化方式进行初始化。
 */
public class Exercise15 {
    public static void main(String[] args) {
        System.out.println("main()");
        Cats cats = new Cats();
        System.out.println("new Cats completed");
        Cats cats2 = new Cats("ben");
        System.out.println("new Cats(name) completed");
    }
}



class Cat {
    Cat(String name) {
        System.out.println("Cat("+name+")");
    }
    void show(String name) {
        System.out.println("Cat(" + name + ")");
    }
}

class Cats {
    Cat cat1;
    Cat cat2;
    {
        cat1 = new Cat("tom");
        cat2 = new Cat("jerry");
        System.out.println("cat1 and cat2 initialized");
    }

    Cats() {
        System.out.println("Cats()");
    }

    Cats(String name) {
        System.out.println("Cats(" + name + ")");
    }
}
