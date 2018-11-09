package E5;

/**
 * 创建一个使用可变参数列表而不是普哦那个的main()语法的main()。打印所
 * 产生的ars数组的所有元素，并用各种不同数量的命令行参数来测试它。
 */
public class Exercise20 {
    public static void main(String... args) {
        for(String s: args) {
            System.out.print(s + ",");
        }
        System.out.println();
    }
}
