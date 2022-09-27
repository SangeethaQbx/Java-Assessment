package com.qbrainx.codingassignment;

public class NumOfPairs {
    public static void main(String[] args) {

        int[] n = {10, 20, 10, 30, 20, 50};
        int count=0,pair=0;

        for (int i = 0; i < n.length;i++){
            for(int j=i;j<n.length;j++){
                if(n[i]==n[j]){
                    count++;

                }
            }if(count%2==0){
                pair++;
                count=0;
            }else count=0;
        }
        System.out.println(pair);

    }
}
