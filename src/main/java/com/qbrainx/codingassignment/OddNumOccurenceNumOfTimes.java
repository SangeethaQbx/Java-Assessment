package com.qbrainx.codingassignment;

public class OddNumOccurenceNumOfTimes {

    public static void main(String[] args) {


        int[] n = {4, 7, 3, 9, 7, 1, 2, 8};
        int count = 0,evenCount=0;
        for (int i = 0; i < n.length;i++){
            for(int j = 0; j < n.length;j++) {
                if(n[i]==n[j]){
                    count++;
                }
            }if(count%2!=0){
                System.out.println("the odd occurence "+n[i]);
                count=0;
            }else System.out.println("the even occurence "+n[i]);
        }

    }
}
