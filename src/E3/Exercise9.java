package E3;

/**
 * 分别显示用float和double指数计数法所能表示的最大和最小的数字
 */
public class Exercise9 {
    public static void main(String[] args) {
        float fMax = 0;
        float fPreMax = 0;
        while (true) {
            fMax++;
            if (fPreMax == fMax) {
                System.out.println("float最大值：" + fMax);
                break;
            }
            fPreMax = fMax;
        }

        float fMin = 0;
        float fPreMin = 0;
        while (true) {
            fMin--;
            if (fPreMin == fMin) {
                System.out.println("float最小值：" + fMin);
                break;
            }
            fPreMin = fMin;
        }
        double dMax = 1d;
        double dPreMax = 0d;
        while (true) {
            dMax += dMax;
            if (dPreMax == dMax) {
                System.out.println("double最大值" + dMax);
                break;
            }
            dPreMax = dMax;
        }
        double dMin = 1d;
        double dPreMin = 0d;
        while (true) {
            dMin += dMin;
            if (dPreMin == dMin) {
                System.out.println("double最小值" + dMin);
                break;
            }
            dPreMin = dMin;
        }
    }
}
