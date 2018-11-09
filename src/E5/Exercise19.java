package E5;

/**
 * 写一个类，它接受一个可变参数的String数组。验证你的可以向该方法传递一个用
 * 逗号分隔的String列表，或是一个String[]。
 */
public class Exercise19 {
    public static void main(String[] args) {
        new Test19("one","two","three","four");
        new Test19(new String[]{"a","b","c"});
    }
}

class Test19 {
    Test19(String... strs) {
        for(String s:strs) {
            System.out.print(s + ",");
        }
        System.out.println();
    }
}
