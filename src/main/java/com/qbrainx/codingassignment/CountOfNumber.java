package com.qbrainx.codingassignment;

public class CountOfNumber {
    public static void main(String[] args) {
        int num = 1265;
        int count=0;

        while (num!=0){
            count++;
            num=num/10;
        }
        System.out.println(count);


    }
}
