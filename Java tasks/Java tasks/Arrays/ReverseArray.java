package com.company;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int len =arr.length;
        int[] arr1 = new int[len];
        int temp;
        for (int i =0 ,k = len-1;i<=arr.length-1 ; i ++){
            temp = arr[i];
            arr1[k] = temp;
            k--;
        }
        for(int i =0 ; i <= len-1 ; i++)
            System.out.println(arr1[i]);
    }
}
