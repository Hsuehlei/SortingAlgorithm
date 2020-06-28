import java.util.Arrays;

/**
 * @author Lei
 * @version 1.0
 * @date 2020/6/27 19:11
 * @description 选择排序消耗时间的10倍左右
 */
public class BubbleSort {

    public static void main(String[] args) {
//        int[] arr = {1, 9, -1, 10, -2};
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("初始数组：");
        System.out.println(Arrays.toString(arr));

        //冒泡排序的时间复杂度 O(n^2)
        //临时变量
        int temp = 0;
        boolean flag = false;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    flag = true;
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

            System.out.println();
            System.out.println("第" + (i+1) + "趟排序后的数组");
            System.out.println(Arrays.toString(arr));

            //在一趟排序中，一次交换都没有发生过
            if (flag == false) {
                break;
            } else {
                //重置flag！！！进行下次判断
                flag = false;
            }
        }
    }
}
