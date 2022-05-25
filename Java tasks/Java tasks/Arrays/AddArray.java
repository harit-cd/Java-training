package com.company;

public class AddArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,9};
        int sum=0;
        for(int i = 0 ; i<= array.length -1; i++){
            sum+=array[i];
        }
        System.out.println(sum);
    }
}
