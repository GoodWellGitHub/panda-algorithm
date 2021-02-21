package com.org.sort;

public class HeapSort {
    public static void main(String[] args) {
        int arr[] = {2, 4, 3, 5, 9, 7, 1};
        //buildHeap(arr);
        heapSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void heapSort(int[] arr) {
        //构建最大堆
        buildHeap(arr);
        exchangeValue(arr, 0, arr.length - 1);
        for (int i = arr.length - 2; i > 0; i--) {
            maxHeap(arr, 0, i);
            exchangeValue(arr, 0, i);
        }
    }

    public static void maxHeap(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int maxIndex = start;
        int leftIndex = 2 * start + 1;
        int rightIndex = 2 * start + 2;
        if (leftIndex <= end && arr[maxIndex] < arr[leftIndex]) {
            maxIndex = leftIndex;
        }
        if (rightIndex <= end && arr[maxIndex] < arr[rightIndex]) {
            maxIndex = rightIndex;
        }
        if (maxIndex == start) {
            return;
        }
        exchangeValue(arr, start, maxIndex);
        maxHeap(arr, maxIndex, end);
    }

    /**
     * 构建大根堆
     *
     * @param arr
     */
    public static void buildHeap(int[] arr) {
        int half = arr.length / 2;
        for (int i = half; i >= 0; i--) {
            maxHeapIfy(arr, i);
        }
    }

    public static void maxHeapIfy(int[] heapArr, int i) {
        int leftChild = 2 * i + 1;
        int rightChild = 2 * (i + 1);
        if (leftChild >= heapArr.length) {
            return;
        }
        int largest = i;
        if (leftChild < heapArr.length && heapArr[leftChild] > heapArr[largest]) {
            largest = leftChild;
        }
        if (rightChild < heapArr.length && heapArr[rightChild] > heapArr[largest]) {
            largest = rightChild;
        }
        if (largest == i) {
            return;
        }
        exchangeValue(heapArr, i, largest);
        maxHeapIfy(heapArr, largest);
    }

    private static void exchangeValue(int[] arr, int i, int j) {
        int value = arr[i];
        arr[i] = arr[j];
        arr[j] = value;
    }
}


