package E5;

/**
 * 创建一个String对象数组，并为每一个元素都赋值一个String。用for循环来
 * 打印该数组。
 */
public class Exercise16 {
    public static void main(String[] args) {
        String[] strings = new String[3];
        strings[0] = "one";
        strings[1] = "two";
        strings[2] = "three";
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
