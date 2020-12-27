package com.hjx.core.algorithm;

import java.util.Arrays;

/**
 * @author hjxjexjia
 * @version 1.0
 * @description: TODO
 * @date 2020/12/26 22:31
 */
public class SortAlgorithm {
    public static void main(String[] args){
        int[] arr = new int[]{12,5,4,8,9,3,15};
        bubbleSort(arr);
        Arrays.stream(arr).forEach(value -> System.out.println(value));

        //归并排序
        int[] arr2 = {8, 4, 5, 7, 1, 3, 6, 2};
        int[] temp = new int[arr2.length];//辅助排序的临时数组
        mergeSort(arr2,0,arr2.length-1,temp);
        System.out.println(Arrays.toString(arr2));
    }
    /**
     * @Author hjxjexjia
     * @Description //冒泡排序算法（升序）
     * @Date 22:44 2020/12/26
     * @Param [arr]
     * @return int[]
     **/
    public static int[] bubbleSort(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {//外层循环控制排序次数
            for (int j = 0; j < len - 1 - i; j++) {//内层循环控制第一趟排序多少次
                if (arr[j] > arr[j+1]) {       // 相邻元素两两对比
                    int temp = arr[j+1];       // 元素交换
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    /**
     * @Author hjxjexjia
     * @Description //选择排序
     * @Date 22:57 2020/12/26
     * @Param [arr]
     * @return int[]
     **/
    public static int[] selectionSort(int[] arr) {
        int len = arr.length;
        int minIndex, temp;

        for (int i = 0; i < len - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < len; j++) {
                if (arr[j] < arr[minIndex]) {    // 寻找最小的数
                    minIndex = j;                // 将最小数的索引保存
                }
            }
            temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }

    /**
     * @Author hjxjexjia
     * @Description //插入排序
     * @Date 23:22 2020/12/26
     * @Param [arr]
     * @return int[]
     **/
    public static int[] insertionSort(int[] arr) {
        int len = arr.length;
        int preIndex, current;
        for (int i = 1; i < len; i++) {
            //被插入的位置（准备和前一个数进行比较）
            preIndex = i - 1;
            //插入的数
            current = arr[i];
            //如果插入的数比被插入的数小
            while (preIndex >= 0 && arr[preIndex] > current) {
                //则将arr[index]向后移动
                arr[preIndex + 1] = arr[preIndex];
                //将index向前移动
                preIndex--;
            }
            arr[preIndex + 1] = current;
        }
        return arr;
    }

    /**
     * @Author hjxjexjia
     * @Description //快速排序算法
     * @Date 9:37 2020/12/27
     * @Param [arr]
     * @return int[]
     **/
    public static int[] quickSort(int[] arr, int low, int high){
        int start = low;//从前往后比较的索引
        int end = high;//从后往前比较的索引
        int key = arr[low];//基准值
        while(end>start){
            //从后向前比较
            while (end>start && arr[end]>=key){
                end--;
                if(arr[end]<=key){
                    int temp = arr[end];
                    arr[end]=arr[start];
                    arr[start]=temp;
                }
            }
            //从前向后比较
            while (end>start && arr[start]<=key){
                start++;
                if(arr[start]>=key){
                    int temp = arr[start];
                    arr[start] = arr[end];
                    arr[end] = temp;
                }
            }
        }
        //递归左边序列：从第1个索引位置到“关键值索引-1”
        if(start>low) quickSort(arr,low,start-1);
        //递归右边序列：从“关键值索引+1”到最后一个位置
        if(end<high) quickSort(arr,end+1,high);
        return arr;
    }

    /**
     * @Author hjxjexjia
     * @Description //希尔排序
     * @Date 11:07 2020/12/27
     * @Param [arr]
     * @return int[]
     **/
    public static int[] shellSort(int[] arr){
        int dk = arr.length/3+1;
        while(dk >= 1){
            shellInsertSort(arr,dk);
            dk = dk/3+1;
        }
        return arr;
    }
    public static void shellInsertSort(int[] a, int dk){

    }

    /**
     * @Author hjxjexjia
     * @Description //归并排序算法
     * @Date 8:56 2020/12/27
     * @Param [arr]
     * @return int[]
     **/
    public static void mergeSort(int[] arr, int left, int right,int[] temp) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr,left,mid,temp);
            mergeSort(arr,mid+1,right,temp);
            merge(arr, left,mid,right,temp);
        }
    }

    /**
     *  合并
     * @param arr 原始数组
     * @param left  左边有序序列的初始索引
     * @param mid   中间索引
     * @param right 右边索引
     */
    public static void merge(int[] arr, int left, int mid,int right,int[] temp) {
        int i = left;//前半部分游标
        int j = mid + 1;//后半部分游标
        int t = 0;//临时数组索引

        while (i <= mid && j <= right) {//前后两部分都还有元素未归并
            if (arr[i] <= arr[j]) {//找到两部分中较小的元素按顺序放到临时数组中
                temp[t] = arr[i];
                t++;
                i++;
            } else {
                temp[t] = arr[j];
                t++;
                j++;
            }
        }
        while (i <= mid) {//前半部分还有元素未归并，后半部分元素都已经归并
            temp[t] = arr[i];//将前半部分剩下的元素依次放到临时数组中
            t++;
            i++;
        }
        while (j <= right) {//后半部分还有元素未归并，前半部分元素都已经归并
            temp[t] = arr[j];//将后半部分剩下的元素依次放到临时数组中
            t++;
            j++;
        }

        t = 0;//初始化临时数组游标
        int tempLeft = left;
        while (tempLeft <= right) {//将临时数组中归并好的元素放入到原数组中
            arr[tempLeft] = temp[t];
            t++;
            tempLeft++;
        }

    }

}
