package com.codewithxxx;

public class arryList {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44};
        arrayList(arr);
    }

    public static void arrayList(int arr[]) {
        for (int x = 0; x < arr.length; x++) {
            System.out.println(arr[x]);
        }
    }
}
//数组遍历