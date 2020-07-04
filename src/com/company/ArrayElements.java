package com.company;

import java.util.Arrays;

public class ArrayElements {

    public static double findPoints(int n, double[] sortArrPoints) {
        return sortArrPoints[n];
    }

    public static double[] standartSort(double[] arrPoints) {
        double[] sortArrPoints = new double[arrPoints.length];
        for (int i = 0; i < sortArrPoints.length; i++) {
            sortArrPoints[i] = arrPoints[i];
        }
        Arrays.sort(sortArrPoints);
        return sortArrPoints;
    }

    public static double[] heapSort(double arr[])
    {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        for (int i=n-1; i>=0; i--)
        {
            double temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
        return arr;
    }

    static void heapify(double arr[], int n, int i)
    {
        int largest = i;
        int l = 2*i + 1;
        int r = 2*i + 2;

        if (l < n && arr[l] > arr[largest])
            largest = l;

        if (r < n && arr[r] > arr[largest])
            largest = r;

        if (largest != i)
        {
            double swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }
    }
}

