package com.bridgelabz;

public class Bubblesort {


    public void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    /* Prints the array */
    public  void display(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String[] args) {

        Bubblesort ob = new Bubblesort();
        int arr[] = {10,30,50,60,40,20 };
        ob.bubbleSort(arr);
        System.out.println("Sorted array");
        ob.display(arr);
    }
}
