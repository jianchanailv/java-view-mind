package E4;

import java.util.*;

/**
 * 吸血鬼数字是指位数为偶数的数字，可以由一对数字相乘二得到，而这对数字
 * 各包含乘积的一般位数的数字，其中从最初的数字中选区的数字可以任意排序。
 * 以两个0结尾的数字是不允许的，例如：
 * 1260 = 21 * 60
 * 1827 = 21 * 87
 * 2187 = 27 * 81
 */
public class Exercise10 {
    public static void main(String[] args) {
        vampireNumbers();
    }

    private static void vampireNumbers() {
        Map<Integer, String> result = new HashMap<>();
        for (int i = 10; i < 100; i++) {
            for (int j = 10; j < 100; j++) {
                int value = i * j;
                if (value / 1000 > 0 && value / 1000 < 10) {
                    if (value % 100 == 0) {
                        continue;
                    }
                    int[] array1 = sort(getNum(value));
                    int[] array2 = sort(getNum(i, j));

                    if (Arrays.equals(array1, array2)) {
                        result.put(value, i + " * " + j + " = ");
                    }
                }
            }
        }
        for (Map.Entry<Integer, String> entry : result.entrySet()) {
            System.out.println(entry.getValue() + entry.getKey());
        }
    }

    private static int[] getNum(int num) {
        int thousand = num / 1000;
        int hundred = (num - thousand * 1000) / 100;
        int ten = ((num - thousand * 1000) - hundred * 100) / 10;
        int ge = ((num - thousand * 1000) - hundred * 100) - (ten * 10);
        return new int[]{thousand, hundred, ten, ge};
    }

    private static int[] getNum(int num1, int num2) {
        int ten = num1 / 10;
        int ge = num1 - ten * 10;
        int ten2 = num2 / 10;
        int ge2 = num2 - ten2 * 10;
        return new int[]{ten, ten2, ge, ge2};
    }

    private static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
