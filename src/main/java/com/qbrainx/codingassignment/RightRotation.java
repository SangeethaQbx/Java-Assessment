package com.qbrainx.codingassignment;

import java.util.Arrays;

public class RightRotation {
    public static void main(String[] args) {

        int[] arr={2,5,6,7,1,8,3};
        int n=3;
        while (n!=0) {
            int temp=arr[arr.length-1];
            for (int i = arr.length-1 ;i >0; i--) {
                arr[i]=arr[i-1];
            }arr[0]=temp;
            n--;
            }
        System.out.println(Arrays.toString(arr));
    }
}
