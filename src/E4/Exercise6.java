package E4;

import static net.mindview.util.Print.print;

/**
 * 修改前两个程序中的两个test()方法，让它们接收两个额外的参数begin和end，
 * 这样在测试testval时将判断它是否在begin和end之间（包括begin和end）
 * 的范围内。
 */
public class Exercise6 {
    static int test(int testval, int target, int begin, int end) {
        if(begin<end){
            if(begin<=testval && testval<=end) {
                System.out.println("testval在"+begin+"和"+end+"之间");
            }
        } else {
            if(begin>=testval && testval>=end) {
                System.out.println("testval在"+begin+"和"+end+"之间");
            }
        }

        if (testval > target) {
            return +1;
        } else if (testval < target) {
            return -1;
        } else {
            return 0;
        }

    }

    public static void main(String[] args) {
        print(test(10, 5,1,10));
        print(test(5, 10,20,0));
        print(test(5, 5,6,6));
    }
}
