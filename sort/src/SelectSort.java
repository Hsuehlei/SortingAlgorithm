import java.util.Arrays;

/**
 * @author Lei
 * @version 1.0
 * @date 2020/6/27 19:47
 */
public class SelectSort {

    public static void main(String[] args) {

        int[] arr = {101, 34, 119, 1, 5};
        //使用逐步推导的方式
        //第一轮
        //原始的数组：101，34，119，1
        //第一轮排序：1，34，119，101
        //算法    先简单 -> 再复杂，就是可以把一个复杂的算法，拆分成简单的问题 -> 逐步解决

        for (int i = 0; i < arr.length - 1; i++) {

            int minIndex = i;
            int min = arr[i];

            for (int j = i + 1; j < arr.length; j++) {
                //说明假定的最小值，并不是最小
                if (min > arr[j]) {
                    //重置min
                    min = arr[j];
                    //重置minIndex
                    minIndex = j;
                }
            }

            //将最小值，放在arr[0]，即交换
            if (minIndex != i) {
                arr[minIndex] = arr[i];
                arr[i] = min;
            }

            System.out.println("第" + (i + 1) + "趟排序后的数组");
            System.out.println(Arrays.toString(arr));

        }
    }
}
