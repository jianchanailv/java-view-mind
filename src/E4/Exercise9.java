package E4;

/**
 * 一个斐波那契数列是由数字1、1、2、3、5、8、13、21、34等等组成的，
 * 其中每一个数字（从第三个数字起）都是前两个数字的和。创建一个方法，
 * 接收一个整数参数，并显示从第一个元素开始总共有该参数指定的个数所构成
 * 的所有斐波那契数字。
 */
public class Exercise9 {
    public static void main(String[] args) {
        fNumbers(50);
    }

    private static void fNumbers(int range) {
        int count = 0;
        Long next;
        Long first = 1L;
        Long second = 1L;
        do {
            next = first + second;
            first = second;
            second = next;
            count++;
            System.out.println(next);
        } while (count != range);
    }
}
